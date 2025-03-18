// Atividade 3, lista 2- Programação de Soluções Computacionais.
//Faça um Programa que peça as 4 notas bimestrais e mostre a média. 
import java.util.Scanner;
public class prt3 {
    public static void main(String[] args) {
   Scanner nota = new Scanner (System.in);

   System.out.println("Digite a primeira nota: ");
   double nota1 = nota.nextDouble();

    System.out.println("Digite a segunda nota: ");
    double nota2 = nota.nextDouble();

    System.out.println("Digite a terceira nota: ");
    double nota3 = nota.nextDouble();

    System.out.println("Digite a quarta nota: ");
    double nota4 = nota.nextDouble();

    double media = (nota1 + nota2 + nota3 + nota4) / 4;

    System.out.println("A média das 4 notas é: " + media);
    
    nota.close();
    }
}
