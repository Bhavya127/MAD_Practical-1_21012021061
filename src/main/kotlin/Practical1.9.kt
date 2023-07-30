fun main(args:Array<String>)
{
    var array=Array<Int>(5){0}
    var x=0
    var largest=0

    val length:Int=array.size
    while(x<length)
    {
        println("a[$x]=")
        array[x] =readLine()!!.toInt()
        x++
    }
    println("Entered array is:")
    for(i in 0..4)
    {
        println(array[i])
    }


    for(i in 0..4)
    {
        if(array[i]>largest)
            largest=array[i]

    }
    println("Largest element=$largest")
}