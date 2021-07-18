object Q5 extends App {
  def even(n: Int): Boolean = n match {
    case 0 => true
    case _ => odd(n-1)
  }

  def odd(n: Int): Boolean = !(even(n))

  def sumev(n: Int, x: Int = 0): Int ={
    if(n == 0){
      return 0;
    }
    else{
      if(even(n)){
        return n + (sumev(n - 1))
      }
      else{
        return sumev(n - 1)
      }
    }
  }

  println(sumev(7))
}
