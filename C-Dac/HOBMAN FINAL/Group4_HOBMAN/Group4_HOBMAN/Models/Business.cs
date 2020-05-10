using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data.SqlClient;
using System.Data;
using System.Configuration;
using System.Web.Services;
using Hobman;


namespace Group4_HOBMAN.Models
{
    public class Business
    {
        public SqlConnection getcon()
        {
            //string s = ConfigurationManager.ConnectionStrings["abc"].ConnectionString;
            SqlConnection con = new SqlConnection(@"Data Source=ATUL\SQLEXPRESS;Initial Catalog=Hotelman;Integrated Security=True;Connect Timeout=15;Encrypt=False;TrustServerCertificate=False");
            return con;
            
        }
        public List<state_details> getstate()
        {
            List<state_details> ls = new List<state_details>();
            SqlConnection s1 = null;
            s1 = getcon();

            SqlDataAdapter cmd = new SqlDataAdapter("select * from state_details", s1);
            DataTable dt = new DataTable();
            cmd.Fill(dt);
            if (dt.Rows.Count > 0)
            {
                for (int i = 0; i < dt.Rows.Count; i++)
                {
                    ls.Add(new state_details
                        {
                            state_id = dt.Rows[i]["state_id"].ToString(),
                            state_name = dt.Rows[i]["state_name"].ToString()
                        });
                }
            }
            return ls;
        }
        public List<city_details> getcity(string state_id)
        {
            List<city_details> l = new List<city_details>();
            SqlConnection s1 = null;
            s1 = getcon();

            SqlDataAdapter cmd = new SqlDataAdapter("select city_id, city_name from city_details where state_id=@Id", s1);
            cmd.SelectCommand.Parameters.AddWithValue("@id", state_id);
            DataTable dt = new DataTable();
            cmd.Fill(dt);
            if (dt.Rows.Count > 0)
            {
                for (int i = 0; i < dt.Rows.Count; i++)
                {
                    l.Add(new city_details
                    {
                        city_id = dt.Rows[i]["city_id"].ToString(),
                        city_name = dt.Rows[i]["city_name"].ToString()
                    });
                }
            }
            return l;
        }
        public bool aunthlogin(staff_details s)
        {
            SqlConnection scon = getcon();
            SqlCommand scd = new SqlCommand("auth4", scon);
            scd.CommandType = CommandType.StoredProcedure;
            scd.Parameters.AddWithValue("@stfnm", SqlDbType.NVarChar).Value = s.staff_name;
            scd.Parameters.AddWithValue("@pass", SqlDbType.NVarChar).Value = s.staff_password;
            scon.Open();
            SqlDataReader s1 = scd.ExecuteReader();

            int flag = 0;
            while (s1.Read())
            {
                flag = 1;
            }
            if (flag == 1)
                return true;
            else
                return false;       
        }

        public bool custaunthlogin(customer_details s)
        {
            SqlConnection scon = getcon();
            SqlCommand scd = new SqlCommand("custauth1", scon);
            scd.CommandType = CommandType.StoredProcedure;
            scd.Parameters.AddWithValue("@custnm", SqlDbType.NVarChar).Value = s.customer_name;
            scd.Parameters.AddWithValue("@pass", SqlDbType.NVarChar).Value = s.customer_password;
            scon.Open();
            SqlDataReader s1 = scd.ExecuteReader();

            int flag = 0;
            while (s1.Read())
            {
                flag = 1;
            }
            if (flag == 1)
                return true;
            else
                return false;
        }



