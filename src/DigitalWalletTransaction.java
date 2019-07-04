public class DigitalWalletTransaction {

    public void addMoney(DigitalWallet digitalWallet, Integer ammount) throws TransactionException{
        WalletRespose respose = digitalWallet.add(ammount);
        if(respose != WalletRespose.SUCCEED){
            throw new TransactionException(respose.getMessage(), respose.name());
        }
    }

    public void payMoney(DigitalWallet digitalWallet, Integer ammount) throws TransactionException{
        WalletRespose respose = digitalWallet.pay(ammount);
        if(respose != WalletRespose.SUCCEED){
            throw new TransactionException(respose.getMessage(), respose.name());
        }
    }
}
