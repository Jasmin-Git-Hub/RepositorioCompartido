//En esta clase llamaremos a los métodos que nor sirvan para ejecutar el método principal
//En esta clase se desarrolla el menú principal del programa
import java.io.IOException;
import java.util.Scanner;
public class Controlador {
    private final Scanner sc;
    
    public Controlador(Scanner sc){
        this.sc = sc;
    }
    public void menu() throws IOException{
        int opc;
        do{
            System.out.println("\nMenú de opciones");
            System.out.println("1. Calculadora");
            System.out.println("2. Conversor");
            System.out.println("3. Contador");
            System.out.println("4. Banco");
            System.out.println("5. Auto");
            System.out.println("6. Libro");
            System.out.println("7. División");
            System.out.println("8. División con"
                    + " entrada de usuario");
            System.out.println("9. ValidarEdad");
            System.out.println("10. Archivo");
            System.out.println("0. Salir");
            System.out.print("Elija una opción:");
            try {
                opc = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opc = -1;
            }
            switch (opc) {
                case 1:
                    demoCalculadora();
                    break;                
            }
        }
        while(true && !false);
        
    }
   private void demoCalculadora(){
       Calculadora c = new Calculadora();
       System.out.println("Sumar 2 + 3 = " +
               c.sumar(2, 3));
       System.out.println("Sumar 1+2+3=" + 
               c.sumar(1,2, 3));
       System.out.println("Sumar 2.3 + 5.9 =" +
               c.sumar(2.3, 5.9));
   } 
    
}
