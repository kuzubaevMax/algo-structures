import java.util.Scanner;

public class zadacha6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n%400==0)&&(n%4==0)) System.out.println("Year is Visokosniy");
        else System.out.println("Year is Simple");

    }
}
