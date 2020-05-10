using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

namespace Businesslayer
{
   public class Employeelayer
   {
       public void AddEmmployee(Employee employee)
       {
           string connectionString =
                   ConfigurationManager.ConnectionStrings["DBCS"].ConnectionString;

           using (SqlConnection con = new SqlConnection(connectionString))
           {
               SqlCommand cmd = new SqlCommand("spAddEmployee", con);
               cmd.CommandType = CommandType.StoredProcedure;

               SqlParameter paramName = new SqlParameter();
               paramName.ParameterName = "@Name";
               paramName.Value = employee.Name;
               cmd.Parameters.Add(paramName);

               SqlParameter paramGender = new SqlParameter();
               paramGender.ParameterName = "@Gender";
               paramGender.Value = employee.Gender;
               cmd.Parameters.Add(paramGender);

               SqlParameter paramCity = new SqlParameter();
               paramCity.ParameterName = "@City";
               paramCity.Value = employee.City;
               cmd.Parameters.Add(paramCity);

              con.Open();
               cmd.ExecuteNonQuery();
           }
       }
        public IEnumerable<Employee> Employees
        {
            get
            {
                string connectionString =ConfigurationManager.ConnectionStrings["DBCS"].ConnectionString;

                List<Employee> employees = new List<Employee>();

                using (SqlConnection con = new SqlConnection(connectionString))
                {
                    SqlCommand cmd = new SqlCommand("spGetEmployee", con);
                    cmd.CommandType = CommandType.StoredProcedure;
                    con.Open();
                    SqlDataReader rdr = cmd.ExecuteReader();
                    while (rdr.Read())
                    {
                        Employee employee = new Employee();
                       // employee.ID = Convert.ToInt32(rdr["EmployeeId"]);
                        employee.Name = rdr["Name"].ToString();
                        employee.Gender = rdr["Gender"].ToString();
                        employee.City = rdr["City"].ToString();
                      
                        employees.Add(employee);
                    }
                }

                return employees;
            }
        }
    }
}

    

