//1
fun main(args: Array<String>) {
    val lang = if (args.size == 0) "EN" else args[0]
    println(when (lang) {
        "EN" -> "Hello!"
        "FR" -> "Salut!"
        "IT" -> "Ciao"
        else -> " sorry, can't say in  $lang"
    })
}

//2
fun main(args: Array<String>) {
    val a = 3
    val b = 3L
    val c = 3f
    val d = 3.0
    val e = "Unknown"
    val f = "3"
    val g = "Long"
    val l = '3'
    println(a as Any is Int)
    println(b as Any is Long)
    println(c as Any is Float)
    println(d as Any is Double)
    println(e as Any is String)
    println(f as Any is String)
    println(g as Any is String)
    println(l as Any is Char)
}

//3
fun main(args: Array<String>) {
    val a = 3
    val b = 3L
    val c = 3f
    val d = 3.0
    val e = "Unknown"
    val f = "3"
    val g = "Long"
    val l = '3'
    println(describe(a))                     
    println(describe(b))
    println(describe(c))
    println(describe(d))
    println(describe(e))
    println(describe(f))
    println(describe(g))
    println(describe(l))

}
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
}

//4
fun main(args: Array<String>) {
    println(describe(-5))
    println(describe(4L))
    println(describe(3.0))
    println(describe("wfertykul"))
    println(describe(4))
    println(describe("Hello"))
    println(describe(1))

}

fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
}

//5
fun main(args: Array<String>) {
	println(declaration(1))
}
fun declaration(obj: Any):String{
    var a = when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }
    return a
}

//6
fun main(args:Array<String>){
val x = 9
when{
isOdd(x)->println("x is odd")
isEven(x)->println("x is even")
else->println("x is funny")
}
}

fun isOdd(x: Any):Boolean{
if(x !is Int) return false
return x%2==1
}
fun isEven(x: Any):Boolean{
if (x !is Int) return false
return x%2==1
}
//7
fun main(args: Array<String>) {
    val x = 10 
    val y = 9 
    if (x in 1..y+1) {
        println("fits in range") 
    } else {
        println("out of range")
    }
}
fun main(args: Array<String>) {
    val x = 10 /// out of range
    val y = 9
    // val x = 9  /// fits in range
    // val y = 10
    if (x in 1..y-1) {
        println("fits in range")
    } else {
        println("out of range")
      }
}

//8
fun main(args: Array<String>) {
   Cup(9)
   Cup(165)
   Cup(21)
   Cup(17)
}
fun Cup(x: Any)
{
    val validNumbers = arrayOf(1,523,165,999)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
}

//9
fun main(args: Array<String>) {

    var items = arrayOf("orange","apple")
    //проверка массива 100% нужен apple
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}
fun main(args: Array<String>) {

	var items12 = arrayOf("orange","apple")
    when {
        "apple" in items12 -> println("apple ")
        "orange" in items12 -> println("juicy is fine too")
        
    }
}

//10
fun main(args: Array<String>) {

    println(hasPrefix("array"))
}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("arr")
    else -> false
}