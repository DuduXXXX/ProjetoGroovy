import core.Lexer
import core.Parser

println "Digite uma expressão matemática: "
def input = System.console()?.readLine()

if (input == null) {
    println "Nenhuma entrada lida."
    System.exit(1)
}

try {
    def tokens = Lexer.tokenize(input)
    def parser = new Parser()
    def result = parser.parse(tokens)
    println "Resultado: $result"
} catch (Exception e) {
    println "Expressão inválida!"
}
