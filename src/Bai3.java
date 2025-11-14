import java.util.Scanner;
public class Bai3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    int count = 0;
    int total = 0;
    while (n > 0) {
      total += n % 10;
      count++;
      n /= 10;
    }
    System.out.println(count);
    System.out.println(total);
  }
}
