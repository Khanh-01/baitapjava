import java.util.Scanner;
public class Bai1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    if (n % 2 == 0) {
      System.out.println("So chan");
    } else if (n % 2 == 1) {
      System.out.println("So le");
    }
    boolean prime = true;
    if (n < 2) {
      prime = false;
    } else {
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          prime = false;
          break;
        }
      }
    }
    if (prime) {
      System.out.println("So nguyen to");
    } else {
      System.out.println("Khong phai so nguyen to");
    }
  }
}
