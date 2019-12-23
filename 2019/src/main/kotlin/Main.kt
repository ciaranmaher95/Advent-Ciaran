
fun main(args: Array<String>) {

    val startTime = System.currentTimeMillis()
    when (args.first()) {
        "--day=1" -> {
            val part1 = Day1().solvePart1()
            println("Part 1: $part1")
            val part2 = Day1().solvePart2()
            println("Part 2: $part2")
        }
        "--day=2" -> {
            val part1 = Day2().solvePart1()
            println("Part 1: $part1")
            val part2 = Day2().solvePart2()
            println("Part 2: $part2")
        }
        else -> throw IllegalArgumentException("Unexpected argument provided")
    }

    val endTime = System.currentTimeMillis()
    println("Runtime: ${endTime - startTime}ms")

}