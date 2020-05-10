using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Radio_ex.Models
{
    public class Emp
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public int Age { get; set; }
        
    }
    public class company
    {
        public string selectedId { get; set; }
        public List<Emp> GetEmp
        {
            get
            {
                List<Emp> db = new List<Emp> { new Emp { Id = 1, Name = "raj", Age = 22 }, 
             new Emp { Id = 2, Name = "kee", Age = 33 } };


                return db;
            }
        }
    }
}