// Atividade 5, lista 2- Programação de Soluções Computacionais.
//Faça um programa que peça o valor de uma viagem “eurotrip” que será realizada por um grupo de amigos. Os brasileiros sairão com destino a três locais: 1º Alemanha, 2º Portugal e 3º Itália. 
 //O programa deve solicitar o preço atual de cada viagem, a quantidade de pessoas que irão nessa viagem. Após isso, imprimir o valor total da viagem somando a quantidade total de pessoas que visitarão todos os 03 destinos. 
 
 import java.util.Scanner;

 public class prt5 {
     public static void main(String[] args) {
         Scanner viagem = new Scanner(System.in);
 
         System.out.print("Digite o valor da viagem para Alemanha: ");
         double valorAlemanha = viagem.nextDouble();
 
         System.out.print("Digite o valor da viagem para Portugal: ");
         double valorPortugal = viagem.nextDouble();
 
         System.out.print("Digite o valor da viagem para Itália: ");
         double valorItalia = viagem.nextDouble();
 
         System.out.print("Digite a quantidade de pessoas que irão para Alemanha: ");
         int pessoasAlemanha = viagem.nextInt();
 
         System.out.print("Digite a quantidade de pessoas que irão para Portugal: ");
         int pessoasPortugal = viagem.nextInt();
 
         System.out.print("Digite a quantidade de pessoas que irão para Itália: ");
         int pessoasItalia = viagem.nextInt();
 
         double totalAlemanha = valorAlemanha * pessoasAlemanha;

         double totalPortugal = valorPortugal * pessoasPortugal;

         double totalItalia = valorItalia * pessoasItalia;
 
         double valorTotalViagem = totalAlemanha + totalPortugal + totalItalia;
 
         System.out.printf("O valor total da viagem para Alemanha é: %.2f%n", totalAlemanha);
         System.out.printf("O valor total da viagem para Portugal é: %.2f%n", totalPortugal);
         System.out.printf("O valor total da viagem para Itália é: %.2f%n", totalItalia);
         System.out.printf("O valor total da viagem para todos os destinos é: %.2f%n", valorTotalViagem);
 
         viagem.close();
     }
 }
