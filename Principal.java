package principal;
import principal.Temp;

import java.util.Scanner;

public class Principal {
   
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese:");
        System.out.println("1.Cronometro");
        System.out.println("2.temporizador");
        int base = sc.nextInt();
        Principal c = new Principal();
        switch(base){
            case 1:
                c.Cronometro();
                break;
            case 2:
                c.Temp();
                break;

            default:
                c.Cronometro();
                break;
        }
    }

    private void Cronometro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Temp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }

