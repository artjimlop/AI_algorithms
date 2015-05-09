/**
 * Created by Lehder on 09/05/2015.
 */
object Algorithm {
  var opened: List[String] = List()
  var closed: List[String] = List()
  var finalState: String = new String()

  def main(args: Array[String]) {
    val people: List[String] = List("Allanah","Starr", "Kylie", "Worthy", "Nuha")
    finalState = "Nuha"
    println(applyDepthFirstSearchAlgorithm(people))
  }

  def applyDepthFirstSearchAlgorithm (receivedOpenedList: List[String]): String = {
    opened = receivedOpenedList
    val actual: String = opened(0)
    val newOpened = opened.filter(_ != actual)
    closed + actual
    initializeAlgorithm(actual, newOpened)
  }

  def initializeAlgorithm(node: String ,opened: List[String]): String = {
    if (isActualNodeAFinalState(node)) {
      return node
    } else {
      keepSearching(opened)
    }
  }

  def keepSearching(opened: List[String]): String ={
    if(opened.length > 0){
      applyDepthFirstSearchAlgorithm(opened)
    }else{
      return "Nothing found"
    }
  }

  def isActualNodeAFinalState(node: String): Boolean = {
    if (node == finalState) {
      return true
    } else {
      return false
    }
  }
}
