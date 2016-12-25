package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {
  def main(): Unit = {
    println("u4bi")
    jQuery("body").append("<p>[message]</p>")
  }
}
