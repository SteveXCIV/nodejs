package io.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * The DOMError interface describes an error object that contains an error name.
  * @see [[https://developer.mozilla.org/en-US/docs/Web/API/DOMError]]
  * @author lawrence.daniels@gmail.com
  */
@js.native
@JSGlobal("DOMError")
class DOMError extends js.Object {

  /**
    * Returns a DOMString representing one of the error type names (see below).
    */
  def name: String = js.native

}
