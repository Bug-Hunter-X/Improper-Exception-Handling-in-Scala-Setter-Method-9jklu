```scala
class MyClass(val name: String) {
  private var _value: Int = 0

  def value: Int = _value

  def value_=(newValue: Int): Unit = {
    try {
      if (newValue < 0) {
        throw new IllegalArgumentException("Value cannot be negative")
      }
      //Simulate potential exception during the setter
      val result = someOperation(newValue) 
      _value = result 
    } catch {
      case e: IllegalArgumentException => println(e.getMessage)
      case e: Exception => println(s"An unexpected error occurred: "+ e.getMessage)
    }
  }

  def someOperation(newValue: Int):Int = {
    if(newValue == 10) throw new Exception("Simulated Error")
    newValue
  }
}

object Main extends App {
  val myObject = new MyClass("My Object")
  myObject.value = 10
  println(myObject.value)
  myObject.value = 15
  println(myObject.value)
  try {
    myObject.value = -5
  } catch {
    case e: IllegalArgumentException => println(e.getMessage)
  }
  myObject.value = 10 //test the simulated error
  println(myObject.value)  
}
```