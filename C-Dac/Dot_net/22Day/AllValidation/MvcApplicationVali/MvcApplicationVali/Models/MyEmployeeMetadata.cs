using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MvcApplicationVali.Models
{
    [MetadataType(typeof(MyEmployeeMetadata))]
    public partial class MyEmployee
    {    }

    public class MyEmployeeMetadata
    {
        [HiddenInput(DisplayValue = false)]
        public int Id { get; set; }

        [StringLength(10, MinimumLength = 5)]
        [DisplayAttribute(Name = "First-- Name")]
        [Required(ErrorMessage = "Please enter your name")]
        public string FirstName { get; set; }

        [DataType(DataType.EmailAddress)]
        [Required(ErrorMessage = "Please enter your email address")]
        [RegularExpression(".+\\@.+\\..+", ErrorMessage = "Please enter a valid email address")]
        public string Email { get; set; }

        [RegularExpression("[0-9]{10}",ErrorMessage = "Please enter a valid ---mobile address")]
        [Required(ErrorMessage = "Please enter your phone number")]
        public string Mobile { get; set; }

        [Required(ErrorMessage = "Please enter your website--- address")]
        [DataType(DataType.Url)]
      //  [UIHint("opennew")]
        public string Website { get; set; }

        [DataType(DataType.Currency)]
        public int? Salary { get; set; }

        [Display(Name = "Hire Date")]
        [DisplayFormat(DataFormatString = "{0:dd/MM/yyyy hh:mm:ss tt}")]
        [DataType(DataType.DateTime)]
        public DateTime? HireDate { get; set; }

        [Range(12,99)]
        [Required]
        public int Age { get; set; }
    }
}