package bishi;

/**
 * Created by 余屌丝 on 2017/3/10.
 */
/**
 * Created by Administrator on 2017/3/10.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    private static class Point {
        public int x;
        public int y;

        public Point() {
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point(String string) {
            String[] arr = string.split(" ");
            if (arr != null && arr.length == 2) {
                this.x = Integer.parseInt(arr[0]);
                this.y = Integer.parseInt(arr[1]);
            }
        }
    }

    /** 请完成下面这个函数，实现题目要求的功能 **/
    /**
     4000
     4000
     1
     5
     1000 2000
     2000 1500
     end
     * 答案 1500 1500
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     **/
    static String process(int m, int n, int p, int q, List<Point> users) {
        int retX = 0, retY = 0;
        double sum = 0;
        double retSum = Double.POSITIVE_INFINITY;

        for (int x = -m/2; x < m/2; x++) {
            for (int y = -n/2; y < n/2; y++) {
                Point center = new Point(x,y);
                sum = p * distance(center, new Point(0, 0));
                for (int i = 0; i < users.size(); i++) {
                    double subSum = q * distance(center, new Point(users.get(i).x, users.get(i).y));
                    sum += subSum;
                }

                if (sum < retSum) {
                    retX = x;
                    retY = y;
                    retSum = sum;
                }
            }
        }
        System.out.println(retSum);
        return retX + " " + retY;  // 例如 "10 20" 这样的字符串
    }

    static double distance(Point from, Point to) {
        int temp = (from.x - to.x) * (from.x - to.x) + (from.y - to.y) * (from.y - to.y);
        return Math.sqrt(temp);
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int res;

        List<Point> users = new ArrayList<>();
        int m = Integer.parseInt(in.nextLine().trim()); // max x
        int n = Integer.parseInt(in.nextLine().trim()); // max y
        int p = Integer.parseInt(in.nextLine().trim()); //
        int q = Integer.parseInt(in.nextLine().trim());
        while (in.hasNext()) {
            String input = in.nextLine().trim();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            Point point = new Point(input);
            users.add(point);
        }

        String result = process(m, n, p, q, users);

        System.out.println(result);

    }

}
