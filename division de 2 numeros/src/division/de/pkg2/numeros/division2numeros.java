package division.de.pkg2.numeros;
import java.util.Scanner;
public class division2numeros 
{

    public static void main(String[] args) 
    {
        Scanner leer=new Scanner (System.in);
        float n1, n2, r;
        System.out.print("Ingresa primer numero: ");
        n1=leer.nextFloat();
        System.out.print("Ingresa el segundo numero: ");
        n2=leer.nextFloat();
        r=n1/n2;
        System.out.print("La division es: "+r); 
    } 
}
