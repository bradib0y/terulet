/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;

/**
 *
 * @author xzkj70
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner be = new Scanner(System.in);
        
        System.out.println(" *** *** TÉGLALAP TERÜLET SZÁMOLÓ *** *** ");
                
        int a,b;
        do{
        System.out.println("Kérem adja meg az A számot! (10-nél nagyobbat)");    
        a = be.nextInt();} while (a<10);
        do{       
        System.out.println("Kérem adja meg az B számot! (10-nél nagyobbat)"); 
        b = be.nextInt();} while (b<10);
        
        System.out.println("A terület: " + T(a,b));
        
    
    }
    
    private static int T(int a, int b){
    return a*b;
    }
    
    
}
