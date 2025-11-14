import java.util.Scanner;
public class Bai8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int total = 0;
    for (int i = 0; i <= n; i++) {
      if (i % 2 == 1) {
        total += i;
      }
    }
    System.out.println(total);
  }

}
