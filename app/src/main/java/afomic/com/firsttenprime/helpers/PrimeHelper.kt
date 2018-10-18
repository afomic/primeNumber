package afomic.com.firsttenprime.helpers

object PrimeHelper {
    fun isPrime(num: Int): Boolean {
        if (num == 2 || num == 3) {
            return true
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; }
        for (i in 3..Math.sqrt(num.toDouble()).toInt() step 2) {
            if (num % i == 0 || num % Math.sqrt(num.toDouble()) == 0.0) {
                return false;
            }

        }
        return true
    }

    fun getPrimeNumbers(num: Int): List<Int> {
        val result = ArrayList<Int>()
        var count = 2
        while (result.size < num) {
            if (isPrime(count)) {
                result.add(count)
            }
            count++
        }
        return result
    }

    fun getFirstTenPrimeNumber() = getPrimeNumbers(10)

    fun getPrimeMultiple(num: Int): List<Int> {
        val result = ArrayList<Int>()
        val firstTenPrimes = getFirstTenPrimeNumber()
        for (prime in firstTenPrimes) {
            ArrayList<Int>()
            result.add(prime * num)
        }
        return result

    }

}