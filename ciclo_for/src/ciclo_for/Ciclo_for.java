package ciclo_for;

public class Ciclo_for {

    public static void main(String[] args) {

        /*int p = 0;
        
        for (int a = 0; a < 10; a++) {

           //p = p + 1;
           p++;
           
            System.out.println(p);
        }*/
        /*for (int a = 0; a < 5; a++) {

            if (a == 3) {

                break;

            }

            System.out.println(a);

        }*/
        
        String[] array = {"Hola", "Como", "estas"};
        
        for(int i = 0; i < array.length; i++){
            
            System.out.println(array[i]);
            
        }
        
        System.out.println("for mejorado para el array");
        
        for(String s : array){//s seria el apodo de los string que estan en el array
            
            System.out.println(s);
            
        }

    }

}
