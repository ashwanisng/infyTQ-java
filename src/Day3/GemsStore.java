package Day3;

import java.util.ArrayList;

public class GemsStore {
    public static void main(String[] args) {
        ArrayList<String> gems = new ArrayList<>();
        gems.add("Emerald");
        gems.add("Ivory");
        gems.add("Jasper");
        gems.add("Ruby");
        gems.add("Garnet");

        ArrayList<Integer> gems_price = new ArrayList<>();
        gems_price.add(1760);
        gems_price.add(2119);
        gems_price.add(1599);
        gems_price.add(3920);
        gems_price.add(3999);


        ArrayList<String> req_gems = new ArrayList<>();
        req_gems.add("Ivory");
        req_gems.add("Emerald");
        req_gems.add("Garnet");

        ArrayList<Integer> quantity = new ArrayList<>();
        quantity.add(3);
        quantity.add(10);
        quantity.add(12);

        ArrayList<Integer> total = new ArrayList<>();
        int q, e , sum = 0, price = 0;
        double total_amount=0;

        for (int i=0; i< req_gems.size();i++) {
            String s = req_gems.get(i);
             q = quantity.get(i);


            for (int j=0; j<gems.size(); j++) {
                 e = gems.indexOf(s);
                if (!gems.contains(s)){
                    System.out.println(-1);
                    break;
                }
                for (int k=0; k<gems_price.size(); k++) {
                     price = gems_price.get(e);
                     price *= q;
                }
            }
            total.add(price);

        }

        for (int i=0; i<total.size(); i++) {
            sum += total.get(i);
        }

        if (sum > 30000) {
            total_amount = sum - (5*sum)/100;
        }
        System.out.println(total_amount);
    }
}