        public void intodatabase(customer_details c)
        {
            SqlConnection con = getcon();
            SqlCommand ad = new SqlCommand("cust2", con);
            ad.CommandType = CommandType.StoredProcedure;
            ad.Parameters.AddWithValue("@nm", SqlDbType.NVarChar).Value = c.customer_name;
            ad.Parameters.AddWithValue("@eml", SqlDbType.NVarChar).Value = c.email;
            ad.Parameters.AddWithValue("@con", SqlDbType.Decimal).Value = c.contact;
            ad.Parameters.AddWithValue("@pass", SqlDbType.NVarChar).Value = c.customer_password;
            ad.Parameters.AddWithValue("@add", SqlDbType.NVarChar).Value = c.customer_address;
            ad.Parameters.AddWithValue("@state", SqlDbType.NVarChar).Value = c.state_id;
            ad.Parameters.AddWithValue("@city", SqlDbType.NVarChar).Value = c.city_id;
           // ad.Parameters.AddWithValue("@cusid", SqlDbType.NVarChar).Value = c.customer_id;
            con.Open();
            int rows = ad.ExecuteNonQuery();
            con.Close();
        }
        public void bookingdatabase(booking_details c)
        {
            SqlConnection con = getcon();
            SqlCommand ad = new SqlCommand("book1", con);
            ad.CommandType = CommandType.StoredProcedure;
            ad.Parameters.AddWithValue("@bkdt", SqlDbType.DateTime).Value = Convert.ToDateTime(c.booking_date);
            ad.Parameters.AddWithValue("@hotid", SqlDbType.Int).Value = c.hotel_id;
            ad.Parameters.AddWithValue("@cusid", SqlDbType.Int).Value = c.customer_id;
            ad.Parameters.AddWithValue("@chkidt", SqlDbType.DateTime).Value = Convert.ToDateTime(c.check_in_date);
            ad.Parameters.AddWithValue("@chkodt", SqlDbType.DateTime).Value = Convert.ToDateTime(c.check_out_date);
            ad.Parameters.AddWithValue("@rms", SqlDbType.Int).Value = c.no_of_rooms;
            con.Open();
            int rows = ad.ExecuteNonQuery();
            con.Close();
        }

        public List<hotel_details> findHotels(string dropdownstate, string dropdowncity)
        {
            List<hotel_details> l = new List<hotel_details>();
            SqlConnection s1 = null;
            s1 = getcon();

            SqlDataAdapter cmd = new SqlDataAdapter("select * from hotel_details where state_id=@ds and city_id=@dc", s1);
            cmd.SelectCommand.Parameters.AddWithValue("@ds", dropdownstate);
            cmd.SelectCommand.Parameters.AddWithValue("@dc", dropdowncity);
            DataTable dt = new DataTable();
            cmd.Fill(dt);
            if (dt.Rows.Count > 0)
            {
                for (int i = 0; i < dt.Rows.Count; i++)
                {
                    l.Add(new hotel_details
                    {
                        hotel_id = Convert.ToInt32(dt.Rows[i]["hotel_id"]),
                        hotel_name = dt.Rows[i]["hotel_name"].ToString(),
                        hotel_address = dt.Rows[i]["hotel_address"].ToString(),
                        available_rooms = Convert.ToInt32(dt.Rows[i]["available_rooms"]),
                        booked_rooms = dt.Rows[i]["booked_rooms"].ToString(),
                        rate = Convert.ToInt32(dt.Rows[i]["rate"]),
                        state_id = dt.Rows[i]["state_id"].ToString(),
                        city_id = dt.Rows[i]["city_id"].ToString()
                    });
                }
            }
            return l;
        }

        public List<hotel_details> getHotels()
        {
            List<hotel_details> ls = new List<hotel_details>();
            SqlConnection s1 = null;
            s1 = getcon();

            SqlDataAdapter cmd = new SqlDataAdapter("select * from hotel_details", s1);
            DataTable dt = new DataTable();
            cmd.Fill(dt);
            if (dt.Rows.Count > 0)
            {
                for (int i = 0; i < dt.Rows.Count; i++)
                {
                    ls.Add(new hotel_details
                    {
                        hotel_id = Convert.ToInt32(dt.Rows[i]["hotel_id"]),
                        hotel_name = dt.Rows[i]["hotel_name"].ToString(),
                        hotel_address = dt.Rows[i]["hotel_address"].ToString(),
                        rate = Convert.ToInt32(dt.Rows[i]["rate"]),
                        available_rooms = Convert.ToInt32(dt.Rows[i]["available_rooms"]),
                        booked_rooms = (dt.Rows[i]["available_rooms"]).ToString()
                    });
                }
            }
            return ls;
        }

