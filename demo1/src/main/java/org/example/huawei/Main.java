package org.example.huawei;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line = reader.readLine()) != null) {
            String[] strs = line.split(" ");
            int count1 = 0;
            int count2 = 0;
            int sum = 0;
            for(String str : strs) {
                Integer i = Integer.parseInt(str);
                if(i < 0) {
                    count1 ++;
                } else {
                    count2 ++;
                    sum += i;
                }
            }
            System.out.println(count1);
            System.out.println(count2 == 0 ? 0 : (double)sum/count2);
        }
    }
}
