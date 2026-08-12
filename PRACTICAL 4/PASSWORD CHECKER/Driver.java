import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PasswordChecker p = new PasswordChecker();

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter Password " + i + ": ");
            String pw = sc.nextLine();

            System.out.println("Length >= 8 : " + p.hasLength(pw));
            System.out.println("Has Uppercase : " + p.hasUpper(pw));
            System.out.println("Has Digit : " + p.hasDigit(pw));
            System.out.println("Has Special Character : " + p.hasSpecial(pw));

            System.out.println("Strength : " + p.strength(pw));
            System.out.println();
        }

        sc.close();
    }
}