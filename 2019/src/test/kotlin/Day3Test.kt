import com.google.common.truth.Truth.assertThat
import org.junit.Test

class Day3Test {

    @Test
    fun `R75,D30,R83,U83,L12,D49,R71,U7,L72 | U62,R66,U55,R34,D71,R55,D58,R83 = distance 159`(){
        val input = ArrayList<String>()
        input.add("R75,D30,R83,U83,L12,D49,R71,U7,L72")
        input.add("U62,R66,U55,R34,D71,R55,D58,R83")

        val subject = Day3()
        assertThat(subject.solvePart1(input).first).isEqualTo(159)
    }

    @Test
    fun `R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51 | U98,R91,D20,R16,D67,R40,U7,R15,U6,R7 = distance 135`(){
        val input = ArrayList<String>()
        input.add("R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51")
        input.add("U98,R91,D20,R16,D67,R40,U7,R15,U6,R7")

        val subject = Day3()
        assertThat(subject.solvePart1(input).first).isEqualTo(135)
    }

    @Test
    fun `R75,D30,R83,U83,L12,D49,R71,U7,L72 | U62,R66,U55,R34,D71,R55,D58,R83 = steps 610`(){
        val input = ArrayList<String>()
        input.add("R75,D30,R83,U83,L12,D49,R71,U7,L72")
        input.add("U62,R66,U55,R34,D71,R55,D58,R83")

        val subject = Day3()
        assertThat(subject.solvePart2(input)).isEqualTo(610)
    }

    @Test
    fun `R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51 | U98,R91,D20,R16,D67,R40,U7,R15,U6,R7 = steps 410`(){
        val input = ArrayList<String>()
        input.add("R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51")
        input.add("U98,R91,D20,R16,D67,R40,U7,R15,U6,R7")

        val subject = Day3()
        assertThat(subject.solvePart2(input)).isEqualTo(410)
    }
}