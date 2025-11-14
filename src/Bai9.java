import java.util.Scanner;
public class Bai9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int numberHundreds = n / 100;
    int numberTens = (n / 10) % 10;
    int unitNumber = n % 10;
    int totalCube = numberHundreds * numberHundreds * numberHundreds + numberTens * numberTens * numberTens + unitNumber * unitNumber * unitNumber;
    if (totalCube == n) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

