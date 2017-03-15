package chapter2;

import java.util.ArrayList;

/**
 * Created by 余屌丝 on 2017/3/5.
 */
public class Main {
    static boolean resolver(int[] A) {
        int len = A.length;
        if (A.length < 4)
            return false;

        int i = 0, j = len - 1;
        int sum0 = A[0];
        int sum1 = A[len - 1];

        ArrayList<Integer> sums = new ArrayList<>();

        while (i +1 < j) {
            if (sum0 < sum1) {
                sum0 += A[++i];
            } else if (sum0 > sum1) {

                sum1 += A[--j];
            } else if (sum0 != 0 && sum0 == sum1) {
                System.out.println("sum:" + sum0);
                int size = sums.size();
                if (size > 0) {
                    int pre = sums.get(size - 1);
                    if (sum0 != pre) {
                        sums.add(size - 1, pre + sum0);
                    } else {
                        sums.add(sum0);
                    }
                }else
                    sums.add(sum0);

                i++;
                --j;

                sum0 = A[++i];
                sum1 = A[--j];


            }

            System.out.println(sum0 + " " + sum1);
        }

        System.out.println("list:"+sums.size());
        for(int s : sums)
            System.out.print(s+"  ");

        if (sums.size() == 2)
            return true;
        else
            return false;

    }


    public static void main(String[] args) {
       int [] ints = new int[]{2,5,1,1,1,1,4,1,7,3,7};

        System.out.println(resolver(ints));
    }
}
