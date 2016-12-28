/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BancoSimplesStatico;

import java.util.LinkedList;

/**
 *
 * @author Notorius B.I.G
 */
public class Agencia2 {
    
    private Conta conta;
    private static LinkedList<Conta> lista;
    
    public Agencia2() {
        conta = new Conta("" , 0);
        lista = new LinkedList<>();
        
    }
    
    public  static void addConta(Conta conta) {
          lista.add(conta);
    }
    
    public static boolean buscaConta(String nome) {
        
        for (Conta conta1 : lista) {
            if (conta1.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public void ImprimeLista() {
        for (Conta conta1 : lista) {
            System.out.println(conta1);
        }
    }
    
    
    
}
