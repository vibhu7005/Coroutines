import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Thread.sleep

fun main() {
//Global Scope - Entire lifecycle of application scope
//Coroutine Scope - Creates a new scope that persists untill all children coroutines complete
    CoroutineScope(Dispatchers.IO).launch {
        print(100)
        launch {
            sleep(1)
            print(5)
            launch {
                sleep(2)
                print(7)
            }
        }
    }
    sleep(5)
}