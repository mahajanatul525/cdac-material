// A very simple event demonstration. 
using System; 
// Declare a delegate for an event.  
delegate void MyEventHandler(); 

// Declare an event class. 
class MyEvent { 
  public event MyEventHandler SomeEvent; 

  // This is called to fire the event. 
  public void OnSomeEvent() { 
    if(SomeEvent != null) 
      SomeEvent(); 
  } 
} 
 
class EventDemo { 
  // An event handler. 
  static void handler() { 
    Console.WriteLine("Event occurred"); 
  } 
 
  public static void Main() {  
    MyEvent evt = new MyEvent(); 
 
    // Add handler() to the event list. 
    evt.SomeEvent += new MyEventHandler(handler);

    Console.ReadLine();
    // Fire the event. 
    evt.OnSomeEvent(); 
  } 
} 

