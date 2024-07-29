import java.util.Scanner;

/**
 * voting
 */
public class voting {

    public static void Voting18(int n){

        if ( n <= 0 ){
            System.out.println("Enter Valid Age");
        } else if ( n >= 18 ){
            System.out.println("This Person is Eligible for Voting.");
        } else {
            System.out.println("This Person is not Eligible for Voting.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age = ");int n = sc.nextInt();

        Voting18(n);
    }
}