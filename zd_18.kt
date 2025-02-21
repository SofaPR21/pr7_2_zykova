fun main()
{
    try{
        println("введите трехзначное число: ")
        var num = readLine()!!.toDouble()
        while (num > 999 || num < -999)
        {
            println("число не соответствует условию,введите еще раз")
            num = readLine()!!.toDouble()
        }
        var a = num/100
        var b = (num % 100)/10;
        var c = num % 10

        var sum = a + b + c
        var proizv = a * b * c
        println("сумма цифр числа = $sum произведение цифр числа = $proizv")

    }
    catch (e: Exception){
        println("неверный формат данных")
    }
}