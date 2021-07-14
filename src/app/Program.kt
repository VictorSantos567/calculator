package app

fun calculadora(numero1:Float,numero2:Float, operacao:Int){
	val resultado:Float? 
			
	when(operacao){
		1 -> resultado = (numero1+numero2)
		2 -> resultado = (numero1-numero2)
		3 -> resultado = (numero1*numero2)
		4 -> resultado = (numero1/numero2)
	}
}


fun main(args: Array<String>) {
	
	
	
}
