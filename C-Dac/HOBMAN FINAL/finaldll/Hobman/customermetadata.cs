using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using System.Web;
using System.ComponentModel;
namespace Hobman
{
    [MetadataType(typeof(customermetadata))]
    public partial class customer_details
    {
    }
   public class customermetadata
    {
       [StringLength(10, MinimumLength = 4)]
       [DisplayAttribute(Name = "Name")]
       [Required(ErrorMessage = "PLEASE ENTER YOUR NAME")]
       public String customer_name
       {
           get;
           set;
       }

       [Required(ErrorMessage = "PLEASE ENTER YOUR ADDRESS")]
       public String customer_address
       { get; set; }

       [RegularExpression("[0-9]{10}", ErrorMessage = "PLEASE ENTER 10 DIGIT NUMBER")]
       [Required(ErrorMessage = "PLEASE ENTER NUMBER")]
       public decimal contact
       { get; set; }

       [DataType(DataType.EmailAddress)]
       [Required(ErrorMessage = "PLEASE ENTER EMAIL")]
       [RegularExpression(".+\\@.+\\..+", ErrorMessage = "PLEASE ENTER VALID EMAIL")]
       public string email
       { get; set; }

       [RegularExpression("^[a-zA-z][a-zA-Z0-9]{3,14}$", ErrorMessage="PLEASE ENTER VALID PASSWORD")]
       [Required(ErrorMessage = "PLEASE ENTER PASSWORD")]
       public string customer_password
       {set;get;}
    }
}
