import scala.concurrent._
object ExecutionContextGlobals extends App {
  
  
  //why two bracket??
  def execute(num:Int)(body: (Int)=>Unit) = ExecutionContext.global.execute( new Runnable {def run() = body(num)})
 
 // execute {println(s"${Thread.currentThread().getName}: hello world")
    
    
  //}
//  for (i <- 0 until 32) execute {
//    Thread.sleep(2000) //every 2 second 4 task if the computer have 4 core 
//    println(s"Task $i completed") //computer have 4 core, 8 second able to finnish 32 task, every task 2 second 
//  }
//  Thread.sleep(16000)
  
  
  //exxegute is slower than main thread
  var a = 10
  
  execute(a) {
    x =>
    var b = x
    println(s"a is $b")
    a = 20
  }
  
  a = 15
  
  execute(a){
    y =>
    var c = y
    println(s"a IS $c")
    a = 40
  }
  
  println(a)
  Thread.sleep(500)

}

