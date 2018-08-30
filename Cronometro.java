
package principal;


import java.util.Scanner;
public class Cronometro{
       		public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
                    
		int hora=0;
		int minuto=0;
		int segundo=0;
                int num;
                
                do {
                    
                    System.out.printf("Ingrese numero para iniciar");
                    num=sc.nextInt();
                
                do{System.out.printf("%d H %d M %d S %d D %d C \n", hora,minuto,segundo,(segundo*10),(segundo*100));
		    
                    ++segundo;
		
                    if(segundo == 60) {
			minuto++;
			segundo = 0;
                    }   
                    if(minuto == 60) {
			hora++;
			minuto = 0;
			segundo =0;
                    }
                    
                    Thread.sleep(1000);
                        
                  }while(true&&segundo<=05&&minuto==0);
                        
    } while(num>0);
   }
}
    

