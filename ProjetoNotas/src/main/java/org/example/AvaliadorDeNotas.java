package org.example;

public class AvaliadorDeNotas {

    // Método que classifica a nota do estudante e retorna uma string com a classificação
    public static String classificarNota(double nota) {
        if (nota < 0 || nota > 100) {
            throw new IllegalArgumentException("Nota inválida! A nota deve estar entre 0 e 100.");
        }

        if (nota >= 90) {
            return "Excelente";
        } else if (nota >= 75) {
            return "Bom";
        } else if (nota >= 50) {
            return "Regular";
        } else if (nota >= 30) {
            return "Insuficiente";
        } else {
            return "Reprovado";
        }
    }

    // Método que gera uma mensagem de acordo com a classificação da nota
    // Recebe a nota e classifica internamente (para uso direto)
    public static String gerarMensagem(double nota) {
        String classificacao = classificarNota(nota);
        return gerarMensagem(classificacao);
    }

    // Overload: gera mensagem recebendo a classificação diretamente (evita reprocessar)
    public static String gerarMensagem(String classificacao) {
        switch (classificacao) {
            case "Excelente":
                return "Parabéns! Você está com desempenho excelente!";
            case "Bom":
                return "Seu desempenho foi bom! Continue assim!";
            case "Regular":
                return "Você está no caminho certo, mas pode melhorar!";
            case "Insuficiente":
                return "Você não passou, precisa melhorar. Não desista!";
            case "Reprovado":
                return "Você foi reprovado. Busque apoio e estude mais para a próxima!";
            default:
                return "Classificação desconhecida.";
        }
    }

    // Método que avalia o estudante, fornecendo a classificação e a mensagem
    public static String avaliarEstudante(Estudante estudante) {
        try {
            String classificacao = classificarNota(estudante.getNotaFinal());
            String mensagem = gerarMensagem(classificacao);  // usa o overload otimizado
            return "Classificação: " + classificacao + "\nMensagem: " + mensagem;
        } catch (IllegalArgumentException e) {
            return "Erro: " + e.getMessage();
        }
    }
}
