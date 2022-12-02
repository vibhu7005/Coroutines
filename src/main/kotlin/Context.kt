import kotlinx.coroutines.*

fun main() {
    runBlocking {
        launch(CoroutineName("jordiee01")) {
            print(coroutineContext[CoroutineName])
        }
        CoroutineScope(CoroutineName("jordiee02")).launch {
            println(coroutineContext[CoroutineName])
            launch {
                println(coroutineContext[CoroutineName])
            }
        }
        GlobalScope.launch(CoroutineName("jordiee03")) {
            println(coroutineContext[CoroutineName])
            launch {
                println(coroutineContext[CoroutineName])
            }
        }
    }
}