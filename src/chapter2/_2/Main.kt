package chapter2._2

import chapter2._2.shape.Rectangle
import chapter2._2.shape.createRandomRectangle

/**
 * @author Gladîș Vladlen on 2/14/18.
 */
fun main(args: Array<String>) {
    val person = Person("Singer", true)

    println(person.isMarried)

    person.isMarried = false

    println(person.isMarried)


    val figure = Rectangle(3, 3)
    println(figure.isSquare)


    println(createRandomRectangle().isSquare)
    println(createRandomRectangle().isSquare)
    println(createRandomRectangle().isSquare)

}