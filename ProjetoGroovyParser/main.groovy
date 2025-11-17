

import core.Lexer
import core.Parser

println "Digite uma expressão matemática: "
def input = System.console().readLine()

def tokens = Lexer.tokenize(input)
def parser = new Parser()

try {
    def result = parser.parse(tokens)
    println "Resultado: $result"
} catch (Exception e) {
    println "Expressão inválida!"
}
