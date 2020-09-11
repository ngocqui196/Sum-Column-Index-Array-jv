import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mảng đa chiều bạn muốn tính tổng.");
        System.out.println("Nhập kích thước mảng.");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kích thước phần tử mảng.");
        int num2 = Integer.parseInt(sc.nextLine());
        int[][] arrays = new int[num1][num2];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.println("Nhập giá trị vào vị trí mảng arrays["+i+"]["+j+"].");
                arrays[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Nhập số cột bạn muốn tính tổng.");
        int num = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i][num];
        }
        System.out.println(sum);
    }
}
