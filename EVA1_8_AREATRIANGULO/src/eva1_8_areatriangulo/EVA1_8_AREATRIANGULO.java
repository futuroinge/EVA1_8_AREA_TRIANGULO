/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_areatriangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_AREATRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double area;
        double altura;
        double base;
        
        Scanner input = new Scanner(System.in);
        System.out.print("CUAL ES LA ALTURA DEL TRIANGULO?");
        base = input.nextDouble();
        System.out.print("CUAL ES  LA BASE DEL TRIANGULO?");
        altura = input.nextDouble();
        area = (base*altura)/2;
        System.out.println("EL AREA DEL TRIANGULO ES:"+area);
    }
    
}
