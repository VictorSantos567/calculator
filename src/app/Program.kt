package app

fun calculadora(numero1: Float?, numero2: Float?, operacao: Int) {

	if (numero1 == null || numero2 == null) {
		println("Um dos valores é nulo, Solicito informa valores válidos ")
	} else {
		when (operacao) {
			1 -> {
				println("A adicao de $numero1 + $numero2 eh " + (numero1 + numero2))
			}
			2 -> {
				println("A subtracao de $numero1 - $numero2 eh: " + (numero1 - numero2))
			}
			3 -> {
				println("A multiplicacao de $numero1 * $numero2 eh: " + (numero1 * numero2))
			}
			4 -> {
				println("A divisao de $numero1 / $numero2 eh: " + (numero1 / numero2))
			}
			5 -> {
				println("A resultado da potencia $numero1 ^ $numero2 e: " + (Math.pow(numero1.toDouble(),numero2.toDouble())))
			}
			else -> println("Operação invalidade, Informe um valor entre 0 e 5")
		}
	}
}


fun main() {

	calculadora(2.0f, null, 1)
	calculadora(2.0f, 2.5f, 2)
	calculadora(2.0f, 2.5f, 3)
	calculadora(2.0f, 2.5f, 4)
	calculadora(2.0f, 2.5f, 5)


}
