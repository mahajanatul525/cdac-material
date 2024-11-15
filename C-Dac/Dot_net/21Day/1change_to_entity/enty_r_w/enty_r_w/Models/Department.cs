﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace enty_r_w.Models
{   
    [MetadataType(typeof(DepartmentMetaData))]
    public partial class Department
    {    }

    public class DepartmentMetaData
    {      [Display(Name = "Department Name")]
        public string Name { get; set; }
    }
}