package web

object CaseClasses extends App{
  case class Message(sender: String, recipient: String, body: String)
  val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")
  val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
  val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
  val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")


  println(message1.sender)

  //Comparison
  val messagesAreTheSame = message2 == message3
  println("Comparison: " + messagesAreTheSame)

  //Copying
  val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")
  println("Copying: " + message5.sender + " " + message5.recipient + " " +  message5.body)

}

