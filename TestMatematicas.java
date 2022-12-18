package practicaGit;

import java.util.Scanner;

public class TestMatematicas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = sc.nextInt();

        if(Matematicas.esPar(numero))
        {
            System.out.println( "EL Numero " + numero + " Es Par ");
        }
        else
        {
            System.out.println("El Numero " + numero + " Es Impar");
        }


    }
}
