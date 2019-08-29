
package poojavaaula06;

import java.util.Scanner;

public class PooJavaAula06 {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int [] numInt= new int[5];
        int i;
 for ( i = 1; i < numInt.length; i++){
         
     System.out.print("Digite "+ i + "° numeros: "); 
     numInt[i] = scan.nextInt();
     }
     
    System.out.print("Ordem Dcrescente:    "); 
    for (int j = 0; j < numInt.length; j--){
       	System.out.print(numInt[j]+ "  ");       		
            }
	}
}	
