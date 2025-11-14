import java.util.Scanner;
public class Main {
  static boolean soChan(int n) {
    return n % 2 == 0;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int so = scanner.nextInt();
    if (soChan(so)) {
      System.out.println(so + " là số chẵn.");
    } else {
      System.out.println(so + " là số lẻ.");
    }
  }
}