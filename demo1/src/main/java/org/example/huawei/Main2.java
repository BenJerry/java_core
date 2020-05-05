package org.example.huawei;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Integer> list = new ArrayList();
        for(int i = 0; i < count; i ++) {
            Integer tmp = sc.nextInt();
            list.add(tmp);
        }
        List<Integer> stepList = new ArrayList<>();
        for(Integer i : list) {
            int steps = 0;
            int index = list.indexOf(i);
            for(Integer j : list) {
                if(j == index) {

                } else if(j >= i){
                    steps ++;
                }
            }
            stepList.add(steps);
        }
        int maxStep = 0;
        for(int i : stepList) {
            if(i > maxStep) {
                maxStep = i;
            }
        }
        System.out.println(maxStep);
    }
}
