package chapter2._3

import chapter2._3.Color.*

/**
 * @author Gladîș Vladlen on 2/14/18.
 */

fun main(args: Array<String>) {
    println(getMnemonic(RED))
}

fun getMnemonic(color :Color) =
        when(color) {
            RED -> "a"
            ORANGE -> "b"
            YELLOW -> "c"
            GREEN -> "d"
            BLUE -> "e"
            INDIGO -> "f"
            VIOLET -> "g"
        }

fun getWarmth(color: Color) =
        when(color) {
            RED,ORANGE,YELLOW  -> "a"
            GREEN -> "d"
            BLUE -> "e"
            INDIGO -> "f"
            VIOLET -> "g"
        }