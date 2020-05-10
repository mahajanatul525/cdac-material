using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Web;

namespace _05entity.Models
{[Table("Employees")]
    public class Employee
    {
         [Column("Id")]
            public int EmployeeId { get; set; }
            public string Name { get; set; }
            public string Gender { get; set; }
            public string City { get; set; }
      

    }
}