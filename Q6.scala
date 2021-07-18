object Q6 extends App {
  def fbnci(num: Int): Int = num match {
    case 0 => 0
    case num if(num == 1) => 1
    case _ => fbnci(num - 1) + fbnci(num - 2)
  }
   def fbncilist(num: Int): Unit ={
     if(num >= 0){
       fbncilist(num - 1)
       println(fbnci(num))
     }

   }

  fbncilist(10)
}
