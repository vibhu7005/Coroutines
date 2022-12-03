import kotlinx.coroutines.*
import java.lang.Thread.sleep

fun main() {
    runBlocking {
        val job1 = launch {
            print("Job1 starts")
            val job2 = launch {
                print("Job2 starts")
                val job3 = launch {
                    print("Job3 starts")
                    delay(500)
                    print("Job3 finishes")
                }
                delay(300)
                print("Job2 finishes")
            }
            delay(100)
            job2.cancel()
            delay(2000)
            print("Job1 finishes")
        }
    }
}