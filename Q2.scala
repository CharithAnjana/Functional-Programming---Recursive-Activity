object Q2 extends App {
  def GDC(a: Int, b:Int): Int = b match {
    case x if x == 0 => a
    case x if x > a => GDC(x, a)
    case _ => GDC(b, a % b)
  }


  def Prime(n: Int, i: Int = 2): Boolean = i match {
    case x if(x == n) => true
    case x if GDC(n, x)>1 => false
    case x => Prime(n, i+1)
  }

  def PrimeSeq(n: Int): Unit = {
    if(n > 2){
      PrimeSeq(n -1)
    }
    if(Prime(n)){
      println(n)
    }
  }


  PrimeSeq(10)
}
