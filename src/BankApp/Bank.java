//package apps;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//
//public class Bank {
//    private String name;
//    private final ArrayList<Account> accounts = new ArrayList<>();
//
//    Account account1 = new Account("Bliss"+" "+"Adejo", "2345",  "3456456789");
//
//    public Bank() {
//        accounts.add(account1);
//    }
//
//    public void deposit(BigDecimal depositAmount, String number) throws Exception {
//        for (Account account : accounts)
//            if (account.getAccountNumber().equals(number))
//                account.deposit(depositAmount);
//    }
//
//
//    public BigDecimal checkBalance(String number, String pin) throws Exception {
//        if(Account.accountNumberIsValid(number));
//            for(Account account : accounts) {
//                if (account.getAccountNumber().equals(number))
//                    return account.checkBalance(pin);
//            }
//            throw new InvalidAccountException("Cannot find a matching Account number.");
//    }
//
//    public void Withdraw(BigDecimal amount, String userAccount, String pin)throws Exception {
//        for(Account account: accounts){
//            Account.pinIsEqualToLengthOfFour(pin);
//            Account.accountNumberIsValid(userAccount);
//        }
//        for (Account account : accounts) {
//            if (isEqualsAccountNumber(userAccount))
//                if (getCompareTo(amount) > 0)
//                    account.withdraw(amount, pin);
//        }
//    }
//
//    private boolean isEqualsAccountNumber(String accountNumber) {
//        for(Account account: accounts)
//
//            return account.getAccountNumber().equals(accountNumber);
//    }
//
//   private int getCompareTo(BigDecimal amount) throws Exception {
//        return account1.checkBalance(pin).compareTo(amount);
//    }
//
//    public void transfer(BigDecimal transferAmount, String userAccount, String recipientAccount, String userPin) throws Exception{
//
//    }
//
//    public Account registerCustomer(String firstname, String lastName, String pin){
//        Account account = new Account("firstName"+" "+"lastName", "pin", "3456456789");
//        accounts.add(account);
//        return account;
//    }
//
//
//}
//
//
//
