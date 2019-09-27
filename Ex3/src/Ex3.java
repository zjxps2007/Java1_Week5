public class Ex3 {
    public static void main(String[] args) {
        int cnt;
        int start = 1;
        int end = 5;

        while (start <= end) {
            cnt =1;
            while (cnt<=start) {
                System.out.print("*");
                cnt++;
            }
            System.out.println();
            start++;
        }
    }
}
