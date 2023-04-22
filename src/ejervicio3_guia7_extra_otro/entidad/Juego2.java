/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejervicio3_guia7_extra_otro.entidad;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Joselo
 */
public class Juego2 {
  Scanner leer = new Scanner(System.in); 
    
  private int num1; 
  private int num2; 
  private int victorias2;   
  private int victorias1; 

    public Juego2() {     
    } 

    public Juego2(int num1, int num2, int victorias2, int victorias1) {
        this.num1 = num1;
        this.num2 = num2;
        this.victorias2 = victorias2;
        this.victorias1 = victorias1;
    }

    public void iniciar_Juego2() { 
    int intentos = 2;
    String resp = "No"; 
    do { 
        //System.out.println("Jugador N°1: Ingrese un numero"); 
        //num1 = leer.nextInt();
        String num=JOptionPane.showInputDialog("Jugador N°1: Ingrese un numero");
        num1=Integer.parseInt(num);
        
        //System.out.println("Jugador N°2: Adivine el numero ");
        //num2 = leer.nextInt();
        String numx=JOptionPane.showInputDialog("Jugador N°2: Adivine el numero ");
        num2=Integer.parseInt(numx);
                
        do { 
           if (num1 == num2) { 
                JOptionPane.showMessageDialog(null,"El numero es correcto");
                //System.out.println("El numero es correcto");
                System.out.println(" ");
                victorias2++;     
        } else {
           JOptionPane.showMessageDialog(null,"Jugador N°2: Numero equivocado. Ingrese otro numero ");    
           //System.out.println("Jugador N°2: Numero equivocado. Ingrese otro numero ");    
           JOptionPane.showMessageDialog(null,"Le quedan " + intentos + " intentos");
           //System.out.println("Le quedan " + intentos + " intentos");  
               System.out.println(" ");
            if (num1 > num2) { 
                System.out.println("El numero buscado es mayor"); 
                System.out.println(" ");
            } else {       
                System.out.println("El numero buscado es menor"); 
                System.out.println(" ");
            }
            intentos--;
            String numxx=JOptionPane.showInputDialog("Jugador N°2: Adivine el numero ");
            num2=Integer.parseInt(numxx);
            
            //num2 = leer.nextInt();
            
            if (num1 == num2) {
            System.out.println("Advinaste !!! El numero es correcto"); 
                System.out.println(" ");
            victorias2++; 
            }
            if (intentos == 0 && num1 != num2) { 
            System.out.println("Se ha quedado sin intentos "); 
                System.out.println(" ");
            victorias1++;    
            }
            }
        } while (intentos > 0 && num1 != num2); 
        //System.out.println("Desea seguir Jugando - Si/No ?");
        
        //resp = leer.next();
        
        resp=JOptionPane.showInputDialog("Desea seguir Jugando - Si/No ? ");
                
        if (resp.equalsIgnoreCase("Si")) { 
        intentos = 2; 
        }
        } while (resp.equalsIgnoreCase("Si"));
    
        System.out.println("Victorias del Jugador N°1:  "+victorias1);
        System.out.println(".......................................");
        System.out.println(" ");
    
        System.out.println("Victorias del Jugador N°2:  "+victorias2);
        System.out.println(".......................................");
        }
    
    
    
    
        public int victorias1() { 
          return victorias1;   
        }
       
        
        public int victorias2() { 
          return victorias2;   
        }

}
