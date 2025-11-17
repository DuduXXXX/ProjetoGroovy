package core

class Parser {

    File debugFile = new File("parser.out")

    Parser() {
        // limpa o arquivo a cada execução
        debugFile.text = ""
    }

    def parse(List<String> tokens) {
        debugFile.append("Tokens recebidos: $tokens\n")

        try {
            def expr = tokens.join("")
            def result = Eval.me(expr)

            debugFile.append("Expressão avaliada: $expr\n")
            debugFile.append("Resultado: $result\n\n")

            return result
        } catch (Exception e) {
            debugFile.append("Erro: ${e.getClass().simpleName}: ${e.message}\n\n")
            throw e
        }
    }
}
