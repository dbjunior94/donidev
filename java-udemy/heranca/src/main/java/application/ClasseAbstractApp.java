package application;

import entities.asb.Account;
import entities.asb.BusinessAccount;
import entities.asb.SavingsAccount;
import java.util.ArrayList;
import java.util.List;

public class ClasseAbstractApp {

  public static void main(String[] args) {
    //Account acc1 = new Account(1001, "Maria", 1000.0);
    //Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
    //Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

    List<Account> list = new ArrayList<>();

    list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
  }

}
