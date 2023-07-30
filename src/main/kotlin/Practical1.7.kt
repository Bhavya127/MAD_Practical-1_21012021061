fun factorial(num1:Int):Int{
    if(num1==0)
        return(1)
    else
        return(num1*factorial(num1-1))
}
fun main()
{
    println("Enter the number you want to find factorial of:")
    var a=readln()!!.toInt()
    val f=factorial(a)
    println("The factorial of number is:$f")
}