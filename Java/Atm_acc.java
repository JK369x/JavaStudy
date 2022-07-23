public class Atm_acc {
   //attribute 
   private String Account_ID = "";
   private String Account_Name = "";
   private String Password = "";
   private Double Balance = 0.0;
   
   //constructor
   public Atm_acc(String Account_ID, String Account_Name, String Password, Double Balance) {
      this.Account_ID = Account_ID;
      this.Account_Name = Account_Name;
      this.Password = Password;
      this.Balance = Balance;
      
   }

   public void setAccount_ID(String Account_ID) {
      this.Account_ID = Account_ID;
   }
   public void setAccount_Name(String Account_Name) {
      this.Account_ID = Account_Name;
   }
   public void setPassword(String Password){
      this.Account_ID = Password;
   }
   public void setBalance(Double Balance) {
      this.Balance = Balance;
   }
   public String getAccount_ID() {
      return this.Account_ID;
   }

   public String getAccount_Name() {
      return this.Account_Name;
   }

   public String getPassword() {
      return this.Password;
   }

   public Double getBalance() {
      return this.Balance;
   }
   
}
