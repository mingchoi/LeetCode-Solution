package solution

import kotlin.math.max

class Q14GasStation {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        return canCompleteCircuit_smart(gas, cost)
    }

    fun canCompleteCircuit_bruteforce(gas: IntArray, cost: IntArray): Int {
        val next = { i: Int ->
            if (i >= gas.size) i - gas.size else i
        }

        loop@ for (start in gas.indices) {
            var sum = gas[start] - cost[start]
            if (sum < 0) continue@loop
            for (i in (start + 1)..start + gas.size) {
                val index = next(i)
                sum += gas[index] - cost[index]
                if (sum < 0) continue@loop
                if (index == start) return index
            }
        }

        return -1
    }

    fun canCompleteCircuit_smart(gas: IntArray, cost: IntArray): Int {
        var n = 0
        var c = 0
        var s = 0

        for (i in 0 until gas.size) {
            c += gas[i] - cost[i]
            if (c < 0) {
                n += c
                c = 0
                s = i + 1
            }
//            print("n: $n, c: $c, s: $s\n")
        }

        return if (c + n >= 0) s else -1
    }
}