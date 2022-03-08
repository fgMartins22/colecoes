fun main() {
    val assento = Assento(true, 1)

    val preco = 25
    var desconto: Float

    /////////////////////////////////////////////////////////////////////////////////////////
    for(indice in 0..15){assento.cadastrarAssentos(Assento(true, indice))}
    /////////////////////////////////////////////////////////////////////////////////////////
    do{
        val choose = readLine()!!.toInt()
        when(choose){
            1 -> {

                for(indice in 0..15){

                if(assento.listarAssentos()[indice].disponibilidade.equals(true)){

                    println("Disponível, ${assento.listarAssentos()[indice].vetor}")

                }else if(assento.listarAssentos()[indice].disponibilidade.equals(false)){

                    println("Indisponível, ${assento.listarAssentos()[indice].vetor}")

                }
              }
            }
            2 -> {
                println("Digite qual assento você quer pesquisar: ")
                val search = readLine()!!.toInt()
                if(assento.listarAssentos()[search].disponibilidade.equals(true)){

                    println("Disponível, ${assento.listarAssentos()[search].vetor}")

                }else if(assento.listarAssentos()[search].disponibilidade.equals(false)){

                    println("Indisponível, ${assento.listarAssentos()[search].vetor}")

                }
            }
            3 -> {
                println("Quantos anos você tem?")
                val idade = readLine()!!.toInt()

                println("Você é Professor/Estudante?")
                println("1: Sim\n2: Não\n")
                val escola = readLine()!!.toInt()

                if(idade >= 60){

                    desconto = preco - (preco * 0.5f)

                }else if(idade <= 12){

                    desconto = preco - (preco * 0.5f)

                }else if(escola == 1){

                    desconto = preco - (preco * 0.25f)

                }else{

                    desconto = preco.toFloat()

                }

                var disponivel: Int? = null

                println("Digite qual assento você quer pesquisar: ")
                val search = readLine()!!.toInt()
                if(assento.listarAssentos()[search].disponibilidade.equals(true)){

                    disponivel = 1

                }else if(assento.listarAssentos()[search].disponibilidade.equals(false)){

                    disponivel = 2

                }

                if(disponivel == 1){

                    println("O Preço total foi $desconto e o Assento escolhido foi $search")
                    println("Deseja confirmar a compra?\n1: Sim\n2: Não")
                    val confirmar = readLine()!!.toInt()

                    if(confirmar == 1){

                        //Substituir a disponibilidade no vetor por false

                    }else{break}

                }else{println("Assento Indisponível..."); break}

            }
            4 -> {
                println("Encerrando sistema. GUBY")
            }
        }
    }while(choose != 4)
}