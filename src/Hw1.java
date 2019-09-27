import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        //변수 선언
        int num1,num2;
        int sum = 0;
        char n;
        Scanner sc = new Scanner(System.in);

        //입력받음
        System.out.print("첫 번쨰 숫자를 입력하세요:");
        num1 = sc.nextInt();
        System.out.print("두 번쨰 숫자를 입력하세요:");
        num2 = sc.nextInt();
        System.out.print("연산을 선택하세요:");
        n = sc.next().charAt(0);

        //n의 결과에 따라 연산 수행 및 출력
        switch (n) {
            //+일떄
            case '+':
                sum = num1+num2;
                System.out.println(num1+"+"+num2+"="+sum);
                break;
            //-일떄
            case  '-':
                sum = num1-num2;
                System.out.println(num1+"-"+num2+"="+sum);
                break;
            //*일떄
            case '*':
                sum = num1*num2;
                System.out.println(num1+"*"+num2+"="+sum);
                break;
            // /일떄
            case '/':
                sum = num1/num2;
                System.out.println(num1+"/"+num2+"="+sum);
                break;
        }
    }
}
