import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        int month;
        int days;

        Scanner input = new Scanner(System.in);
        System.out.print("일수를 알고 싶은 월을 입력하세요: ");
        month = input.nextInt();

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 10;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 31;
                break;
        }
        System.out.println(month+"월의 일수는 " + days+"일 입니다.");
    }
}
