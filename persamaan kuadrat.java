/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.si;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TugasSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PENCARIAN AKAR PERSAMAAN KUADRAT DENGAN RUMUS ABC");
    //Variabel
        int a, b, c;
        double D, x1, x2; 
        Scanner scanInput = new Scanner(System.in);
        
    //Input Dan Output Dari User
        System.out.print("Nilai a: ");
        a = scanInput.nextInt();
        System.out.print("Nilai b: ");
        b = scanInput.nextInt();
        System.out.print("Nilai c: ");
        c = scanInput.nextInt();      
        System.out.println("Persamaan yang terbentuk:");
        System.out.print(a + "x^2 ");
        
    //Proses Perhitungan
        D = b * b - (4 * a * c);      
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            
    //Hasil Output
        if(b < 0){
            System.out.print("- " + (-b) + "x ");
        }else if(b > 0)        
            System.out.print("+ " + b + "x ");
        if(c < 0){
            System.out.println("- " + (-c) + " = 0");
        }else if(c > 0){
            System.out.println("+ " + c + " = 0");
        }else
            System.out.println(" = 0");       
        
            System.out.println("Akar Persamaan x1 = " + x1 + " atau x2 = " + x2);       
    }
}
    
