import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        //? needs escaping
        String[] splitUrl = url.split("\\?");
        String[] params = splitUrl[1].split("&");

        //Split strings need to return with = replaced by space : space
        //if cookie has no extra param, cookie should say not found

        String password = "";
        for (String param : params) {
            if (param.contains("pass=")) {
                password = param;
                param = param.replace("=", " : ");
            }
            if (Objects.equals(param, "cookie=")) {
                param = param.replace("=", " : not found");
            }
            param = param.replace("=", " : ");

            System.out.println(param);
            //if password exists, print "password : " + password number
        }
        if (!password.equals("pass=")) {
            System.out.println(password = password.replace("pass=", "password : "));
        }

    }
}
