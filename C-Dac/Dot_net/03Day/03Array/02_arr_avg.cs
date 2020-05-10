// Compute the average of a set of values. 
 
using System; 
 class Average {  
  static void Main() {  
    int[] nums = new int[10]; 
    int sum = 0; 
   int avg;
     nums[0] = 99; 
    nums[1] = 10; 
    nums[2] = 100; 
    nums[3] = 18; 
    nums[4] = 78; 
    nums[5] = 23; 
    nums[6] = 63; 
    nums[7] = 9; 
    nums[8] = 87; 
    nums[9] = 49; 
 
    for(int i=0; i < nums.Length; i++)  
      sum = sum + nums[i]; 
 
    avg = sum / nums.Length; 
 
    Console.WriteLine("Average: " + avg); 
  }  
}
