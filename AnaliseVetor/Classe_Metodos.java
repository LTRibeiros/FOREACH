/*
Fazer uma aplicação Java em Eclipse, que permita ao usuário, por Scanner ou JOptionPane,
entrar o tamanho (n) de um vetor de inteiros (limite a entrada a 100) e entrar com os n
valores. Deve-se fazer uma classe de controle que tenha uma operação que receba o vetor
como parâmetro, percorra o vetor utilizando for each e, caso o número seja ímpar, exiba o
número e a indicação que é ímpar e, caso seja par, exiba apenas os múltiplos de 10, e a
indicação de que são pares e múltiplos de 10. A resposta deve ser um print do console com
um vetor de entrada de 8 posições.
 */
package Ex3;

/**
 *
 * @author Particular
 */
public class Classe_Metodos {
    public void analisaVetor(int Vetor[]) {
        
        for(int numeroAnalise : Vetor) {
            if (numeroAnalise % 2 != 0) {
                System.out.print("o numero " +numeroAnalise +" e impar.");
        }
            else {
                if(numeroAnalise % 10 == 0) {
                    System.out.print("o numero " +numeroAnalise +" e par e mutiplo de 10.");
                    
                }
            }
        
    }
        
    }
    
}
