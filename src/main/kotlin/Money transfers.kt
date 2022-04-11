import kotlin.math.roundToInt

const val MIN_COMMISSION = 3500
const val KOPECK_IN_ONE_RUBLE = 100
const val COMMISSION_MORE_35 = 466667
fun main() {
    print("Введите сумму перевода: ")
    val input = readLine()?.toInt() ?: return
    val inputInKopeck = input * KOPECK_IN_ONE_RUBLE

    val commission = if (inputInKopeck <= COMMISSION_MORE_35) {
        MIN_COMMISSION
    } else {
        val gd = inputInKopeck.toDouble() * 0.0075
        gd.roundToInt()
    }
    val commissionInRuble = commission/100
    val commissionInKopeck = commission % 100

    println("Переводод с комиссией составит: ${commissionInRuble + input} рублей $commissionInKopeck копеек")
}