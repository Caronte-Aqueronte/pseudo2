import java.util.Scanner;

public class Seudo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = scanner.nextInt();
        System.out.println("");
        while (num >= 1) {
            System.out.println(num);
            num--;
        }
    }
}