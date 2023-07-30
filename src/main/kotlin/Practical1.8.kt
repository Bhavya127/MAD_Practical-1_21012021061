import java.util.*
fun main(args:Array<String>) {
    var array = Array<Int>(5) { 0 }
    var x = 0
    var largest = 0

    val length: Int = array.size
    while (x < length) {
        println("a[$x]=")
        array[x] = readLine()!!.toInt()
        x++
    }
    println("Entered array is:")
    for (i in 0..4) {
        println(array[i])
    }
    array.sort()
    println("Sorted array using inbuilt function is:${Arrays.toString(array)}")

    var temp=0
    for (i in 0..4)
    {
        for(j in i+1..4)
        {
            if (array[i] > array[j])
            {
                temp = array[i]
                array[i] = array[j]
                array[j] = temp

            }
        }

    }
    for (i in 0..4) {
        println(array[i])
    }
    }

