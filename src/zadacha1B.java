import java.util.Scanner;

public class zadacha1B {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        if(n>50&&n<100) System.out.println("Число "+n+" содержится в интервале");
        else System.out.println("Число "+n+" не содержится в интервале");
    }
}
