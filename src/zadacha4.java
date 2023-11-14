import java.util.Scanner;

public class zadacha4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n>0) System.out.println(n*n);
        else if (n<0) System.out.println(n+1);
        else System.out.println(0);

    }
}
