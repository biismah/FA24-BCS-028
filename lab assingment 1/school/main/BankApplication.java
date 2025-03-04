Package main;
import banking.BankingSystem;
import util.PinValidator;
import java.io.console;

Public class BankApplication{
    Public static void main(string[] args){


      Console console =system.console();
        
     system.out.print("enter Account Number:);
     string checkaccountNumber=new string.nextLine();
        System.out.print("Enter your account pin: ");
        String checkpin = new String(console.readLine());

        PinValidator pinValidator = new PinValidator();
        PinValidator.Rules rule = pinValidator.new Rules();
        rule.isValid(checkpin);

        BankingSystem bankingSystem = new BankingSystem();
        BankingSystem.LoginProcessor t1 = new BankingSystem.LoginProcessor();
        t1.authentication(checkaccount, checkpin);
    }
}
      

`

     
