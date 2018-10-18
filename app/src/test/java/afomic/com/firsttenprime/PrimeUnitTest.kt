package afomic.com.firsttenprime

import afomic.com.firsttenprime.helpers.PrimeHelper
import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PrimeUnitTest {
    @Test
    fun `test for prime number`() {
        assertThat("23 is a prime number", PrimeHelper.isPrime(23), `is`(equalTo(true)))
    }

    @Test
    fun `test prime number generator`() {
        assertThat("List contains ten items", PrimeHelper.getFirstTenPrimeNumber().size, `is`(equalTo(10)))
        assertThat("List contains first ten prime number",
                PrimeHelper.getFirstTenPrimeNumber(),
                hasItems(2, 3, 5, 7, 11, 13, 17, 19, 23, 29))
    }
    @Test
    fun `test multiple prime number generator`() {
        assertThat("List contains ten items", PrimeHelper.getPrimeMultiple(3).size, `is`(equalTo(10)))
        assertThat("List contains 3 multiply by the first ten prime",
                PrimeHelper.getPrimeMultiple(3),
                hasItems(6, 9, 15, 21, 33, 39, 51, 57, 69, 87))
    }
}
