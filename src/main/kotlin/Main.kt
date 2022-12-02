import kotlinx.coroutines.*
import java.lang.Thread.sleep

fun main(args: Array<String>) {
    runBlocking {
        repeat(100000) {
            launch {
                print("hey")
            }
        }
    }

    repeat(1000) {
        Thread {
            //operation
        }.start()
    }
}