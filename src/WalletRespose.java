public enum WalletRespose {
    SUCCEED("SUCCEED"),
    USER_NOT_AUTHORIZED("User not authorized"),
    INVALID_AMOUNT("Amount should be greater than zero"),
    INSUFFICIENT_BALANCE("Insufficient balance");

    private String message;

    WalletRespose(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
