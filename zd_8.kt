fun main()
{
    try{
        println("введите два числа: ")
        print("a = ")
        var a = readLine()!!.toDouble()
        print("b = ")
        var b = readLine()!!.toDouble()

        when{
            a < b -> a = 0.0
            a == b -> a = 0.0
        }
        println("a = $a  b = $b")
    }
    catch (e: Exception){
        println("неверный формат данных")
    }
}