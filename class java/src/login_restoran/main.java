package login_restoran;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        String user, password;
        int cek = 2;

        login customer = new login();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("======== LOGIN ========");
            System.out.print(" Masukan Username : ");user = scanner.nextLine();
            System.out.print(" Masukan Password : ");password = scanner.nextLine();

            if (user.equals(customer.getUsername_admin()) && password.equals(customer.getPassword_admin()) ||
                user.equals(customer.getUsername_customer()) && password.equals(customer.getPassword_customer())){
                cek = 0;
                if (user.equals(customer.getUsername_admin())){
                    System.out.println("Welcome Admin");
                }else if (user.equals(customer.getUsername_customer())){
                    System.out.println("=======================");
                    System.out.println("      Welcome User");
                }
            }else{
                System.out.println("Username/Password anda salah!");
            }
        }while (cek == 2);
    }
}
