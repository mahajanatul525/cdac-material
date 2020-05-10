using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace basic1
{
 
class Employee {   
  public int age;    
  public int salary;      
  public string name; 

public double calculate()
 { double netsal;
 netsal = salary-salary*0.1;
 return netsal;
 }
}   
    

class EmployeeDemo {   

  static void Main() {   
   
 Employee emp = new Employee(); 
    
double netsal; 

    emp.age = 25;  
    emp.salary = 8500;  
    emp.name = "Raj";  
   
   
    netsal=emp.calculate();  
   
    Console.WriteLine("employee has:\n  " +  emp.age + " Name=\n  " +  emp.name+ " salary\n  " + 
                      emp.salary + " net sal\n  " +  netsal ); 

  
 Employee emp1 = new Employee(); 

    emp1.age = 20;  
    emp1.salary = 8000;  
    emp1.name = "Reena";  
   
    
    netsal = emp1.calculate(); 
   
    Console.WriteLine("Employee has:\n  " +  emp1.age + " Name=\n  " +  emp1.name+ " Salay\n  " + 
                      emp1.salary + " net sal\n  " +  netsal ); 
   
    Console.ReadKey();
        }
    }
}
