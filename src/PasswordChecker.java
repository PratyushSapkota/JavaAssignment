import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 4; i > -1; i--){
            System.out.println("Enter username: ");
            String username = sc.next();
            System.out.println("Enter password: ");
            String password = sc.next();

            if(username.equals("pratyush") && password.equals("pratyush")){
                System.out.println("Correct login");
                break;
            } else if (username.equals("pratyush")) {
                System.out.println("You've entered the wrong password.");
                System.out.println("You have " + i + " tries left.");
            }else {
                System.out.println("You've entered the wrong credentials");
                System.out.println("You have " + i + " tries left.");
            }
        }
    }
}