        public List<bill_details> getbill(int bkid)
        {
            List<bill_details> ls = new List<bill_details>();
            SqlConnection s1 = null;
            s1 = getcon();

            SqlDataAdapter cmd = new SqlDataAdapter("select * from booking_details where booking_id=@bkid", s1);
            cmd.SelectCommand.Parameters.AddWithValue("@bkid", bkid);
            DataTable dt = new DataTable();
            cmd.Fill(dt);

            if (dt.Rows.Count > 0)
            {
                for (int i = 0; i < dt.Rows.Count; i++)
                {
                    ls.Add(new bill_details()
                    {
                        hotel_id = Convert.ToInt32(dt.Rows[i]["hotel_id"]),
                        customer_id = Convert.ToInt32(dt.Rows[i]["customer_id"]),
                        no_of_rooms = Convert.ToInt32(dt.Rows[i]["no_of_rooms"]),
                        check_in_date =(dt.Rows[i]["check_in_date"]).ToString(),
                        check_out_date = (dt.Rows[i]["check_out_date"]).ToString()
                    });
                }
            }
            return ls;
        }
        public void insertbill(bill_details dd)
        {
            SqlConnection con = getcon();
            SqlCommand ad = new SqlCommand("bill", con);
            ad.CommandType = CommandType.StoredProcedure;
            ad.Parameters.AddWithValue("@bd", SqlDbType.DateTime).Value = Convert.ToDateTime(dd.bill_date);
            ad.Parameters.AddWithValue("@bookid", SqlDbType.Int).Value = dd.booking_id;
            ad.Parameters.AddWithValue("@hotelid", SqlDbType.Int).Value = dd.hotel_id;
            ad.Parameters.AddWithValue("@custid", SqlDbType.Int).Value = dd.customer_id;
            ad.Parameters.AddWithValue("@indate", SqlDbType.DateTime).Value = Convert.ToDateTime(dd.check_in_date);
            ad.Parameters.AddWithValue("@outdate", SqlDbType.DateTime).Value = Convert.ToDateTime(dd.check_out_date);
            ad.Parameters.AddWithValue("@tax", SqlDbType.Int).Value = dd.tax;
            ad.Parameters.AddWithValue("@norooms", SqlDbType.Int).Value = dd.no_of_rooms;
            ad.Parameters.AddWithValue("@rate", SqlDbType.Int).Value = dd.rate;
            ad.Parameters.AddWithValue("@total", SqlDbType.Int).Value = dd.total_amount;
            con.Open();
            int rows = ad.ExecuteNonQuery();
            con.Close();
        }
   

        public List<booking_details> bookingfromdatabase(int bkd)
        {
            SqlConnection con = getcon();
            SqlCommand ad = new SqlCommand("select * from booking_details where booking_id=@id", con);
            ad.Parameters.AddWithValue("@id", bkd);
            con.Open();
            SqlDataReader sdr = ad.ExecuteReader();

            List<booking_details> l = new List<booking_details>();
            while (sdr.Read())
            {
                booking_details db = new booking_details();
                db.booking_date =(sdr["booking_date"]).ToString();
                db.check_in_date = (sdr["check_in_date"]).ToString();
                db.check_out_date = (sdr["check_out_date"]).ToString();
                db.customer_id = Convert.ToInt32(sdr["customer_id"]);
                db.hotel_id = Convert.ToInt32(sdr["hotel_id"]);
                db.no_of_rooms = Convert.ToInt32(sdr["no_of_rooms"]);
                l.Add(db);
            }

            return l;
        }

      /*  public void cancelroom(int booking_id)
        {
            SqlConnection con = null;
            con = getcon();
            con.Open();
            SqlCommand cmd = new SqlCommand("Delete from booking_details where booking_id=@book_id", con);
            cmd.Parameters.AddWithValue("@book_id", booking_id);
            int rows = cmd.ExecuteNonQuery();
            con.Close();

        }*/


    }
}