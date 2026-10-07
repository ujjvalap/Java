import java.util.*;

class Question1 {
    public static void main(String[] args) {
        
        // Take the input of the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int Num1 = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int Num2 = sc.nextInt();

        System.out.print("Enter the Third Number: ");
        int Num3 = sc.nextInt();

        int avg = (Num1 + Num2 + Num3) / 3;

        System.out.print("Avg of the Numbers is: " + avg);
    }
}