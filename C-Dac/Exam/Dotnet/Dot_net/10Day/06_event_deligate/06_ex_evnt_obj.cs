/* Individual objects receive notifications when instance 
   event handlers are used. */ 
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
  int id; 
 
  public X(int x) { id = x; } 
 
  // This is an instance method that will be used as an event handler. 
  public void Xhandler() { 
    Console.WriteLine("Event received by object " + id); 
  } 
} 
 
class EventDemo { 
  public static void Main() {  
    MyEvent evt = new MyEvent(); 
    X o1 = new X(1); 
    X o2 = new X(2); 
    X o3 = new X(3); 
 
    evt.SomeEvent += new MyEventHandler(o1.Xhandler); 
    evt.SomeEvent += new MyEventHandler(o2.Xhandler); 
    evt.SomeEvent += new MyEventHandler(o3.Xhandler); 
 
    // Fire the event. 
    evt.OnSomeEvent(); 
  } 
}