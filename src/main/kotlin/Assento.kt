class Assento(val disponibilidade: Boolean, val vetor: Int) {

    private var assentos = mutableListOf<Assento>()

    fun cadastrarAssentos(assento: Assento): Boolean = assentos.add(assento)

    fun listarAssentos() = assentos

}