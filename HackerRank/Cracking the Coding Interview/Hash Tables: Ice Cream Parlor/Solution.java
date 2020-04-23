import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    static void whatFlavors(int[] cost, int money) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<cost.length ; i++)
            map.put(cost[i], i+1);
        String str = "";
        for(int i=0; i<cost.length ;i++){
            if(map.containsKey(money-cost[i])){
                int pos = map.get(money-cost[i]);
                if(pos==i+1)
                    continue;
                str = String.valueOf(Math.min(i+1,pos)) + " " + String.valueOf(Math.max(i+1,pos));
                break;
            }
        }
        System.out.println(str);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
