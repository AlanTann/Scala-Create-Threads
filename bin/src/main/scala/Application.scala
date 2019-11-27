object ThreadsCreation extends App {
  class MyThread extends Thread {
    override def run(): Unit = {
      for (i <- 0 to 10000)
        println(s"${getName} : $i"); //run method 100 times
    }
  }
    val t = new MyThread // inherit start and join method and excute run automatically
    t.start()
    t.join()
      for (i <- 0 to 10000)
        println(s"${Thread.currentThread().getName} : $i");
    
    
    //t.join() //to halt the caller , very important
    println("New thread joined")
}
