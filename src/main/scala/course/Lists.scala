package course

object Lists extends App {
  val frutasList = List("uva","naranja", "plátano", "vainilla")

  println(frutasList.apply(1))
  println(frutasList.map(x => x.toUpperCase))
  println(frutasList.max)
  def fun(x:String) = List(x.toUpperCase(), x+"2")
  println(frutasList.map(s => fun(s)))

  val l = List(1,2,3,4,5)
  println(l.map(x => x*2))

  def f(x:Int) = if (x>2) Some(x) else None
  println(l.map(x => f(x)))
  println(l.flatMap(x => f(x)))

  def g(v:Int) = List(v-1, v, v+1)
  println(l.map(x => g(x)))
  println(l.flatMap(x => g(x)))

  val m = Map(1 -> 2, 2 -> 4, 3 ->6)
  println(m.toList)
  println(m.mapValues(v => v*2))
  println(m.mapValues(v => f(v)))
  //println(m.flatMap(e => e._2))

  val t = (1,2)
  println(t._1)
  println(t._2)


}

