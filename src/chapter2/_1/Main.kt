package chapter2._1

/**
 * @author Gladîș Vladlen on 2/14/18.
 */
fun main(args: Array<String>) {
    val name = if(args.isNotEmpty()) "Bob" else "Kotlin"
    println("Hello World - $name")
    println("max 4, 5  = ${max(1, 5)}")

    //variables
    val text = "Some text there"
    val nr = 123

//    No
//    var nr2
//    nr2 = 33

    val nr2: Int
    nr2 = 123

//val - reference can't be modified but object can be

    val list = arrayListOf("Java")
    list.add("Kotlin")

}

//if return type is missed. compiler automate will find return type - type interference
fun max(a: Int, b: Int) = if(a > b) a else b