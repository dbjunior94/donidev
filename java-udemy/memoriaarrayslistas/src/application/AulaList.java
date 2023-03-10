package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AulaList {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add(2, "Marco");


    System.out.println(list.size());

    //list.remove("Anna");

    for(String x : list){
      System.out.println(x);
    }

    System.out.println("_________________");
    //list.remove(1);
    list.removeIf(x -> x.charAt(0) == 'M');
    for(String x : list){
      System.out.println(x);
    }

    System.out.println("_________________");
    System.out.println("Index of Bob: " + list.indexOf("Bob"));
    System.out.println("Index of Marco: " + list.indexOf("Marco"));
    System.out.println("_________________");
    List<String> result = list.stream()
        .filter(x -> x.charAt(0) == 'A')
        .collect(Collectors.toList());
    for(String x : result){
      System.out.println(x);
    }
    System.out.println("_________________");
    String name = list.stream()
        .filter(x -> x.charAt(0) == 'J')
        .findFirst().orElse(null);
    System.out.println(name);
  }

}
