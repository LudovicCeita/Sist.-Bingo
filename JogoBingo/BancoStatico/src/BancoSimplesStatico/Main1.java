/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoSimplesStatico;

import BancoSimplesStatico.Agencia2;
import BancoSimplesStatico.Conta;

/**
 *
 * @author Notorius B.I.G
 */
public class Main1 {

    public static void main(String[] a) {

        Conta conta1 = new Conta("Joao" , 123);
        Agencia2 agencia = new Agencia2();

        conta1.setNome("joao");
        conta1.setNumeroDaConta(123);
        conta1.deposito(50);

        agencia.addConta(conta1);        
       
        
        agencia.ImprimeLista();
        System.out.println(agencia.buscaConta("Joao"));

    }
}
