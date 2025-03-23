 import java.util.Scanner;

 public class Atv5 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.println("Digite o valor da viagem para Alemanha: ");
         double valorAlemanha = scanner.nextDouble();
 
         System.out.println("Digite o valor da viagem para Portugal: ");
         double valorPortugal = scanner.nextDouble();
 
         System.out.println("Digite o valor da viagem para Itália: ");
         double valorItalia = scanner.nextDouble();
 
         System.out.println("Digite a quantidade de pessoas que irão para Alemanha: ");
         Double pessoasAlemanha = scanner.nextDouble();
 
         System.out.println("Digite a quantidade de pessoas que irão para Portugal: ");
         Double pessoasPortugal = scanner.nextDouble();
 
         System.out.println("Digite a quantidade de pessoas que irão para Itália: ");
         Double pessoasItalia = scanner.nextDouble();
         scanner.close();
 
         Double totalAlemanha =(valorAlemanha * pessoasAlemanha);

         Double totalPortugal = valorPortugal * pessoasPortugal;

         Double totalItalia = valorItalia * pessoasItalia;
 
         Double valorTotalViagem = totalAlemanha + totalPortugal + totalItalia;
 
         System.out.println("O valor total da viagem para Alemanha é:"+ totalAlemanha);
         System.out.println("O valor total da viagem para Portugal é: "+ totalPortugal);
         System.out.println("O valor total da viagem para Itália é:"+ totalItalia);
         System.out.println("O valor total da viagem para todos os destinos é:"+ valorTotalViagem);
 
     }
 }
