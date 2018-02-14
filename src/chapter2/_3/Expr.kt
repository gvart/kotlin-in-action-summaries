package chapter2._3

/**
 * @author Gladîș Vladlen on 2/14/18.
 */
interface Expr

class Num(val value: Int): Expr
class Sum(val left:Expr, val right:Expr): Expr