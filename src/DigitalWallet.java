public class DigitalWallet {
    private String walletId;
    private String userName;
    private String userAccessCode;
    private int balance;

    public DigitalWallet(String walletId, String userName) {
        this.walletId = walletId;
        this.userName = userName;
        balance = 0;
    }

    public DigitalWallet(String walletId, String userName, String userAccessCode) {
        this(walletId, userName);
        this.userAccessCode = userAccessCode;
    }

    public WalletRespose add(int amount) {

        if (!validateAuthorize()) return WalletRespose.USER_NOT_AUTHORIZED;

        if(amount <= 0){
            return WalletRespose.INVALID_AMOUNT;
        }

        balance += amount;
        return WalletRespose.SUCCEED;
    }

    public WalletRespose pay(int amount) {
        if (!validateAuthorize()) return WalletRespose.USER_NOT_AUTHORIZED;

        if(amount <= 0){
            return WalletRespose.INVALID_AMOUNT;
        }

        if(amount > balance) return WalletRespose.INSUFFICIENT_BALANCE;

        balance -= amount;

        return WalletRespose.SUCCEED;
    }

    private boolean validateAuthorize() {
        return userAccessCode != null && !userAccessCode.isEmpty();
    }

    public String getWalletId() {
        return walletId;
    }

    public String getUsername() {
        return userName;
    }

    public String getUserAccessCode() {
        return userAccessCode;
    }

    public int getWalletBalance(){
        return balance;
    }
}
