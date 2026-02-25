import java.util.Scanner;

public class Cau1_1 {

    public static void main(String[] args) {
        System.out.println("1.1 Ký tự đầu tiên không lặp lại.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String input = sc.nextLine();


        for(int i=0; i < input.length()-1; i++){
            Character check = input.charAt(i);
            int count = 0;
            for(int j=1; j < input.length(); j++) {
                if (check.equals(input.charAt(j))) {
                    count++;
                }
            }
            if(count == 0){
                System.out.println(check);
                return;
            }
        }
        System.out.print("_");
    }
}
