object Q4 extends App {
  def even(n: Int): Boolean = n match {
    case 0 => true
    case _ => odd(n-1)
  }

  def odd(n: Int): Boolean = !(even(n))

  def eod(n: Int): Unit ={
    if(even(n)){
      println("Even")
    }
    else{
      println("Odd")
    }
  }

  eod(7)
  eod(8)
}
