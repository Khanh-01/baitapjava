import java.util.Scanner;
public class MangHaiChieu {
  public static int[][] input2DArray(Scanner sc, int rows, int cols) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    return arr;
  }

  public static void print2DArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so hang: ");
    int rows = sc.nextInt();
    System.out.print("Nhap so cot: ");
    int cols = sc.nextInt();
    int[][] matrix = input2DArray(sc, rows, cols);
    System.out.println("Mang 2 chieu vua nhap la:");
    print2DArray(matrix);
  }
}
