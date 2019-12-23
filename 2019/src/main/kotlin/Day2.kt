import kotlin.IllegalStateException

class Day2 {
    fun solvePart1(input: List<Int> = resourceInput(), noun: Int? = null, verb: Int? = null): String {

        val program = input.toMutableList()
        program[1] = noun ?: program[1]
        program[2] = verb ?: program[2]

        var pc = 0

        var bool = true

        while (bool) {
            when (program[pc]) {
                1 -> {
                    val x = program[opIndex(program, pc, 1)]
                    val y = program[opIndex(program, pc, 2)]
                    val dest = opIndex(program, pc, 3)

                    program[dest] = x + y
                    pc += 4
                }
                2 -> {
                    val x = program[opIndex(program, pc, 1)]
                    val y = program[opIndex(program, pc, 2)]
                    val dest = opIndex(program, pc, 3)

                    program[dest] = x * y
                    pc += 4
                }

                99 -> {
                    bool = false
                }

            }
        }

        return program.joinToString(",")

    }

    fun opIndex(program: List<Int>, pc: Int, offset: Int): Int {

        return program[pc + offset]
    }

    fun solvePart2(): Int {
        val expected = 19690720

        for(i in 0.. 99) {
            for (j in 0..99) {
                val act = solvePart1(noun = i, verb = j).split(",")[0].toInt()

                if (act == expected) {
                    return 100 * i + j
                }
            }
        }
        throw IllegalStateException("expected value not found")
    }


    private fun resourceInput(): List<Int> {
        return this::class.java
            .getResource("day2ciaran.txt")
            .readText()
            .trim()
            .split(",")
            .filter { it.isNotBlank() }
            .map { it.toInt() }


    }
}
