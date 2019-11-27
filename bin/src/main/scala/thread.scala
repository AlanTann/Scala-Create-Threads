object ThreadsCreations extends App {
    def thread(body: =>Unit): Thread = {
      
      //further initialize thread method
      val t = new Thread {
          override def run() = body  //override run with the body
      }
      t.start()
      return t  //return the thread
  }
    
    //deterministic, sequentially
    
   val t = thread{println(s"${Thread.currentThread().getName} say hello")} //this is function
   t.join()
   
   val t2 = thread{println(s"${Thread.currentThread().getName} say hello")} //this is function
   
   t2.join()
}