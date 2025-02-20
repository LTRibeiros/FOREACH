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
import javax.swing.JOptionPane;

/**
 *
 * @author Particular
 */
public class Foreach {
    public static void main (String args []) {
        
        Classe_Metodos imp = new Classe_Metodos();
        
        int tamanhoVetor = 0;
        
        while (tamanhoVetor > 100 || tamanhoVetor < 0) {
        tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor: "));
         if(tamanhoVetor > 100 || tamanhoVetor < 0) {
             JOptionPane.showMessageDialog(null, "Vetor deve ter no mínimo 1 e no máximo 100 espaços.");
         }
        
    }
        
        int Vetor[] = new int[tamanhoVetor];
        
        for(int i = 0 ; i < Vetor.length ; i ++) {
            Vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor da posição " +i +" do vetor"));
        }
        imp.analisaVetor(Vetor);
    
    
}
}
