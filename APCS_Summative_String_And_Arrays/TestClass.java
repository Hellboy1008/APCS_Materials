import java.util.Scanner;

public class TestClass
{
    public static void main (String args[]){
        int x;
        Enigma code_breaker = new Enigma();
        Scanner input = new Scanner (System.in);
        Scanner in = new Scanner (System.in);
        System.out.println ("Click 1 for encryption");
        System.out.println ("Click 2 for decryption");
        x = input.nextInt();

        //Strings 
        String a = "Hello World";
        String b = "hello World";
        String c = "Type the code you want to encrypt Type the code you want to decrypt";

        if (x == 1){
            if (a.compareTo(b) == -32){
                System.out.println(c.substring(0,33));
                String code = in.nextLine();
                System.out.println(code_breaker.encrypt(code));
            }
        }
        if (x == 2){
            if (a.indexOf('l') == 2 && a.equalsIgnoreCase(b)){
                System.out.println(c.substring(34,67));
                String code = in.next();
                System.out.println(code_breaker.decrypt(code));
            }
        }
    }
}

