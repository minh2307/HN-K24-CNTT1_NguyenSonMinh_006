import java.util.Scanner;

public class Cau2_1 {
    public static void main(String[] args) {
        System.out.println("2.1 Tìm phần tử đa số.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào kích thước của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.nextLine();
        for (int i=0; i<n; i++){
            System.out.printf("arr[%d]: ", i);
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i=0; i<n; i++){
            int count = 0;
            for(int j=i; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > n/2){
                System.out.println(arr[i]);
            }
        }
    }
}
