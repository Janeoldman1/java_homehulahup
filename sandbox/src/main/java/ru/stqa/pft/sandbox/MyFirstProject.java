package ru.stqa.pft.sandbox;

public class MyFirstProject {

  public static void main(String[] args) {
    hello ("world");
    hello ("user");
    hello ("Eve");
Square s = new Square(5);
    s.l = 5;
    System.out.println("area square with side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    r.a = 4;
    r.b = 6;
    System.out.println("area rectangle with side " + r.a + "  and " + r.b + " = " + r.area());
    }

  public static void hello (String somebody) {
  System.out.println("Hello, " + somebody + "!");
}

}

