package aula02.registroconta;

import java.util.Scanner;


public class RegistroConta {

    static final int MENU_DEPOSITO = 1;
    static final int MENU_SAQUE = 2;
    static final int MENU_SALDO = 3;
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setCpf("111.222.333-44");
        cliente1.setNome("João Paulo");
        
        Conta conta1 = new Conta();
        conta1.setNumero(1);
        conta1.setCorrentista(cliente1);
        
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        
        while (true){            
            showMenu();            
            opcao = scan.nextInt();
            if(opcao == MENU_DEPOSITO){
               System.out.println("Digite o valor do depósito:"); 
               
               if(conta1.fazerDeposito(scan.nextInt())){
                   System.out.println("Depósito realizado com sucesso!");
               } else {
                   System.out.println("Erro ao processar o depósito. Por favor tente novamente!");
               }               
            } else if (opcao == MENU_SAQUE) {
                System.out.println("Digite o valor do saque:"); 
                
               if(conta1.fazerSaque(scan.nextInt())){
                   System.out.println("Saque realizado com sucesso!");
               } else {
                   System.out.println("Erro ao processar o saque. Por favor tente novamente!");
               }                
            } else if (opcao == MENU_SALDO) {
                System.out.println("O valor do Saldo é: " + conta1.getSaldo());
            } else {
                scan.close();
                break;
            }            
        }
        System.out.println("");
        System.out.println("Sistema encerrado com sucesso!");
    }
    
    private static void showMenu(){
        System.out.println("FAVOR ENTRE COM A OPÇÃO DESEJADA:");
        System.out.println("1 - FAZER DEPÓSITO");
        System.out.println("2 - FAZER SAQUE");        
        System.out.println("3 - VISUALIZAR O SALDO");        
        System.out.println("4 - ENCERRAR");        
    }
}