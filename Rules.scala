
package com.capgemini.cart

/*
 * It would be better to implement via the Scala Rule Engine
 * but not sure I am supposed to use it here ...
 */

class Rules {

  // Offer Rules
  
  def buy1Get1(itemsCnt: Int, costSingle: Double): Double = 
      ( itemsCnt/ 2 + itemsCnt% 2 )   * costSingle
                                                  
  def three42( itemsCnt: Int, costSingle: Double): Double = 
      (2 * (itemsCnt/3) + (itemsCnt %3) ) * costSingle                                            
}
