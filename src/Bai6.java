import java.util.Scanner;
public class Bai6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int w = scanner.nextInt();
    for (int i = 1; i <= h; i++) {
      for (int j = 1; j <= w; j++) {
        if (i == 1 || i == h || j == 1 || j == w) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

