using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;



// Must reference System.Runtime.Serialization.Formatters.Soap.dll.
using System.Runtime.Serialization.Formatters.Soap;
using System.IO;

namespace SimpleSerialize
{
    #region Types to serialize


    [Serializable]
    public class employee
    {
        string name;
        int sal;
        int id;
        public employee() { }//xml require parameterless constructor
        public employee(string nm, int sal, int id)
        {
            Name = nm;
            Salary = sal;
            this.id = id;
        }

        public String Name { get { return name; } set { name = value; } }

        public int Salary
        {
            get { return sal; }
            set { sal = value; }
        }
        

    }

    #endregion

    class Program
    {
        // Be sure to import the System.Xml.Serialization
        // and System.IO namespaces.
        static void Main(string[] args)
        {
            Console.WriteLine("***** Fun with Object Serialization *****\n");
            employee e = new employee();

            employee[] myEmp = new employee[2];
            myEmp[0] = new employee("raj", 7000, 101);
            myEmp[1] = new employee("geeta", 9000, 102);



            // Save as SOAP.
            SaveAsSoapFormat(myEmp, "CarData.soap");
            string fn = "CarDaata.soap";
            LoadFromFile(fn);


            Console.ReadLine();
        }




        #region Save as SOAP
        // Be sure to import System.Runtime.Serialization.Formatters.Soap
        // and reference System.Runtime.Serialization.Formatters.Soap.dll.
        static void SaveAsSoapFormat(object objGraph, string fileName)
        {
            // Save object to a file named CarData.soap in SOAP format.
            SoapFormatter soapFormat = new SoapFormatter();

            using (Stream fStream = new FileStream(fileName,
              FileMode.Create, FileAccess.Write, FileShare.None))
            {
                soapFormat.Serialize(fStream, objGraph);
            }
            Console.WriteLine("=> Saved car in SOAP format!");
        }
        #endregion


        static void LoadFromFile(string fn)
        {

            // read object to a file named CarData.soap in SOAP format.
            SoapFormatter soapFormat = new SoapFormatter();
            using (Stream fStream = File.OpenRead(fn))
            {
                employee[] obj = (employee[])soapFormat.Deserialize(fStream);

                foreach (employee e in obj)
                    Console.WriteLine("{0}  {1}", e.Name, e.Salary);
            }

        }
    }
}
