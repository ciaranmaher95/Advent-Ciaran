class Day1 {
    fun solvePart1(): Int {



        return resourceInput().map { (it / 3f).toInt() - 2 }.sum()


    }

    fun solvePart2(): Int {

        return resourceInput().map { fuel(it) }.sum()


    }

    fun fuel(mass: Int): Int{

        val fuel = (mass / 3f).toInt() - 2

        if(fuel > 0){
            return fuel + fuel(fuel)
        }
        else{
            return 0
        }

    }

    private fun resourceInput(): List<Int> {
        return this::class.java
            .getResource("day1ciaran.txt")
            .readText()
            .split("\n")
            .filter { it.isNotBlank() }
            .map { it.toInt() }


    }
}
