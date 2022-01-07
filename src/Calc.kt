fun main(args: Array<String>){

//Abre Menu de apresentação

    println("|=================================================================|")

    println("|     DESAFIO - KOTLIN - CALCULADORA DOIS NÚMEROS       |")

    println("|=================================================================|")

//Solicita ao usuário os números para efetuar a operação matemática desejada e armazena na variável a e na variável b o valor digitado

    print("   Digite um número: ")

    val a= readLine()!!.toFloat()

    print("   Digite outro número: ")

    val b= readLine()!!.toFloat()

//Solicita ao usuário a operação matemática que deseja realizar e armazena na variável op

    println("|=================================================================|")

    println("|  Informe o número da operação desejada:            |")

    println("|  (1) Somar - (2) Multiplicar - (3) - Dividir (4) Subtrair   |")

    println("|=================================================================|")

    print("   Número da operação: ")

    val op = readLine()!!.toInt()

//Apresenta em texto a operação informada

    when (op) {

        1 -> println("   Soma:")

        2 -> println("   Multiplicação:")

        3 -> println("   Divisão:")

        4 -> println("   Subtração:")

        else -> { // Note the block

            println("Opção Inválida!!!!")

        }

    }

    println("|=================================================================|")

// Dependendo da operação executa a função correspondente e apresenta o resultado na tela

    when (op) {

        1 -> println("| A soma dos números $a e $b é: "+ calcular(a,b))

        2 -> println("| A multiplicação de $a por $b é: "+ multiplicar(a,b))

        3 -> println("| A divisão de $a por $b é: "+ dividir(a,b))

        4 -> println("| A subtração de $a menos $b é: "+ subtrair(a,b))

        else -> { // Note the block

            print("Opção Inválida!!!!")

        }

    }

    println("|=================================================================|")



}



//Funções para realização das operações

fun calcular(a:Float, b:Float) = a.plus(b)

fun multiplicar(a:Float, b:Float) = a*b

fun dividir(a:Float, b:Float) = a/b

fun subtrair(a:Float, b:Float) = a-b

