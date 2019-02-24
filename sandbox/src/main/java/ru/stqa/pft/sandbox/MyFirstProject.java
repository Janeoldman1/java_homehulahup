package ru.stqa.pft.sandbox;

public class MyFirstProject {

  public static void main(String[] args) {
    hello ("world");
    hello ("user");
    hello ("Eve");

    double l = 5;
    System.out.println("area square with side " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("area rectangle with side " + a + "  and " + b + " = " + area(a, b));
    }

  public static void hello (String somebody) {
  System.out.println("Hello, "+somebody+"!");
}
public static double area (double len) {
    return 1*1;
}
  public static double area (double a, double b){
    return a*b;
  }
}
