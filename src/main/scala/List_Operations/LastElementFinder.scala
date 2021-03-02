//Recursive solution to find the element at the last index of a list

class LastElementFinder {

  //method to find the last element of the list
  def last(input: List[Any]): Any = input match {
    case head :: Nil => head    // When input has only one element, it divides the list in two parts with a head and empty tail.

    case _ :: tail => last(tail)    //storing list tail and recursively call for the remaning values of the list
  }
}

object main {
  def main(args: Array[String]): Unit = {
    val list = new LastElementFinder
    println("Last element of the list is: " + list.last(List(5, 9, 8, 1, 3)))
  }
}