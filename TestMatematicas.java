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
            System.out.println( "\nEL Numero " + numero + " Es Par ");
        }
        else
        {
            System.out.println("\nEl Numero " + numero + " Es Impar");
        }

        if (Matematicas.esDivisiblePorTres(numero))
        {
            System.out.println("\nEl Numero " + numero + " Es Divisible por 3");
        }
        else
        {
            System.out.println("\nEl Numero " + numero + " No es Divisible por 3");
        }

        if (Matematicas.esDivisiblePorCinco(numero))
        {
            System.out.println("\nEl Numero " + numero + " Es Divisible por 5");
        }
        else
        {
            System.out.println("\nEl Numero " + numero + " No es Divisible por 5");
        }
    }
}
