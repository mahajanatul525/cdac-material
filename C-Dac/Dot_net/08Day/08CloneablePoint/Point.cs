﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CloneablePoint
{
    // The Point now supports "clone-ability."
    public class Point : ICloneable
    {   public int X { get; set; }
        public int Y { get; set; }
     public PointDescription desc = new PointDescription();
        public Point( int xPos, int yPos, string petName )
        {       X = xPos; Y = yPos;
            desc.PetName = petName;
        }      // Override Object.ToString().
        public override string ToString()
        { return string.Format("X = {0}; Y = {1}; Name = {2};\n",
            X, Y, desc.PetName);
        }
       // Return a copy of the current object.
        // Now we need to adjust for the PointDescription member.
        public object Clone()
        {    // First get a shallow copy.
            Point newPoint = (Point)this.MemberwiseClone();
            // Then fill in the gaps.
     PointDescription currentDesc = new PointDescription();
           currentDesc.PetName = this.desc.PetName;
            newPoint.desc = currentDesc;
            return newPoint;
            }
    }
}
