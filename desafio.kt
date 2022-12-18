enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val id: int, var uso: String, val interesse:Formacao.nome)

data class ConteudoEducacional(var nome: String, val duracao: Int )

data class Formacao(val name: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel ) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
       // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
       //val matricula = Usuario(1,"Kleber","Programador Back-End")
       //println
       
    }
}
val Formacao.commaDelimitedConteudoEducacionalNomes: String                                                  
    get() = conteudos.map { it.nome }.joinToString()
val Formacao.commaDelimitedNomes: String                                                   
    get() = name 
val Formacao.commaDelimitedNiveis: Nivel                                                   
    get() = nivel 
    
fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    val formacao = Formacao("Programador Back-End",listOf(ConteudoEducacional("Java", 60), ConteudoEducacional("C++", 120), 
                                   ConteudoEducacional("Ruby", 180)),Nivel.BASICO)
    val formacao2 = Formacao("Programador Front-End",listOf(ConteudoEducacional("JavaScript", 60), ConteudoEducacional("UX", 120)),Nivel.INTERMEDIARIO)

    println("Formação: ${formacao.commaDelimitedNomes} - Conteudo: ${formacao.commaDelimitedConteudoEducacionalNomes} - Nivel: ${formacao.commaDelimitedNiveis}")
    println("Formação: ${formacao2.commaDelimitedNomes} - Conteudo: ${formacao2.commaDelimitedConteudoEducacionalNomes} - Nivel: ${formacao2.commaDelimitedNiveis}")
    
}
