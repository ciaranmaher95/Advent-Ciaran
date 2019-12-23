
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class Day2Test {
    @Test
    fun `1,0,0,0,99 returns 2,0,0,0,99`(){
        val input = "1,0,0,0,99".split(",").map { it.toInt() }
        val subject = Day2()
        assertThat(subject.solvePart1(input)).isEqualTo("2,0,0,0,99")
    }

    @Test
    fun `2,3,0,3,99 returns 2,3,0,6,99`(){
        val input = "2,3,0,3,99".split(",").map { it.toInt() }
        val subject = Day2()
        assertThat(subject.solvePart1(input)).isEqualTo("2,3,0,6,99")
    }

    @Test
    fun `2,4,4,5,99,0 becomes 2,4,4,5,99,9801`() {
        val input = "2,4,4,5,99,0".split(",").map { it.toInt() }
        val subject = Day2()
        assertThat(subject.solvePart1(input)).isEqualTo("2,4,4,5,99,9801")
    }

    @Test
    fun `1,1,1,4,99,5,6,0,99 becomes 30,1,1,4,2,5,6,0,99`() {
        val input = "1,1,1,4,99,5,6,0,99".split(",").map { it.toInt() }
        val subject = Day2()
        assertThat(subject.solvePart1(input)).isEqualTo("30,1,1,4,2,5,6,0,99")
    }


    @Test
    fun `when providing 12 and 2 as verb and noun to production input we get a result of 9706670`() {
        val input = "1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,10,1,19,1,5,19,23,1,23,5,27,2,27,10,31,1,5,31,35,2,35,6,39,1,6,39,43,2,13,43,47,2,9,47,51,1,6,51,55,1,55,9,59,2,6,59,63,1,5,63,67,2,67,13,71,1,9,71,75,1,75,9,79,2,79,10,83,1,6,83,87,1,5,87,91,1,6,91,95,1,95,13,99,1,10,99,103,2,6,103,107,1,107,5,111,1,111,13,115,1,115,13,119,1,13,119,123,2,123,13,127,1,127,6,131,1,131,9,135,1,5,135,139,2,139,6,143,2,6,143,147,1,5,147,151,1,151,2,155,1,9,155,0,99,2,14,0,0".split(",").map{ it.toInt() }
        val expected = "9706670,12,2,2,1,1,2,3,1,3,4,3,1,5,0,3,2,10,1,48,1,5,19,49,1,23,5,50,2,27,10,200,1,5,31,201,2,35,6,402,1,6,39,404,2,13,43,2020,2,9,47,6060,1,6,51,6062,1,55,9,6065,2,6,59,12130,1,5,63,12131,2,67,13,60655,1,9,71,60658,1,75,9,60661,2,79,10,242644,1,6,83,242646,1,5,87,242647,1,6,91,242649,1,95,13,242654,1,10,99,242658,2,6,103,485316,1,107,5,485317,1,111,13,485322,1,115,13,485327,1,13,119,485332,2,123,13,2426660,1,127,6,2426662,1,131,9,2426665,1,5,135,2426666,2,139,6,4853332,2,6,143,9706664,1,5,147,9706665,1,151,2,9706667,1,9,155,0,99,2,14,0,0"
        val subject = Day2()
        val output = subject.solvePart1(input = input, noun = 12, verb = 2)
        assertThat(output).isEqualTo(expected)
    }

}