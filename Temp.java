package principal;
import java.util.Scanner;
public abstract class Temp {
     

  
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		int hora=0;
		int minuto=0;
		int segundo;
                int valor1;
                System.out.println("Ingrese unidad de tiempo:");
                System.out.println("1.Segundos");
                System.out.println("2.Minutos");
                int num = sc.nextInt();
                switch(num){
                case 1:
                System.out.println("Ingrese segundos:");
		segundo = sc.nextInt();
                                                  
                    do
                    {System.out.printf("%d S\n",segundo);
			
			--segundo;
		
			if(segundo == 0) {
                        System.out.printf("Tiempo terminado");
                        
			}

			Thread.sleep(1000);
			}while(true&&segundo>=0);
            
                break;
                case 2:
                System.out.println("Ingrese minutos:");
		int b =sc.nextInt();
                segundo=(b*60);
                                                  
                    do
                    {System.out.printf("%d S\n",segundo);
			
			--segundo;
		
			if(segundo == 0) {
                        System.out.printf("Tiempo terminado");
                        
			}

			Thread.sleep(1000);
			}while(true&&segundo>=0);
            
                break;
               
     		
}
}
}