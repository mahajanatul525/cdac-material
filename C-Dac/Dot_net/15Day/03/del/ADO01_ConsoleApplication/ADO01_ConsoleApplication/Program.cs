﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Configuration;
namespace ADO01_ConsoleApplication
{    public class Productdetail
    {  public int ID { get; set; }
        public string Name { get; set; }
        public double Price { get; set; }
        public int Qty { get; set; }
    }
    public class Productlayer
    {   public List<Productdetail> Products
        {  get
            {string  connectionString = ConfigurationManager.ConnectionStrings["DatabaseConnectionString"].ConnectionString;
                List<Productdetail> products = new List<Productdetail>();
                using (SqlConnection con = new SqlConnection(connectionString))
                {   // Pass the connection to the command object, so the command object knows on which
                    // connection to execute the command
                    SqlCommand cmd = new SqlCommand("Select * from Product", con);
                    // Open the connection. Otherwise you get a runtime error. An open connection is
                    // required to execute the command
                    Console.WriteLine("connected");
                    con.Open();
                    SqlDataReader rdr = cmd.ExecuteReader(); //returns object of sqldatareder
                    while (rdr.Read())
                    {
                        Productdetail pd = new Productdetail();
                        pd.ID = rdr["Id"];
                        pd.Name = rdr["Name"].ToString();
                        pd.Price = Convert.ToDouble(rdr["Price"]);
                        pd.Qty = Convert.ToInt32(rdr["Qty"]);
                        products.Add(pd);
                    }
                    return products;
                }
            }
        }
    }
        public class Program
        {     static void Main(string[] args)
            {    Productlayer el = new Productlayer();
                 foreach (var x in el.Products)
                {  Console.WriteLine("{0} {1}   {2}   {3}", x.ID, x.Name, x.Price, x.Qty);

                }
                Console.ReadLine();
            }
        }
    }
