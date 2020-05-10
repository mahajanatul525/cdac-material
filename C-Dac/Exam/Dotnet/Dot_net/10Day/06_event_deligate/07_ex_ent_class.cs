/* A class receives the notification when  
   a static method is used as an event handler. */ 
  
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
 
  /* This is a static method that will be used as 
     an event handler. */ 
  public static void Xhandler() { 
    Console.WriteLine("Event received by class."); 
  } 
} 
 
class EventDemo { 
  public static void Main() {  
    MyEvent evt = new MyEvent(); 
 
    evt.SomeEvent += new MyEventHandler(X.Xhandler); 
 
    // Fire the event. 
    evt.OnSomeEvent(); 
  } 
}
