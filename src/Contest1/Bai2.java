package Contest1;
import java.util.Scanner;
public class Bai2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    long sum = 0;
    for(int i = 0; i < n - 1; i++) {
      sum += (long)a[i] * a[i + 1];
    }
    System.out.println(sum);
  }
}

