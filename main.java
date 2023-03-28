import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); //lector leera la cadena ingresada por el usuario
        
        System.out.print("Ingrese la cadena a analizar: ");
        String cadena = lector.nextLine();

        System.out.println(cadena);
        
    }
}