import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException

/*
Exception
 - Program 실행 중 예측이 가능한 오류들을 예외라고 칭합니다.
 - 예외가 발생하면 Code 의 수행은 중단됩니다.
 - 예외 처리는 예외가 발생했을 때 Program 이 중지되는 것을 막고 예외 발생 시
  동작해야 하는 Code 를 수행시켜 Program 이 문제 없이 동작하게 하기 위한 목적을 가지고 있습니다.
 - 예외가 발생했을 경우 Program 수행이 중단되는 것을 방지하고
  예외 발생 시 동작해야 할 Code 를 동작시켜 Program 이 정상적으로 수행될 수 있도록 하는 장치입니다.

[형식]
try {
    예외가 발생할 가능성이 있는 Code
} catch (e:) (
    예외가 발생했을 경우 동작하는 Code
) finally {
    예외 발생 여부에 관계 없이 동작하는 Code
}
 */

fun main() {

    // Exception 1
    try {
        println("a1 : 10/0")
        val a1 = 10 / 0
    } catch (e:ArithmeticException) {
        println("ArithmeticException")
        e.printStackTrace()
    }

    // Exception 2
    try {
        println("val str:String? = null")
        println("println(str!!.length)")
        val str:String? = null
        println(str!!.length)
    } catch (e:NullPointerException) {
        println("NullPointerException")
        e.printStackTrace()
    }

    // Exception 3
    try {
        println("val str2 = \"안녕하세요.\"")
        println("val a2:Int = str2.toInt()")
        val str2 = "안녕하세요."
        val a2:Int = str2.toInt()
    } catch (e:NumberFormatException) {
        println("NumberFormatException")
        e.printStackTrace()
    } catch (e:Exception) {
        println("Exception")
        e.printStackTrace()
    }

    // Exception 4
    try {
        println("val array1 = arrayOf(10, 20, 30, 40, 50)\n" +
                "        val test1 = array1[5]")
        val array1 = arrayOf(10, 20, 30, 40, 50)
        val test1 = array1[4]
        println("test1 : $test1")
    } catch (e:Exception) {
        println("Exception")
        e.printStackTrace()
    } finally {
        println("Exception End")
    }

    println("Test Code")
}



