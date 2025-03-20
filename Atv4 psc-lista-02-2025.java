// Atividade 4, lista 2- Programação de Soluções Computacionais.
//	Faça um programa que peça o preço do litro da gasolina e solicite quantos litros foi vendido a determinado cliente. 
//O	programa deve informar quanto o cliente deverá pagar pela gasolina comprada. 

import java.util.Scanner;

public class prt4 {
    public static void main(String[] args) {
        Scanner gasolina = new Scanner(System.in);

        System.out.println("Digite o preço do litro da gasolina: ");
        double preco = gasolina.nextDouble();

        System.out.println("Digite quantos litros de gasolina foram vendidos: ");
        double litros = gasolina.nextDouble();

        double total = preco * litros;

        System.out.println("O cliente deverá pagar R$ " + total);

        gasolina.close();
    }
    
}
