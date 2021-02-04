package lab1.nargiz.bank.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Bank bank = context.getBean("bank",Bank.class);
        

        Random rand = new Random();
        Client randomClient = bank.getAccounts().get(rand.nextInt(bank.getAccounts().size()));
        bank.getBankService().showMenu(randomClient);
    }
}
