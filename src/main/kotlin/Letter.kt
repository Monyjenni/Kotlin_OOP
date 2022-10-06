class Letter(nameOne: String, nameTwo: String) {
    var name1: String = nameOne
    var name2: String = nameTwo
    var combine:String = ""

    init{
        combine = name1 + name2
    }
    fun addNames (nameOne:String,nameTwo:String):String{
        return nameOne + nameTwo
    }

}