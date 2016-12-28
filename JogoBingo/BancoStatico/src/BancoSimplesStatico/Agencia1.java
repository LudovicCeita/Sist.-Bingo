/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BancoSimplesStatico;

import java.util.ArrayList;

/**
 *
 * @author Notorius B.I.G
 metodo staitic nao pose manipula atriputos nao statatico pq 
 */
public class Agencia1 {
    
    private static ArrayList<Conta> conta = new ArrayList<>();
    
    
    public static void addConta(Conta con ){
        conta.add(con);
    }
    
    public static Conta Localizar(int numero ){
        for (Conta conta1 : conta) {
            if(conta1.verificaNumero(numero)){
                return conta1;
            }
        }
        return null;
    }
    
    
}
