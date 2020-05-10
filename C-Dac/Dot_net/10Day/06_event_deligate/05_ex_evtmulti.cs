// An event multicast demonstration. 
  //Like delegates, events can be multicast. This enables multiple objects to respond to an event notification
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
 
class X { 
  public void Xhandler() { 
    Console.WriteLine("Event received by X object"); 
  } 
} 
 
class Y { 
  public void Yhandler() { 
    Console.WriteLine("Event received by Y object"); 
  } 
} 
 
class EventDemo { 
  static void handler() { 
    Console.WriteLine("Event received by EventDemo"); 
  } 
 
  public static void Main() {  
    MyEvent evt = new MyEvent(); 
    X xOb = new X(); 
    Y yOb = new Y(); 
 
    // Add handlers to the event list. 
    evt.SomeEvent += new MyEventHandler(handler); 
    evt.SomeEvent += new MyEventHandler(xOb.Xhandler); 
    evt.SomeEvent += new MyEventHandler(yOb.Yhandler); 
 
    // Fire the event. 
    evt.OnSomeEvent(); 
    Console.WriteLine(); 
 
    // Remove a handler. 
    evt.SomeEvent -= new MyEventHandler(xOb.Xhandler); 
    evt.OnSomeEvent(); 
  } 
}
