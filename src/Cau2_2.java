import java.util.Scanner;

public class Cau2_2 {
    public static void main(String[] args) {
        System.out.println("2.1 Tích các phần tử ngoại trừ chính nó.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào kích thước của mảng: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.printf("arr[%d]: ", i);
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        int[] b = new int[n];
        for(int i=0; i<n; i++){
            int c = 1;
            for(int j=0; j<n; j++){
                if (arr[i] != arr[j]) {
                    c = c * arr[j];
                }
            }
            b[i] = c;
        }
        System.out.printf("[ ");
        for (int i=0; i<n; i++){

            System.out.printf("%d ", b[i]);

        }
        System.out.printf("]");

    }
}
