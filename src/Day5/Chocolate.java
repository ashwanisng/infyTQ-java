package Day5;

public class Chocolate {

    public static int calculate_total_chocolates(int[] chocolate_received) {
        int count =0;

        for (int i=0; i<chocolate_received.length; i++) {
            count += chocolate_received[i];
        }
        return count;
    }



    public static void main(String[] args) {
        int[] child_id = {10,20,30,40,50};
        int[] chocolate_received = {12,5,3,4,6};
        int child_id_given = 10;
        int extra_chocolate = 2;



        int temp =0;
        for (int i=0; i<child_id.length; i++) {
            if (child_id[i] != child_id_given){
                System.out.println("invalid child id");
                break;
            }else if (extra_chocolate < 1) {
                System.out.println("Extra chocolates is less than 1");
            }else {
                temp = i;
            }
        }



        chocolate_received[temp]+= extra_chocolate;
    }
}
