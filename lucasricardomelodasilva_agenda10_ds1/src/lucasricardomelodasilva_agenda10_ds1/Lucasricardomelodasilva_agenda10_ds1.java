package lucasricardomelodasilva_agenda10_ds1;
import javax.swing.JOptionPane;

public class Lucasricardomelodasilva_agenda10_ds1 {

    public static void main(String[] args) {

//          DECLARAÇÃO DE VARIÁVEIS
    int lin, col, soma = 0;
    int mat [][] = new int [10][10];
    int cont = 0; 

//          INICIALIZAÇÃO

JOptionPane.showMessageDialog(null, "============================×××============================"
 + "\nBem-vindo ao programa Matriz 10x10 \n "
 + " \nEste programa fará a soma dos valores obtidos da matriz");

//          ENTRADA DE DADOS COM LAÇO for
    for (lin = 0; lin < 10; lin++){
        for (col = 0; col < 10; col++){
             mat [lin][col] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o " + (cont += 1) +  "º valor"));
             soma += mat [lin][col];
        }
    }
//           SAÍDA DE DADOS COM VAR SOMA   
    JOptionPane.showMessageDialog(null, "A soma de todos os valores é igual a " + soma);

    }
    
}
