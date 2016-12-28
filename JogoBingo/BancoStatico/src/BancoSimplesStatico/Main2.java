/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoSimplesStatico;


import Ultil.Teclado;

/**
 *
 * @author Notorius B.I.G regra de negocio = relacionado regas que agente tem
 comprir
 */
public class Main2 {

    public static void menu() {
        System.out.println("\n1 - Adiciona Conta\n2 - Buscar Conta\n3 - saque\n4 - Depositar\n5 - Total de Contas");
    }

    public static void main(String[] a) {
        int opcao;
       // Agencia1 agencia = new Agencia1();
       // Conta conta ;

        do {
            menu();
            opcao = Teclado.lerInteiro("Opcao :");

            if (opcao == 1) {
                //adicionar conta
                int numero = Teclado.lerInteiro("Informe o numero da conta : ");
                String titular = Teclado.lerString("Informe nome : ");
                Agencia1.addConta(new Conta(titular, numero));
               

            } else if (opcao == 2) {
                //Localizar Conta
                int numero = Teclado.lerInteiro("informe o numero da conta ");
                Conta temp = Agencia1.Localizar(numero);

                if (temp != null) {
                    System.out.println("saldo" + temp.getSaldo());
                }

            } else if (opcao == 3) {
                //SACAR 
                int numero = Teclado.lerInteiro("Informe o numero da Conta :");
                Conta temp = Agencia1.Localizar(numero);
                if (temp != null) {
                    double valor = Teclado.lerDouble("informe o saque");
                    temp.sacar(valor);

                }
            } else if (opcao == 4) {
                //DEPOSITAR 
                int numero = Teclado.lerInteiro("Informe o numero da Conta :");
                Conta temp = Agencia1.Localizar(numero);
                if (temp != null) {
                    double valor = Teclado.lerDouble("informe o Deposito");
                    temp.deposito(valor);

                }
            }else if(opcao == 5){
                //TOTAL DE CONTAS     
                 
                int total = Conta.getTotalDeContas();
                System.out.println(total);
            }

        } while (opcao > 0);
    }
}
