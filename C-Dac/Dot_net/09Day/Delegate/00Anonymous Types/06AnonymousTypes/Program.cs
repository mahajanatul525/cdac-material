﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AnonymousTypes
{
    class Program
    {
        static void Main(string[] args)
        {    // Make 2 anonymous classes with identical name/value pairs.
            var firstCar = new { Color = "Bright Pink", Make = "Saab", CurrentSpeed = 55 };
            var secondCar = new { Color = "Bright Pink", Make = "Saab", CurrentSpeed = 55 };

            // Are they considered equal when using Equals()?
            
                Console.WriteLine("Same anonymous object! with equals:{0} ", firstCar.Equals(secondCar));
                        // Are they considered equal when using ==?
            Console.WriteLine("Not the same anonymous objectct with ==!{0} ",firstCar == secondCar);

            // Are these objects the same underlying type?
            
                Console.WriteLine("data type is same{0}  ", firstCar.GetType().Name);

                Console.WriteLine(" {0}  ", secondCar.GetHashCode());
                Console.WriteLine(" types!{0}  ", secondCar.GetHashCode ());

            Console.ReadLine();
        }

    }
}
