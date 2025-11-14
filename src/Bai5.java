import java.util.Scanner;
public class Bai5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int total = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        total = total + i;
      }
    }
    if (total == n) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

