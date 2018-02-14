package chapter2._2.shape

import java.util.Random

/**
 * @author Gladîș Vladlen on 2/14/18.
 */
class Rectangle(val heigth: Int, val width: Int) {
    val isSquare: Boolean
        get() = heigth == width
}

fun createRandomRectangle(): Rectangle {
    val rand = Random()
    return Rectangle(rand.nextInt(), rand.nextInt());
}