using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication19
{
    class Employee
    {    static int id=1;
        string _name;
        double _salary;
        int _aid;

        public Employee(string nm, int sal)
        {
            if (id <= 3)
            {
                _aid = id++;
                _name = nm;
                _salary = sal;
            }
            else
            throw new MyException("Capacity full");
        }
        public override string ToString()
        {
            return String.Format("{0} {1} {2}",_aid,_name,_salary);
        }

    }
}
