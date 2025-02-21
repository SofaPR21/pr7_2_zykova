fun main()
{
    try{
        println("введите числа (a < b, c < d): ")
        print("a = ")
        var a = readLine()!!.toDouble()
        print("b = ")
        var b = readLine()!!.toDouble()
        print("c = ")
        var c = readLine()!!.toDouble()
        print("d = ")
        var d = readLine()!!.toDouble()

        println("введите x: ")
        print("x = ")
        var x = readLine()!!.toDouble()

        while (a > b)
        {
            println("числа не соответствуют условию, введите еще раз")
            print("a = ")
            a = readLine()!!.toDouble()
            print("b = ")
            b = readLine()!!.toDouble()
        }

        while (c > d)
        {
            println("числа не соответствуют условию, введите еще раз")
            print("c = ")
            c = readLine()!!.toDouble()
            print("d = ")
            d = readLine()!!.toDouble()
        }

        when(x){
            in a..b -> println("x принадлежит отрезку [a, b]")
            in c..d -> println("x принадлежит отрезку [c, d]")
            in a..d -> println("x принадлежит общей части")
            else -> println("x не принадлежит ни одному из отрезков")
        }
    }
    catch (e: Exception){
        println("неверный формат данных")
    }
}