import java.util.Scanner;
import java.util.SortedMap;

public class Cau1_2 {
    public static void main(String[] args) {
        System.out.println("1.2 Chuẩn hoá chuỗi họ tên.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String input = sc.nextLine();

        input = input.toLowerCase();


        System.out.print(String.valueOf(input.charAt(0)).toUpperCase());
        char value = ' ';
        for(int i=0; i < input.length(); i++){
            Character check = input.charAt(i);
            if (check.equals(value)){
                System.out.print(String.valueOf(input.charAt(i+1)).toUpperCase());
            }else {
                System.out.print(input.charAt(i+1));
            }
        }
    }
}
