import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private List<Atm_acc> atm_acc_list = new ArrayList<>();
    private void addAccount(Atm_acc atm_acc) {
        atm_acc_list.add(atm_acc);
    }
    //*Main */
    public static void main(String [] args) {
        Main main = new Main();
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter amount of all account = ");
        int i = Sc.nextInt();
        System.out.println("Enter Detail of each account.");
        for (int j = 0; j < i; j++) {
            System.out.println("No." + (j+1));
               Atm_acc atm_acc = main.takeAtm_accInput();
                main.addAccount(atm_acc);
        }
        // main.showListAcc();
        main.loginAccounts();
    }

    //*Add acc */
    /**
     * @return
     */
    private Atm_acc takeAtm_accInput(){
        Atm_acc atm_acc;
        ArrayList<String> error = new ArrayList<>();
        do{
            error.clear();
            Scanner Sc = new Scanner(System.in);
      

                System.out.print("Enter Account ID = ");
                String Account_ID = Sc.nextLine();
                System.out.print("Enter Account Name = ");
                String Account_Name = Sc.nextLine();
                System.out.print("Enter Password = ");
                String Password = Sc.nextLine();
                System.out.print("Enter Balance = ");
                Double Balance = Sc.nextDouble();

                if(Account_ID.length() >13){
                    error.add("Account too long");
                }if(Account_Name.length() >50){
                    error.add("Account Name too long");
                }if(Password.length() >4){
                    error.add("Password too long");
                }if(Balance < 0&&Balance > 1000000){
                    error.add("Balance too not in range");
                
                
                }if(error.size() == 0){
                    atm_acc = new Atm_acc(Account_ID, Account_Name, Password, Balance);
                    break;
                }else{
                    for(int i = 0; i < error.size(); i++){
                        System.out.println(error.get(i));
                    }

                }
            }while(true);
            return atm_acc;
        }
    
    

    //*Show list acc */
    // private void showListAcc(){
    //     for (Atm_acc atm_acc : atm_acc_list) {
    //         atm_acc.display();
    //     }
    // }

    //*Login accounts */
    private void loginAccounts(){
        Scanner Sc = new Scanner(System.in);
        int option;
        System.out.print("Account ID : ");
        String Account_ID = Sc.nextLine();
        System.out.print("Account Password : ");
        String Password = Sc.nextLine();
        for (Atm_acc atm_acc : atm_acc_list) {
            // for(int x = 0; x < atm_acc_list.size(); x++)
                if(atm_acc.getAccount_ID().equals(Account_ID) && atm_acc.getPassword().equals(Password)){
                    // System.out.println("Login success");
                    do{
                        System.out.println("ATM ComputerThanyaburi Bank");
                        System.out.println("Account ID :" + atm_acc.getAccount_ID());
                        System.out.println("Menu Service");
                        System.out.println("1. Account Balance");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Exit");
                        System.out.print("Choose : ");
                        option = Sc.nextInt();
                        switch(option){
                            case 1:
                                System.out.println("Account Balance : " + atm_acc.getBalance());
                                break;
                            case 2:
                                System.out.print("Enter amount : ");
                                Double amount = Sc.nextDouble();
                                if(amount > atm_acc.getBalance()){
                                    System.out.println("Not enough b alance");
                                }else{
                                    atm_acc.setBalance(atm_acc.getBalance() - amount);
                                    System.out.println("Withdraw success");
                                }
                                break;
                            case 3:
                                System.out.println("Exit");
                                loginAccounts();   
                            default:
                                System.out.println("Invalid option");
                        }
                    }while(option !=4);
                }else{
                    // System.out.println("Login failed");
                    // loginAccounts();
            }
        }
        loginAccounts();
    }
}

