package com.lsx.study;

import java.util.Random;

/**
 * @author kebi on 2017/3/22.
 */
public class NumberUtils {

    private static Random random = new Random(1);

    public static int random100(){
        return Math.abs(random.nextInt()%100);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(random100());

        }
    }
}
