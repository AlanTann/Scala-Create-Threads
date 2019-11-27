import java.util.concurrent._
object ExecutorCreate extends App {
  val executor = new ForkJoinPool 
  executor.execute(new Runnable { 
def run() =  println(s"""${Thread.currentThread().getName}This taks is run assuynchronously""")
  } )
  Thread.sleep(500) //fork join pool is one of the main thread, without this, it will kill himself//once the main thread died, it died together
}
