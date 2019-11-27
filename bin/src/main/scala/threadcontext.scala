import scala.concurrent._
object ExecutionContextGlobal extends App {
  val ectx = ExecutionContext.global //use the default number
  ectx.execute(new Runnable {
    def run() = println("Running on the execution context")
  })
  Thread.sleep(500) //once the main thread died, it dieds
}
