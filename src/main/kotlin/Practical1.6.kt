fun add(num1:Int,num2:Int):Int {

    return num1+num2
}
fun main()
{
    println("Enter first no:")
    var a=readln()!!.toInt()
    println("Enter second no:")
    var b=readln()!!.toInt()

    val sum=add(a,b)
    println("Sum of two numbers is:$sum")



}