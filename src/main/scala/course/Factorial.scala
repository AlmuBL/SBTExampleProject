package course

object Factorial extends App{
 def factorial(x:Int):Int= {
   def fact(x: Int, acumulado: Int): Int = {
     if (x <= 1) acumulado
     else fact(x - 1, x * acumulado)
   }
   fact(x, 1)
 }

  def factorial2(x:Int):Int={
    if (x<=1) 1
    else {
       x * factorial2(x-1)
    }
  }
  println(factorial(3))
  println(factorial(4))
  println(factorial2(3))
  println(factorial2(4))
}


