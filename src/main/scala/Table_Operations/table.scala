//Iterative method to find table of list elements

class table {

  //method to write multiplication table
  def writeTable(multiplication_table : List[Int]) = {

    //using iteration to find table of every list element from 0 index
    for (element <- multiplication_table) {
      println("Table of " + element)

      //using iteration to print table upto 10
      for (number <- 1 to 10) {
        print((number * element) + " ")
      }
      println(" ")
    }
  }
}

object tableMain {
  def main (args: Array[String]): Unit = {
    val Table = new table
    Table.writeTable(List(5, 9, 4, 7, 2, 3))
  }
}