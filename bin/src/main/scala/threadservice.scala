import java.util.concurrent._
object ExecutorServiceCreate extends App {
  val executor: ExecutorService = Executors.newFixedThreadPool(2)
  executor.execute(new Runnable { 
def run() =  println(s"""${Thread.currentThread().getName}This taks is run assuynchronously""")
  } )
  
  executor.execute(new Runnable { 
def run() =  println(s"""${Thread.currentThread().getName}This taks is run assuynchronously""")
  } )
executor.shutdown()
executor.awaitTermination(60, TimeUnit.SECONDS) //if you send this, the caller wait for thermination
}
