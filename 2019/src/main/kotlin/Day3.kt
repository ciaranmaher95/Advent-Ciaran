import kotlin.math.absoluteValue

class Day3 {

    fun solvePart1(input: List<String> = resourceInput()): Pair<Int,Int>{

        val wire1 = input[0]
        val wire2 = input[1]

        val wire1Path =  findPath(wire1.split(",").map { it })
        val wire2Path =  findPath(wire2.split(",").map { it })

        var dist: Int
        var steps: Int
        var manhattanDist = Int.MAX_VALUE
        var shortestSteps = Int.MAX_VALUE

        for(intersect in wire1Path.intersect(wire2Path)){

            dist = intersect.first.absoluteValue + intersect.second.absoluteValue

            steps = (wire1Path.indexOf(intersect)+1) + (wire2Path.indexOf(intersect)+1)

            if(dist < manhattanDist) { manhattanDist = dist }

            if(steps < shortestSteps) { shortestSteps = steps }

        }

        return Pair(manhattanDist,shortestSteps)

    }

    fun solvePart2(input: List<String> = resourceInput()): Int{

        return solvePart1(input).second
    }

    private fun findPath(wire: List<String>): ArrayList<Pair<Int, Int>>
    {

        val path = ArrayList<Pair<Int,Int>>()
        val distList = arrayListOf<Int>()

        var x = 0
        var y = 0

        var steps = 0

        for(move in wire){

            val dist = move.substring(1,(move.length)).toInt()

            distList.add(dist)

            when(move.substring(0,1)){

                "L" -> {
                    for(i in 0 until dist) {
                        x--
                        steps += dist
                        path.add(Pair(x, y))
                    }
                }
                "R" -> {
                    for(i in 0 until dist) {
                        x++
                        steps += dist
                        path.add(Pair(x, y))
                    }
                }
                "U" -> {
                    for(i in 0 until dist) {
                        y++
                        steps += dist
                        path.add(Pair(x, y))
                    }
                }
                "D" -> {
                    for(i in 0 until dist) {
                        y--
                        steps += dist
                        path.add(Pair(x, y))
                    }
                }
            }
        }

        path.remove(Pair(0,0))

        return path
    }

    private fun resourceInput(): List<String> {
        return this::class.java
            .getResource("day3.txt")
            .readText().lines()
            .filter { it.isNotBlank() }
            .map { it }


    }
}