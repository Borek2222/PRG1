import java.util.*;

public class Main{

     public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int in;
       boolean check = false;
       
       System.out.println("Zadejte cislo");
       in = sc.nextInt();
  
       
       if (in % 7 == 0) {
           check = true;
           System.out.println("Cislo je delitelne 7");
       }
       
       else {
           System.out.println("Cislo neni delitelne 7");
       }
       
       
       
       System.out.println("\n-------------------------------------------\n");
       System.out.println("Prvocisla\n");
      
       
       
       for (int i = 2; i < 100; i++) {
          
           boolean control = true;
           
           for (int j = 2; j <= i/2; j++) {
               
                if (i % j == 0) {
                    control = false;
                }
            }
           
            if (control == true) {
                System.out.println(i);
            }
           
       }
         
     }
}
