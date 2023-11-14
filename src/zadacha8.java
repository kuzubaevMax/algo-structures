import java.util.Scanner;

public class zadacha8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (((n*n)%5)==0) System.out.println("Green");
       else if(((n*n)%3)==0) System.out.println("Yellow");
        else System.out.println("Red");
    }
}
