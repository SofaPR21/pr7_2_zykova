fun main()
{
    try{
        println("введите числа: ")
        print("a = ")
        var a = readLine()!!.toDouble()
        print("b = ")
        var b = readLine()!!.toDouble()
        print("d = ")
        var d = readLine()!!.toDouble()
        print("e = ")
        var e = readLine()!!.toDouble()

        println("введите x, y: ")
        print("x = ")
        var x = readLine()!!.toDouble()
        print("e = ")
        var y = readLine()!!.toDouble()

        var c = a * x + b * y
        var f = d * x + e * y

        when(c){
            a * x + b * y -> println("c = $c")
        }

        when(f){
            d * x + e * y -> println("f = $f")
        }
    }
    catch (e: Exception){
        println("неверный формат данных")
    }
    }