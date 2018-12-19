public class UserInfo {

    private String user_name;
    private String staff_id;
    private String date_of_birth;

    public String GetUserName() {

        return user_name;

    }

    public  String GetStaffID() {

        return staff_id;

    }

    public String GetDateOfBirth() {

        return date_of_birth;
    }

    public void user_name_1 (String user_name_1){
        this.user_name = user_name_1; 
    }

    public void staff_id_1 (String staff_id_1){
        this.staff_id = staff_id_1; 
    }

    public void date_of_birth_1 (String date_of_birth_1){
        this.date_of_birth = date_of_birth_1; 
    }
}