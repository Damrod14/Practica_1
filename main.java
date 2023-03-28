import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); //lector leera la cadena ingresada por el usuario
        
        System.out.print("Ingrese la cadena a analizar: ");
        String cadena = lector.nextLine();//guardamos la informacion en "cadena"

        System.out.println(cadena);
        
    }
    
}

class Token{ //creamos clase Token con dos variables privadas, etiqueta y valor
    private String etiqueta;
    private String valor;
    public Token(String etiqueta, String valor){
        this.etiqueta = etiqueta;//asignamos etiqueta a la propiedad etiqueta
        this.valor = valor;//asignamos valor a la propiedad valor
    }

    public String getEtiqueta(){//obtenermos el dato etiqueta
        return etiqueta;//devolvemos el dato etiqueta
    }

    public String getValor(){//obtenermos el dato de valor
        return valor;//devolvemos el dato valor
    }
}