package Testing_With_JUnit4

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class Ex1UnitTest {

    @Before
    fun setUp() {
        println("Before")
    }

    @After
    fun tearDown() {
        println("After")
    }

    @Test
    fun equalString() {
        println("Je developpeur Mobile")
        val str1 = "Je developpeur Mobile"
        assertEquals("Je developpeur Mobile", str1)
    }
}