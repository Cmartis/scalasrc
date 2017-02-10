/*
 * Copyright (C) 2007-2016 Artima, Inc. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Example code from:
 *
 * Programming in Scala, Third Edition
 * by Martin Odersky, Lex Spoon, Bill Venners
 *
 * http://booksites.artima.com/programming_in_scala_3ed
 */

object Ex5 {
  // easy access to Fruit
  import bobsdelights.Fruit
  
  // easy access to all members of bobsdelights
  import bobsdelights._
  
  // easy access to all members of Fruits
  import bobsdelights.Fruits._
  def showFruit(fruit: Fruit) = {
    import fruit._
    println(name + "s are " + color)
  }

  def main(args: Array[String]) {
    println("Apple [" + Apple + "]")
    showFruit(Fruits.Apple)
  }
}
