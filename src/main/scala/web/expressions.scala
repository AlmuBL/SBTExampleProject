package web

object expressions {
/*
println({
  val x = 1 + 1
  x + 3
  x
})

val addOne = (x:Int) => x+1
println(addOne(2))

val add = (x:Int, y:Int)=> x+y
println(add(1,2))

val getAnswer = () =>42
println(getAnswer())

def add2(x:Int, y:Int ):Int = x+y
println(add2(1,2))

def addThenMultiply(x:Int, y:Int)(multiplier:Int):Int =
  add2(x, y) * multiplier
println(addThenMultiply(1,2)(3))

def name:String = System.getProperty("name")
println("Hello, " + name +"!")

def getSquareString(input:Double):String = {
  val square = input * input
  square.toString
}
println(getSquareString(2.1))

class Greeter (prefix: String, sufix:String) {
  def greet(name: String): Unit =
    println(prefix + name + sufix)
}
val greeter = new Greeter("Hello, ", "!")
greeter greet("Scala developer")

case class Point(x:Int, y:Int)
val point = new Point(1,2)
val anotherPoint = new Point(1,2)
val yetAnotherPoint = new Point(2,2)
if(point == anotherPoint){
  println(point + " and " + anotherPoint +" are the same.")
}
else{
  println(point + " and " + anotherPoint +" are different.")
}
if(point == yetAnotherPoint){
  println(point + " and " + yetAnotherPoint +" are the same.")
}
else{
  println(point + " and " + yetAnotherPoint +" are different.")
}

object IdFactory{
  private var counter=0
  def create():Int = {
    counter+=1
    counter
  }
}
val newId = IdFactory.create()
println(newId)
val newerId = IdFactory.create()
println(newerId)

trait Greeter2 {
  def greet(name:String): Unit = println("Hello, "+ name+"!")
}

class DefaultGreeter extends Greeter2
class CustomizeGreeter(prefix:String, posfix:String) extends Greeter2{
  override def greet(name: String): Unit = println(prefix + name + posfix)
}
val greeterDefault = new DefaultGreeter()
greeterDefault.greet("Scala developer")
val greeterCustom = new CustomizeGreeter("How are you, ", "?")
greeterCustom.greet("Scala developer")



*/
}
