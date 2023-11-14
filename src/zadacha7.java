import java.util.Scanner;

public class zadacha7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(((a+b)>b)&&((b+c)>a)&&((c+a)>b)) System.out.println("This is a Triangle");
        else System.out.println("It is not a Triangle");
    }
}
