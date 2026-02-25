import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        System.out.println("3. Phân loại mầu sắc.");
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

        int left = 0;
        int right = n;
        int mid = n/2;
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i] == 2){
                int temp = arr[i];
                arr[right] = arr[i];
                b[right] = 1;

                arr[i] = temp;
                right--;

            }
            if(arr[i] == 0){
                int temp = arr[i];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }

            if(arr[i] == 1 && b[i] == 0){
                int temp = arr[i];
                arr[mid] = arr[i];
                arr[i] = temp;

                if(b[i+1] == 0){
                    mid++;
                }else {
                    mid--;
                }
            }
        }

        System.out.printf("[ ");
        for (int i=0; i<n; i++){

            System.out.printf("%d ", b[i]);

        }
        System.out.printf("]");

    }
}



