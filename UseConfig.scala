package myproject

object UseConfig {
  def main(args: Array[String]) = {
    import com.twitter.util.Eval
    import java.io.File

    val eval = new Eval
    val config = eval[MyConfig](new File("config/config.scala"))
    println("name: %s, number: %d".format(config.name, config.number))
  }
}