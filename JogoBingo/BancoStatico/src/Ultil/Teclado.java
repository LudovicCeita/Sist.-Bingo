/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ultil;

import java.util.Scanner;

/**
 *
 * @author Notorius B.I.G
 */
public class Teclado {
    
    public static int lerInteiro(String mensagem ){
        
        System.out.println(mensagem);
        Scanner SC  = new Scanner(System.in);
        
        return SC.nextInt();
    }
    
    public static String lerString(String mensagem ){
        
        System.out.println(mensagem);
        Scanner SC  = new Scanner(System.in);
        
        return SC.next();
    }

        public static double lerDouble(String mensagem ){
        
        System.out.println(mensagem);
        Scanner SC  = new Scanner(System.in);
        
        return SC.nextDouble();
    }

    
}
