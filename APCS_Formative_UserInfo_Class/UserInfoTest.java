import java.util.Scanner;

public class UserInfoTest {
    String a;
    String b;
    String c;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        UserInfo person = new UserInfo();

        // ask for UserInfo
        System.out.println("Previous User Info:");
        System.out.println("Sausage");
        System.out.println("180536");
        System.out.println("08/25/00");
        
        System.out.println("Please input your Name:");
        String a = scan.next();
 
        System.out.println("Please input staff ID: ");
        String b = scan.next();

        System.out.println("Please input Date of Birth (MM/DD/YY)");
        String c = scan.next();
        
        person.user_name_1(a);
        person.staff_id_1(b);
        person.date_of_birth_1(c);

        System.out.println("New User Info:");
        System.out.println(person.GetUserName());
        System.out.println(person.GetStaffID());
        System.out.println(person.GetDateOfBirth());

        scan.close();
    }

}
