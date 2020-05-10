using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;

namespace Hobman
{
    [MetadataType(typeof(StaffMetaData))]
    public partial class staff_details
    { 
    }

    public class StaffMetaData
    {
        [StringLength(10,MinimumLength=4)]
        [DisplayAttribute(Name="Name")]
        [Required(ErrorMessage="PLEASE ENTER YOUR NAME")]
        public string staff_name
        { get; set; }

        [RegularExpression("^[a-zA-z][a-zA-Z0-9]{3,14}$", ErrorMessage = "PLEASE ENTER VALID PASSWORD")]
        [Required(ErrorMessage = "PLEASE ENTER PASSWORD")]
        public string staff_password
        { set; get; }

        
    }
}
