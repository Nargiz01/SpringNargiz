package lab1.nargiz.bank.test;

public interface BankService {
    void showMenu(Client client);
    Double balance();
    boolean checkPin(String pin);
    void withdraw(Integer cash);
    void topUp(Integer cash);
    void changePin(String pin);
}
