
package com\capgemini\cart

class Pricing( filename: String) {
  
  val cart  = new Cart( filename)
  
  val rules = new Rules
  
  // Prices - can also be read from a file like the Cart
  val priceMap: Map[String, Double] = Map(  ("apple", 0.60),  ("orange", 0.25) )
  
  val products = cart.getProducts()

  def priceSimple : Double = {
    println( "Your cart contains: " + products + "\n")
    println( "Individual prices are " + priceMap + "\n")
    products.map( x =>	priceMap.getOrElse(x, 0.0) ).foldLeft(0.0)(_+_)
  }

  def priceOffers : Double = {
    val products = cart.getProducts()
    
    val apples  = products.count { x => x == "apple" }
    val oranges = products.count { x => x == "orange" }
    
    val pr = rules.buy1Get1(apples, priceMap.getOrElse("apple", 0.0)) + rules.three42(oranges, priceMap.getOrElse("orange",0.0))  
    pr
  }

}
