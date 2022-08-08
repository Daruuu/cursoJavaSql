package exerJava21;

public class Login {
    public static void main(String[] args) {
        Login l = new Login();
        l.LoginFunction("admin", "1234");
    }
    public void LoginFunction(String user, String passwd){
        String answer = user.equals("admin") && passwd.equals("1234")
                ? "Login TRUE"
                : "Login FALSE";
        System.out.println(answer);
    }

}
