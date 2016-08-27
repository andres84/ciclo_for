
package ciclo_for;

import java.util.Scanner;

/*

obtener la cantidad de los primeros N numeros multiplos de 5

*/

public class nMultiplos5 {

public static void main(String... andres){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite hasta que numero positivo se va a calcular los multiplos de 5");
    int numero = sc.nextInt();
    
    int cont = 0;
    
    for(int i = 0; i < numero; i = i + 5){
        
        cont = cont + 1;
        
    }
    
    System.out.println("Los numeros multiplos de 5 hasta " + numero + " son " + cont);
    
    
}

    
}
