/* //3
fun main(args: Array<String>) {
var num = 123
println(counter(num))
println(fullStr(num))    
}

fun counter(a:Int):Int{
val str = "$a см."
return str.length
}

fun fullStr(a:Int):String{
val str = "$a см."
return str
}

//4
fun main(args: Array<String>) { 
val num = 123 
println(counter(num)) 
println(fullStr(num)) 
} 
fun counter(a:Int)= "$a sm.".length 
fun fullStr(a:Int):String{ 
val str = "$a sm." 
return str 
} 

//6 
fun main(args: Array<String>) {
if (args.size == 0){
        println("Please provide a name as a command-line argument")         
} 
}

//7 
fun main(args: Array<String>) {
var i = 0 
    while(i <args.size){
println("hello, ${i}" + args[i])
        i++
    }
} 

//8
fun main(args: Array<String>) {
    println("Имя: ${args[0]}")
    println("Отчество: ${args[1]}")
    println("Фамилия: ${args[2]}")
} 

//9
fun main(args: Array<String>) {
    var a = args[0].toInt()
    var b = args[1].toInt()
println("perv slag: $a")
println("vtor slag: $b")
println("sum: " + (a+b))
} 

//10
fun main(args: Array<String>) {
    var i=0    
    while(i<args.size){
        println("hello:  " + args[i] + "!")
}
} 

//    14
fun main(args: Array<String>){
for (index in args.indices) {
println("item at ${index} is ${args[index]}")
        }
} 

//15
fun main(args: Array<String>){
var i = 0 
    while(i <args.size){
println("item at ${i}" + args[i]}")
        i++
    }
} */