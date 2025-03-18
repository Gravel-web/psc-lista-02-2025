// Atividade 2, lista 2- Programação de Soluções Computacionais
//Faça um Programa que peça dois números e imprima a soma, a subtração e a multiplicação do primeiro pelo segundo. 
import java.util.Scanner;
public class prt2 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = nc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = nc.nextInt();
        int soma = n1 + n2;
        int sub = n1 - n2;
        int mult = n1 * n2;
        System.out.println(n1 + " + " + n2 + " = " + soma);
        System.out.println(n1 + " - " + n2 + " = " + sub);
        System.out.println(n1 + " * " + n2 + " = " + mult);
        System.out.println("O resultado é "+soma);
        nc.close();
            }
}
