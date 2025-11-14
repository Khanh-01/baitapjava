import java.util.Scanner;
public class GiaiPTBac2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    if (a == 0) {
      if (b == 0) {
        if (c == 0) {
          System.out.println("Phương trình vô số nghiệm");
        } else {
          System.out.println("Phương trình vô nghiệm");
        }
      } else {
        System.out.printf("%.2f, -c / b");
      }
    } else {
      int delta = b * b - 4 * a * c;
      if (delta < 0) {
        System.out.printf("Phương trình vô nghiệm");
      } else if (delta == 0) {
        System.out.printf("%.2f, -b / (2*a)");
      } else {
        System.out.printf("%.2f, %.2f", (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a));
      }
    }
  }
}
