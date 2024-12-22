/**
 * @author zzhongh
 * @version 1.0
 * @date 10/10/2024 23:16:31
 */
public class Account {
    int accountNumber;
    int startBalance;
    int totalCharges;
    int allCredits;
    int allowedCredit;



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(int startBalance) {
        this.startBalance = startBalance;
    }

    public int getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(int totalCharges) {
        this.totalCharges = totalCharges;
    }

    public int getAllCredits() {
        return allCredits;
    }

    public void setAllCredits(int allCredits) {
        this.allCredits = allCredits;
    }

    public int getAllowedCredit() {
        return allowedCredit;
    }

    public void setAllowedCredit(int allowedCredit) {
        this.allowedCredit = allowedCredit;
    }

    public Account(int accountNumber, int startBalance, int totalCharges, int allCredits, int allowedCredit) {
        this.accountNumber = accountNumber;
        this.startBalance = startBalance;
        this.totalCharges = totalCharges;
        this.allCredits = allCredits;
        this.allowedCredit = allowedCredit;
    }
}
