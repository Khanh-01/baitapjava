package Contest1;
import java.util.Scanner;
public class Bai5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double d = scanner.nextDouble();
    double e = scanner.nextDouble();
    double f = scanner.nextDouble();
    double delta;
    double x1, x2;
    delta = b*b - 4*a*c;
    if (delta < 0) {
      System.out.println("Phuong trinh vo nghiem");
    } else if (delta == 0) {
      x1 = -b / (2*a);
      System.out.printf("%.2f\n", x1);
    } else {
      x1 = (-b - Math.sqrt(delta)) / (2*a);
      x2 = (-b + Math.sqrt(delta)) / (2*a);
      if (x1 > x2) { double t = x1; x1 = x2; x2 = t; }
      System.out.printf("%.2f %.2f\n", x1, x2);
    }

    delta = e*e - 4*d*f;
    if (delta < 0) {
      System.out.println("Phuong trinh vo nghiem");
    } else if (delta == 0) {
      x1 = -e / (2*d);
      System.out.printf("%.2f\n", x1);
    } else {
      x1 = (-e - Math.sqrt(delta)) / (2*d);
      x2 = (-e + Math.sqrt(delta)) / (2*d);
      if (x1 > x2) { double t = x1; x1 = x2; x2 = t; }
      System.out.printf("%.2f %.2f\n", x1, x2);
    }

    double A = a + d;
    double B = b + e;
    double C = c + f;
    delta = B*B - 4*A*C;
    if (delta < 0) {
      System.out.println("Phuong trinh vo nghiem");
    } else if (delta == 0) {
      x1 = -B / (2*A);
      System.out.printf("%.2f\n", x1);
    } else {
      x1 = (-B - Math.sqrt(delta)) / (2*A);
      x2 = (-B + Math.sqrt(delta)) / (2*A);
      if (x1 > x2) { double t = x1; x1 = x2; x2 = t; }
      System.out.printf("%.2f %.2f\n", x1, x2);
    }

    A = a - d;
    B = b - e;
    C = c - f;
    delta = B*B - 4*A*C;
    if (delta < 0) {
      System.out.println("Phuong trinh vo nghiem");
    } else if (delta == 0) {
      x1 = -B / (2*A);
      System.out.printf("%.2f\n", x1);
    } else {
      x1 = (-B - Math.sqrt(delta)) / (2*A);
      x2 = (-B + Math.sqrt(delta)) / (2*A);
      if (x1 > x2) { double t = x1; x1 = x2; x2 = t; }
      System.out.printf("%.2f %.2f\n", x1, x2);
    }
  }
}
