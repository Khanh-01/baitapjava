import java.util.Scanner;
public class Bai7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int thang = scanner.nextInt();
    int nam = scanner.nextInt();
    int soNgay;
    boolean namNhuan = false;
    if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
      namNhuan = true;
    }
    if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
      soNgay = 31;
    } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
      soNgay = 30;
    } else {
      if (namNhuan) {
        soNgay = 29;
      } else {
        soNgay = 28;
      }
    }
    System.out.println("Thang " + thang + " nam " + nam + " co " + soNgay + " ngay");
  }
}
