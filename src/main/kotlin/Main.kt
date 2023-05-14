import java.util.*

var seat: Array<Int> = Array(100, {0})

fun main() {
    val scanner = Scanner(System.`in`)
    var studentSeatNumber: Array<Int>
    println("학생들의 수를 입력해 주세요.")
    var studentNumber: Int = scanner.nextInt()
    println("자리 배치를 입력해 주세요.(입력양식 : 가로 세로)")
    var studentI: Int = scanner.nextInt()
    var studentJ: Int = scanner.nextInt()


    student.printSeat(studentI, studentJ, studentNumber);
}

class student
{
    companion object
    {
        fun printSeat(i: Int, j: Int, num: Int)
        {
            var counter: Int = 1;
            for (j in 1 .. j)
            {
                for (i in 1 .. i) {
                    print("${seat[counter++]}\t")
                    if(counter > num)
                    {
                        break
                    }
                }
                println()
            }
        }
    }
}