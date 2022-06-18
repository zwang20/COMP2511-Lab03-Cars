package car

import kotlin.math.sqrt


fun isPrime(n: Int): Boolean {
    if (n <= 3)
        return (n > 1)
    if (n % 2 == 0 || n % 3 == 0)
        return false
    for (i in 5..sqrt(n.toDouble()).toInt() step 6)
        if (n % i == 0 || n%(i+2) == 0)
            return false
    return true
}
