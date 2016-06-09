
package com\capgemini\cart

import scala.io.Source
import scala.collection.mutable.MutableList

class Cart( f: String) {
  
  var input = MutableList[String] ()
  
  var in = List[String]()
 
  val lines = Source.fromFile(f).getLines()

  def getProducts() : MutableList[ String] = {
    for (line <- lines)  input += line.toString
    input
  }  
}
