package core

class Lexer {

    static List<String> tokenize(String input) {
        // remove espaços
        def cleaned = input.replaceAll(/\s+/, "")

        // verifica se só tem dígitos, operadores e parênteses
        if (!cleaned.matches(/[0-9+\-*/()]+/)) {
            throw new IllegalArgumentException(
                "Erro léxico: caractere inválido na expressão: '${input}'"
            )
        }

        // quebra em tokens: números e símbolos
        return cleaned.findAll(/\d+|[+\-*/()]/)
    }
}
