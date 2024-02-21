import java.util.Scanner; //Scanner Class Imported 
public class Login{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Scanner as sc

        System.out.print("Enter Your Username: ");
        String username = sc.nextLine(); //Using Scanner to take user string input (Username)
        System.out.print("Enter Your Password: ");
        String password = sc.nextLine(); //Using Scanner to take user string input (Password)

        if(username.equals("Harsh")){ //Checking if username match
            if(password.equals("Harsh123")){ //Checking if password match
                System.out.println("Welcome, Harsh\nYou have successfully logged into your account.");   
                //Login Successful (Prompting)
            }
            else{ //Negative Output or Alternative Response (Password)
                System.out.println("Sorry, Password is not correct.");
                //Password Error (Prompting)
            }
        }
        else{ //Negative Output or Alternative Response (Username)
            System.out.println("Sorry, Username is not correct.");
            //Username Error (Prompting)
        } 
    }
}