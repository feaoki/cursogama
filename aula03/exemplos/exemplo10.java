package exemplos;

import java.util.Scanner;

public class exemplo10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final int QTD_ALUNOS = 5;
        
        double nota = 0;
        double notaGeral = 0;

        for (Syso i = 0; i < QTD_ALUNOS; i++) {
            System.out.println("Digite as notas do " + i + 1 + "aluno");

            for (int j = 0; j < 2; j++) {
               nota += entrada.nextDouble(); 
            }
            System.out.println("A média do " + i "aluno é: " + nota / qtdAul);
            notaGeral += nota;
        }

        System.out.println("a média da sala é: " + notaGeral / (qtdAlunos * qtNotas));

        entrada.close();
        
    }
    
}
