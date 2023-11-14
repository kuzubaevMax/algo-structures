import java.util.Scanner;
public class zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (((n == 1) || (n == 2) || (n == 12))) System.out.println("Winter");
        else if ((n == 3) || (n == 4) || (n == 5)) System.out.println("Spring");
        else if ((n == 6) || (n == 7) || (n == 8)) System.out.println("Summer");
        else if ((n == 9) || (n == 10) || (n == 11)) System.out.println("Autumn");
        else System.out.println("Month entered wrong");
    }
}
