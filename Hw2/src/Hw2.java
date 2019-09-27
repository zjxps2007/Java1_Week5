public class Hw2 {
    public static void main(String[] args) {
        // 변수선언
        int i = 7, j = 6, cnt = 6;

        // i가 0보다 클때동안 실행
        while(i > 0) {
            while(j <= i) { // j가 i보다 작거나 같으면 별을 출력, j값을 뺌.
                System.out.print("*");
                j--;

                if(j == 1) { // j가 1이된다면 cnt값을 빼고, j에 cnt값을 넣음.
                    cnt--;
                    j = cnt;
                    break;
                }
            }

            System.out.println("");
            i--;

            if(i == 1 || cnt == 1) { // i나 cnt값이 1이 된다면 탈출.
                break;
            }
        }
    }
}
