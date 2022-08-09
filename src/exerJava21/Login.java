package exerJava21;

// realiza una funcion llamada LOGIN que acepte 2 parametros
// el usuario es "admin" y la passwd "1234" o no.
//Retorne "login true" o "login false"
public class Login {
    public static void main(String[] args) {
        Login l = new Login();
        l.LoginFunction("admin", "1234");
        l.LoginFunction("color", "1235234");

    }
    public void LoginFunction(String user, String passwd){
        String answer = user.equals("admin") && passwd.equals("1234")
                ? "Login TRUE"
                : "Login FALSE";
        System.out.println(answer);
    }
}
