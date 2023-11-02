
import java.util.Scanner;

public class LoginPass {
    final static String userName = "Kamal";
    final static String userPassword = "Kamal@123";
    
    
    String userN;
    String userP;
    Scanner sc = new Scanner(System.in);
    
    public void login() {        
        System.out.println("WELCOME TO CAMERA RENTAL APP");        
        while(true) {
            System.out.print("USERNAME : ");
            userN= sc.next()+sc.nextLine();
            System.out.print("PASSWORD : ");
            userP= sc.next()+sc.nextLine();
            if(validate(userN, userP)) {
                RentalServices rentalServices = new RentalServices();
                rentalServices.show();
                break;
            }else {
                if(!(userName.equals(userN))) {
                    System.out.println("Invalid user name please re-enter again.");    
                    
                }else {
                    System.out.println("Invalid password please re-enter again.");
                }
                System.out.println("Invalid User name and password please re-renter again");
            }        
        }    
    }

    
    boolean validate(String userN,String userp) {
        if(userName.equals(userN) && userPassword.equals(userp)) {
            return true;
        }
        return false;
    }
    
}