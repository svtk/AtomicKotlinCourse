package abstractClasses1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMonster {
    @Test
    fun test1Sample() {
        val representation = """
         #######
        ##     #
        #   ####
        #   #
        #####
        """.trimIndent()
        val maze = MazeImpl(representation)
        var moves = 0

        val monster = Monster()
        var currentMonsterPosition = Position(x = 1, y = 3)
        maze.add(monster, currentMonsterPosition)
        Assert.assertEquals("Wrong result for the sample after $moves moves:",
                """
                 #######
                ##     #
                #   ####
                #M  #
                #####
                """.trimIndent(),
                maze.toString())


        // after 1 move
        moves++
        currentMonsterPosition = monster.makeMove(currentMonsterPosition, maze)
        maze.move(monster, currentMonsterPosition)
        Assert.assertEquals("Wrong result for the sample after $moves moves:",
                """
                 #######
                ##     #
                #   ####
                # M #
                #####
                """.trimIndent(),
                maze.toString())

        // after 2 more moves
        moves += 2
        repeat(2) {
            currentMonsterPosition = monster.makeMove(currentMonsterPosition, maze)
            maze.move(monster, currentMonsterPosition)
        }
        Assert.assertEquals("Wrong result for the sample after $moves moves:",
                """
                 #######
                ##     #
                #  M####
                #   #
                #####
                """.trimIndent(),
                maze.toString())

        // after 5 more moves
        moves += 5
        repeat(5) {
            currentMonsterPosition = monster.makeMove(currentMonsterPosition, maze)
            maze.move(monster, currentMonsterPosition)
        }
        Assert.assertEquals("Wrong result for the sample after $moves moves:",
                """
                 #######
                ##   M #
                #   ####
                #   #
                #####
                """.trimIndent(),
                maze.toString())
    }

    private fun checkMonsterMovement(
            maps: Map<Int, String>
    ) {
        val initialMap = maps.getValue(0)

        val maze = MazeImpl(initialMap)

        val monster = maze.all()
                .filterIsInstance<Monster>()
                .first()
        var currentMonsterPosition = maze.position(monster)!!

        maze.add(monster, currentMonsterPosition)
        val maxMoves = maps.keys.max()!!
        for (move in 1..maxMoves) {
            currentMonsterPosition = monster.makeMove(currentMonsterPosition, maze)
            maze.move(monster, currentMonsterPosition)
            if (move in maps) {
                Assert.assertEquals("Wrong result after $move moves for\n$initialMap",
                        maps.getValue(move),
                        maze.toString())
            }
        }
    }

    @Test
    fun test2() {
        checkMonsterMovement(mapOf(
                0 to """
                ####
                #  #
                #M #
                ####
                """.trimIndent(),
                1 to """
                ####
                #  #
                # M#
                ####
                """.trimIndent(),
                2 to """
                ####
                # M#
                #  #
                ####
                """.trimIndent(),
                3 to """
                ####
                #M #
                #  #
                ####
                """.trimIndent(),
                4 to """
                ####
                #  #
                #M #
                ####
                """.trimIndent()
        ))
    }


    @Test
    fun test3() {
        checkMonsterMovement(mapOf(
                0 to """
                ########
                #    # #
                #   ## #
                #M     #
                ########
                """.trimIndent(),
                5 to """
                ########
                #    # #
                #   ## #
                #     M#
                ########
                """.trimIndent(),
                7 to """
                ########
                #    #M#
                #   ## #
                #      #
                ########
                """.trimIndent(),
                13 to """
                ########
                #    # #
                #  M## #
                #      #
                ########
                """.trimIndent(),
                15 to """
                ########
                #   M# #
                #   ## #
                #      #
                ########
                """.trimIndent(),
                18 to """
                ########
                #M   # #
                #   ## #
                #      #
                ########
                """.trimIndent(),
                20 to """
                ########
                #    # #
                #   ## #
                #M     #
                ########
                """.trimIndent()
        ))
    }
}