import java.text.*
import java.util.*
fun main(args:Array<String>) {
    val df = SimpleDateFormat("Gy年M月d日(E) H時m分s秒", Locale("ja", "JP", "JP"))
    println("Hello Kotlin! -- ${df.format(Date())}")
    println("Kotlin Version: ${KotlinVersion.CURRENT}")
}

