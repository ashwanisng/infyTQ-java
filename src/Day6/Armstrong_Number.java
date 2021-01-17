package Day6;

public class Armstrong_Number {
    public static void main(String[] args) {
        int num = 371;

        int sum =0;
        int temp = num;

        while (num>0){
            int a = num%10;
            num /= 10;

            sum += (a*a*a);
        }

        if (sum == temp){
            System.out.println("armstrong number");
        }else {
            System.out.println("not armstrong number");
        }
    }
}
