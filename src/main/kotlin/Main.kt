fun main () {

    var number = Number (9,6)

    var letter = Letter ("Mony","Jennie")

    println(letter.name1)
    println(letter.name2)
    println(letter.combine)

    println (number.addNumbers(1,3))
    println(number.numberOne)
    println(number.numberTwo)
    println(number.data)

}

class Number {
    //inside the class is property
    var numberOne: Int = 1
    var numberTwo : Int = 2
    var data:Int=0
    constructor (number1:Int,number2:Int){
        numberOne=number1
        numberTwo=number2

    }
    init {
        data = numberOne + numberTwo
    }

    fun addNumbers (a:Int, b:Int ): Int {
        return a - b
    }


}