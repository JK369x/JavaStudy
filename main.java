import java.security.cert.X509CRLEntry;
import java.util.Scanner;

public class main {
      public static  void main(String[] args) {
               
       Scanner key = new Scanner(System.in);
	    //int user;

        System.out.print("Step 1. Enter amount of all account = ");
        int num1 = key.nextInt();
        

        System.out.println("Step 2. Enter Detail of each account. ");
        //int num2 = key.nextInt();


            //////////
            String name_id;
            String name_name2;
            String name_pass;
            Double name_ban;
            User[] user1;
            String num2;
            String num3;  
            user1 = new User[num1];
            int save = 0;
            Boolean infi = false;
            String choose;
            Double x;
            Double y;
            Boolean unsigned = true;
           
            
            /////////

            for(int i=1; i<=num1; i++) {
            System.out.println("No."+i);  
          
        
           do{ 
            System.out.print("Account ID = ");
            name_id = key.next(); 
            if ((name_id.length()>13 || name_id.length()<13)) {
                System.out.println("Please enter ID 13 characters!!!");
            }
            }while((name_id.length()>13 || name_id.length()<13));
            ///////////////////////////////////////////////////////////////////////////// ID
                 
            do {
            System.out.print("Account Name = ");
            name_name2 = key.next();
            if ((name_id.length()>=50 )) {
                System.out.println("Please enter 50 characters!!!");
            }
            }while((name_name2.length()>=50));           
            ///////////////////////////////////////////////////////////////////////////// Name

            do {
            System.out.print("Password = ");
            name_pass = key.next();
            if ((name_pass.length()>4 || name_pass.length()<4)) {
                System.out.println("Please enter password 4 characters!!!");
            }          
            }while((name_pass.length()>4 || name_pass.length()<4));
            ////////////////////////////////////////////////////////////////////////////// Pass


            do {
            System.out.print("Balance = ");
            name_ban = key.nextDouble();
            if (((name_ban > 10000000))) {
                System.out.println("Please don't enter more than balance 1,000,000 bath!!!");
            }         
            }while(((name_ban > 1000000)));
            ///////////////////////////////////////////////////////////////////////////// Banlance

            System.out.println("\n");
            System.out.println("__________________________________");
            System.out.println("\n");
        
            
            
            user1[i-1] = new User(name_name2, name_id, name_pass, name_ban);  
            // //System.out.println(user1[i-1].getId());
            // System.out.println(user1[i-1].getName55());
            // System.out.println(user1[i-1].getPass());
            // System.out.println(user1[i-1].getAccount());
        }
        /////////////////
        while(true){ 
        
            do {

        infi = false;
        num2 = "";
        num3 = "";
        System.out.println("\n");
        System.out.println("********************************");
        System.out.println("*  ATM ComputerThanyaburiBank  *");
        System.out.println("********************************");
        System.out.println("\n");

        System.out.print("Account ID : ");     
        num2 = key.next();


        System.out.print("Account Password : ");     
        num3 = key.next();

        for (int j = 1; j <= num1; j++) { 

            if (num2.equals(user1[j-1].getId()))  {                 
                if (num3.equals(user1[j-1].getPass())) {
                    
                    //System.out.print(j-1);
                    //save = j;
                    save =  0;
                    save = save + (j-1);
                    unsigned = false;
                     break;                    
                    
                }  
            //    else{
            //     System.out.print("Invalid Password!!!");
            // }                                               
        } 

            
        }
                
            } while (unsigned);


        
       
          
         do{
            System.out.println("\n");
            System.out.println("********************************");
            System.out.println("*  ATM ComputerThanyaburiBank  *");
            System.out.println("********************************");
            System.out.println("\n");
            //System.out.println("ATM ComputerThanyaburiBank");
            System.out.println("Account ID : " + (user1[save].getId()) );
            System.out.println("Menu Service");
            System.out.println("1.Account Balance");
            System.out.println("2.Withdrawal");
            System.out.println("3.Exit");
            System.out.print("Choose : ");
            choose = key.next();

            if (choose == "3") {
                infi = true;              
            }
            

        }while (infi);
    }    

    }   
}
        













 // if (choose == "1") {
            //     System.out.println("1.Account Balance = " + (user1[save].getAccount()));    
            // }

            // else if (choose == "2") { 
            //     System.out.print("Enter withdrawal = ");     
            // } 
            
            // else if (choose == "3") {

            //     infi = false;
                
            // } else {
                
            //     System.out.print("Please choose number 1,2,3"); 
                
            // }               


        //System.out.println("WELCOME" +" "+ (user1[save].getId()) +" "+ (user1[save].getPass()) +" "+ (user1[save].getName55())); 
        //System.out.print(save);




       // System.out.print((user1[save].getId()));
       


        
   






 //User[] user1;

       // user1 = new User[Numuser1];

        //Test Function
		//user1 = new User[2];
		//user1[0] = new User("1111", "Por1", "11", 100);
		//user1[1] = new User("2222", "Por2", "22", 500);
        
        //System.out.println(user1[1].getId());