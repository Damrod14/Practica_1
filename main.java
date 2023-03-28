import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); //lector leera la cadena ingresada por el usuario
        
        System.out.print("Ingrese la cadena a analizar: ");
        String cadena = lector.nextLine();//guardamos la informacion en "cadena"

        A_lex analizador = new A_lex(cadena);
        List<Token> tokens = analizador.listaToken();
        for(Token token : tokens) {

            System.out.println(token.getEtiqueta() +":"+ token.getValor());
        }
        
        lector.close();  
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

class A_lex{
    private String entrada;

    public A_lex(String entrada){
        this.entrada = entrada; //creamos la propiedad y asignamos el valor entrada
    }

    public List<Token> listaToken(){//creamos una lista con los tokens 
        List<Token> tokens = new ArrayList<>();

        String[] cadena = entrada.split(" "); //dividmos la entrada en palabras y se añaden al arreglo
        for (String palabra : cadena) {//recorremos todos los elementos del arreglo palabra para compararlos y etiquetarlos
            
            if (palabra.matches("[a-zA-Z_(][a-zA-Z0-9_)-]*")){//definimos una expresión regular la cual indica como puede comenzar la cadena de entrada, "*" indica cero o mas veces
                tokens.add(new Token("String", palabra)); 
            }

            else if (palabra.matches("[0-9]+")){//expresion regular para etiquetar los numeros del 0 al 9 el "+" es para indicar "uno o más"
                tokens.add(new Token("Int", palabra));
            } 

            else if (palabra.matches("[+\\-*/=]")){//expresion regular para etiquetar los simbolos operadores, el "\\ es para indicar que los simbolos siguientes se busquen tal cual y no los interprete como caracter especial"
                tokens.add(new Token("Operador", palabra));
            }
        }
        return tokens;
    }
    
}