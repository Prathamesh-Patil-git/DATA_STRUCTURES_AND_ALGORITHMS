import java.util.*;

public class opps_practice {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank();

        System.out.print("Enter Username : ");
        String username = sc.next();

        System.out.print("Enter Password : ");
        int password = sc.nextInt();

        b1.set_acc(username, password);

        System.out.println("Username : "+b1.display_username());        
        System.out.println("Username : "+b1.display_password());        
        
        System.out.print("Enter a newpassword : ");
        int newpwd = sc.nextInt();
        b1.change_password(newpwd);

        System.out.println("Username : "+b1.display_username());        
        System.out.println("Username : "+b1.display_password()); 

        sc.close();
        
    }
}

class Bank {

    private String username;
    private int password;

    //acc setter
    public void set_acc(String username, int password){

        this.username = username;
        this.password = password;
    }

    //pwd setter
    public void change_password(int pwd){
        password = pwd;
    }
    

    //username getter
    public String display_username(){
        return username;
    }

    public int display_password(){
        return password;
    }

    
}