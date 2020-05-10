using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hobman
{
   public class booking_details
    {
       public int booking_id
       {
           get;
           set;
       }
       public string booking_date
       {
           get;
           set;
       }
       public string check_in_date
       {
           get;
           set;
       }
       public string check_out_date
       {
           get;
           set;
       }
       public int no_of_rooms
       {
           get;
           set;
       }
       public int hotel_id
       {
           get;
           set;
       }
       public int customer_id
       {
           get;
           set;
       }
    }
}
