package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {
  def main(): Unit = {
    println("u4bi")
    jQuery(setupUI _)
  }
  
  def setupUI(): Unit = {
    jQuery("""<button type="button">Click me!</button>""")
   .click(addClickedMessage _)
   .appendTo(jQuery("body"))

    jQuery("body").append("<p>Hello World</p>")
  }

  
}
