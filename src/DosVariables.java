import java.util.Scanner;

public class DosVariables
{
    public static void main(String[] args)
    {
        System.out.print("Ingresa el primer numero : ");
        Scanner teclado1=new Scanner(System.in);
        int a=teclado1.nextInt();
        System.out.print("Ingresa el segundo numero : ");
        Scanner teclado=new Scanner(System.in);
        int b=teclado.nextInt();


      if (a==b){
          System.out.println("los numeros son iguales");
      }

      else if (a<b){
          System.out.println("el numero " + a + " es menor que el numero " + b);
      }

      else {
          System.out.println("el numero " + a + " es mayor que el numero " + b);
      }

        }
    }
