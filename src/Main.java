import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        if(n<5) System.out.println("Число меньше 5");
        else if (n==5) System.out.println("Число равно 5");
        else System.out.println("Число больше 5");

    }
}