//entry point
fun main()
{
    oddnumberdetector()
    evenNumberDetection()
}

fun evenNumberDetection()
{
    val number = 6

    if (number % 2 == 0)

    {
        print("It is an even number")
    }
    else
    {
        print("It is not an even number!")
    }
}

fun oddnumberdetector()
{
    val number = 11
    if (number % 2 !== 0)
    {
        println("This is an odd number")
    }
}