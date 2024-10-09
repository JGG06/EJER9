import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzaca un numero del 0 al 99.999 y te dira el numero de cifras que tiene");
        int numero = sc.nextInt();
        sc.close();

        if (numero>=0 && numero<=9) {
            System.out.println("Es un numero de una cifra");
        }else if (numero>9 && numero<=99) {
            System.out.println("Es un numero de dos cifras");
        }else if (numero>99 && numero<=999) {
            System.out.println("Es un numero de tres cifras");
        }else if (numero>999 && numero<=9999)  {
            System.out.println("Es un numero de cuatro cifras");
        }else if (numero>9999 && numero<=99999) {
            System.out.println("Es un numero de cinco cifras");
        }
    }
}
