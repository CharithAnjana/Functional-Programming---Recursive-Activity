object Q3 extends App {
  def sum(num: Int): Int ={
    if(num == 1){
      1
    }
    else{
      num + sum(num - 1)
    }
  }

  println(sum(5))
}
