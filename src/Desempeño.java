
import java.util.Scanner;

public class Desempeño {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese nombre");
        String nombre = scanner.nextLine();

        System.out.println("numero de documento ");
        int documento = scanner.nextInt();

        System.out.println("ingrese nivel de desempeño ");
        int desempeño = scanner.nextInt();

        if (true) {
            
        } else {
        }

        if (desempeño > 0 && desempeño < 59);
        {
            System.out.println("desempeño insuficiente");

        }if(desempeño > 60 && desempeño < 74)
        {
            System.out.println("desempeño aceptable");
        }

        if (desempeño > 75 && desempeño < 89);
        {
            System.out.println("buen desempeño");
            {
             if  ( desempeño>90 && desempeño <100 );  
            }
            System.out.println("desempeño sobresaliente");
        }

        System.out.println("tu nombre es" + nombre);
        System.out.println("tu numero de documento es" + documento);
        System.out.println("tu desempeño es " + desempeño);

    }
}
