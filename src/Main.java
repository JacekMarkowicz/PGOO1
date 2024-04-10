import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("podaj liczbę:");
        Integer liczba = scan.nextInt();
        if (liczba > 0) {
            System.out.println("to jest liczba dodatnia");
        }
        if (liczba < 0) {
            System.out.println("to jest liczba ujemna ");
        } if(liczba==0) {System.out.println("to jest zero");}
    }

}