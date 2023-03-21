import java.util.Scanner;

/* Safe password
The password is hard to crack if it contains at least one uppercase letter, at least one lowercase letter, at least one digit and includes 12 or more symbols. For a given string you should output "YES" if this password is hard to crack, otherwise output "NO".
Sample 1:
Password1234
YES

Sample 2:
SuperSecretPass
NO

*/
class Main {
    public static void main(String[] args) {

        String[] regex = { "\\s*[a-z]\\s*", "\\s*[A-Z]\\s*", "\\s*\\d\\s*" };
        Boolean[] checks = { false, false, false };
        Scanner scanner = new Scanner(System.in);

        String[] password = scanner.nextLine().split("");
        for (String l : password) {
            if (l.matches(regex[0]))
                checks[0] = true;
            if (l.matches(regex[1]))
                checks[1] = true;
            if (l.matches(regex[2]))
                checks[2] = true;
        }
        if (checks[0] && checks[1] && checks[2] && password.length >= 12) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}