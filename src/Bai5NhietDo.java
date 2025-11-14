import java.util.Scanner;
public class Bai5NhietDo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("   Chuyen Doi Niet Do   ");
      System.out.println("1. C sang F");
      System.out.println("2. F sang C");
      System.out.println("3. Thoat");

      int select = scanner.nextInt();

      if (select == 1) {
        System.out.print("Nhap do C: ");
        double c = scanner.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println(c + " C = " + f + " F");
      } else if (select == 2) {
        System.out.print("Nhap do F: ");
        double f = scanner.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(f + " F = " + c + " C");
      } else if (select == 3) {
        System.out.println("Tam biet!");
        break;
      }
      System.out.println();
    }
  }
}

