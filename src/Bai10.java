import java.util.Scanner;
public class Bai10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int UCLN = 1;
    for (int i = 1; i <= a; i++) {
      if (a % i == 0 && b % i == 0) {
        UCLN = i;
      }
    }
    for (int i = 1; i <= b; i++) {
      if (a % i == 0 && b % i == 0) {
        UCLN = i;
      }
    }
    System.out.println((a*b) / UCLN);
  }
}


