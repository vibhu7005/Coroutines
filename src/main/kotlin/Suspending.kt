import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Thread.sleep

var functionCalls = 0
fun main() {
    GlobalScope.launch {
        fun0()
    }
    GlobalScope.launch {
        fun1()
    }
    GlobalScope.launch {
        fun2()
    }
    Thread {
        functionCalls++
    }.start()
    sleep(5500)
    print(functionCalls)
}


suspend fun fun0() {
    delay(5000)
    print("fun0")
    functionCalls++
}

suspend fun fun1() {
    delay(300)
    print("fun1")
    functionCalls++
}

suspend fun fun2() {
    delay(100)
    print("fun2")
    functionCalls++
}