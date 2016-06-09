
package com.capgemini.cart


/* Cart content is read from an external file, 1 line per product. 
 * Done in the Cart class. Here is the content of the sample file:
 * 
 * apple
 * apple
 * orange
 * apple
 */

object mainObject extends App {

  println( "\nShopping Cart Pricing exercise:\n")

  val register = new Pricing("C:\\Cart.txt") 
  
  println( "\nFor your shopping cart your bill is: " + register.priceSimple + " (no offers).\n")
  
  println( "For your shopping cart your bill is: "   + register.priceOffers + " (with offers).\n")
  
}
