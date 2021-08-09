

object Cipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

  val enc =(w:Char,x:Int,a:String)=>if(a.contains(w)) a((a.indexOf(w)+x)%a.length) else w

  val dec = (w:Char,x:Int,a:String)=>if(a.contains(w)) a((a.indexOf(w)-x)%a.length) else w

  val cipher = (algo:(Char,Int,String)=>Char,s:String,k:Int,a:String)=>s.map(algo(_,k,a))

  val x = "Gihan98"

  val y =cipher(enc,x,5,alphabet)

  println(y)

  println(cipher(dec,y,5,alphabet))
}