package login_restoran;

public class login {

    private String username_admin,password_admin,
                    username_customer,password_customer;

    public login(){
        username_admin = "admin";
        password_admin = "12345";

        username_customer = "user";
        password_customer = "54321";
    }

    //setter
    public void setUsername_admin(String username_admin) {this.username_admin = username_admin; }
    public void setPassword_admin(String password_admin) {this.password_admin = password_admin; }
    public void setUsername_customer(String username_customer) {this.username_customer = username_customer; }
    public void setPassword_customer(String password_customer) {this.password_customer = password_customer; }

    //getter
    public String getUsername_admin() { return username_admin; }
    public String getPassword_admin() { return password_admin; }
    public String getUsername_customer() { return username_customer; }
    public String getPassword_customer() { return password_customer; }
}
