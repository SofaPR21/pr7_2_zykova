fun main()
{
    try{
        println("введите номер дня недели: ")
        var day = readLine()!!.toInt()
        when(day){
            1 -> println("рабочий день")
            2 -> println("рабочий день")
            3 -> println("рабочий день")
            4 -> println("рабочий день")
            5 -> println("рабочий день")
            6 -> println("выходной день")
            7 -> println("выходной день")
        }
    }
    catch (e: Exception){
        println("неверный формат данных")
    }
}