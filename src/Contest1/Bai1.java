package Contest1;
import java.util.Scanner;
public class Bai1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    for (int t = 1; t <= T; t++) {
      int n = scanner.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = scanner.nextInt();
      }
      System.out.println("Test " + t + ":");

      boolean[] visited = new boolean[n];
      for (int i = 0; i < n; i++) {
        if (!visited[i]) {
          int count = 1;
          visited[i] = true;

          for (int j = i + 1; j < n; j++) {
            if (a[j] == a[i]) {
              count++;
              visited[j] = true;
            }
          }
          System.out.println(a[i] + " " + count);
        }
      }
    }
  }
}
