using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace basic1
{
 
class Employee {   
  public int age;    // number of floors 
  public int salary;      // total square footage of building 
  public string name; // number of occupants 

public double calculate()
 { double netsal;
 netsal = salary-salary*0.1;
 return netsal;
 }
}   
   
// This class declares an object of type Building.   

class EmployeeDemo {   

  static void Main() {   
   
 Employee emp = new Employee(); // create a Building object 
    
double netsal; // area per person 
   
    // Assign values to fields in house. 

    emp.age = 25;  
    emp.salary = 8500;  
    emp.name = "Raj";  
   
    // Compute the area per person. 
    netsal=emp.calculate();  
   
    Console.WriteLine("employee has:\n  " +  emp.age + " Name=\n  " +  emp.name+ " salary\n  " + 
                      emp.salary + " net sal\n  " +  netsal ); 

  
 Employee emp1 = new Employee(); // create a Building object 
    
  
    // Assign values to fields in house. 

    emp1.age = 20;  
    emp1.salary = 8000;  
    emp1.name = "Reena";  
   
    // Compute the area per person. 
    netsal = emp1.calculate(); 
   
    Console.WriteLine("Employee has:\n  " +  emp1.age + " Name=\n  " +  emp1.name+ " Salay\n  " + 
                      emp1.salary + " net sal\n  " +  netsal ); 
   
    Console.ReadKey();
        }
    }
}
