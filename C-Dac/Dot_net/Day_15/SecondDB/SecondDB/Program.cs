using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Configuration;

namespace SecondDB
{
    class employee 
    {
        public int Id { set; get; }
        public int Salary { get; set; }
        public string Name { get; set; }
    }

    class BuisnessLayer
    {
     //   string str5 = ConfigurationManager.ConnectionStrings["NikCon"].ConnectionString;
      //  SqlConnection con5;
       // public SqlConnection Getconn { get { con5 = new SqlConnection(str5); return con5; } }

        public List<employee> GetEmployees 
        {
            get 
            {
                List<employee> mylist=new List<employee>();
                string ConnectionString = @"Data Source=ANIMUS\SQLEXPRESS;Initial Catalog=Nikdb;Integrated Security=True;Connect Timeout=15;Encrypt=False;TrustServerCertificate=False";
                
               
                using(SqlConnection con=new SqlConnection(ConnectionString))
                {

                    SqlCommand cmd = new SqlCommand();
                    cmd.CommandText = "select * from employee";
                    cmd.Connection = con;

                    con.Open();
                    
                    SqlDataReader rd = cmd.ExecuteReader();
                    while(rd.Read())
                    {
                        employee e = new employee();
                        e.Id = Convert.ToInt32(rd["Id"]);
                        e.Name = rd[1].ToString();
                        e.Salary = (int)rd["Salary"];

                        mylist.Add(e);
                    }


                }

                return mylist;
            }
        }

//______________________________________________________________________________________

        public int RowUpdate 
        {
            get 
            {
                int rowcount=0;

                string str1 = ConfigurationManager.ConnectionStrings["NikCon"].ConnectionString;

                using(SqlConnection conn=new SqlConnection(str1))
                {
                    SqlCommand cmd = new SqlCommand("insert into employee values(6,'Vrushabh',6500)",conn);
                    conn.OpenAsync();
                    rowcount= cmd.ExecuteNonQuery();
                }
                

                return rowcount;
            }
        }
//____________________________________________________________________________________

        public int AvgOfSalary 
        {
            get 
            {
                int avgSalary=0;
                  string str1 = ConfigurationManager.ConnectionStrings["NikCon"].ConnectionString;
                  SqlConnection conn = new SqlConnection(str1);

                SqlCommand cmd = new SqlCommand();
                cmd.CommandText = "select avg(Salary) from employee";
                cmd.Connection = conn;

                conn.Open();

               avgSalary= (int)cmd.ExecuteScalar();
                return avgSalary;
            }
        }
//_____________________________________________________________________________________

        public void NameStartWith(string s) 
        {
            string scon = ConfigurationManager.ConnectionStrings["NikCon"].ConnectionString;
            SqlConnection conn = new SqlConnection(scon);
            conn.Open();
            SqlCommand cmd = new SqlCommand("select * from employee where name like @replacethis",conn);
            cmd.Parameters.AddWithValue("@replacethis",s+"%");
           
            SqlDataReader rd=cmd.ExecuteReader();
            while(rd.Read())
            {
                Console.WriteLine("{0}{1}{2}", rd[0], rd[1], rd[2]);
            }

        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            BuisnessLayer bl = new BuisnessLayer();
            List<employee> newlist = bl.GetEmployees;

            foreach (var k in newlist) 
            {
                Console.WriteLine("{0}"+" "+"{1}"+" "+"{2}",k.Id,k.Name,k.Salary);
            }

   //         Console.WriteLine("The Rows Updated:-{0}",bl.RowUpdate);

            int sal = bl.AvgOfSalary;
            Console.WriteLine("Average Salary:-{0}", sal);

            bl.NameStartWith("S");
        }
    }
}
