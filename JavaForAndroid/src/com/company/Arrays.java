package com.company;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int nums[] = {1,2};
        System.out.println(nums[0]);

        ArrayList names = new ArrayList();
        names.add(0,"a");
        names.add(1,"b");
        names.add("c");
        //System.out.println(names.get(0));
        for(Object elements :names){
            System.out.println("the object is "+elements);
        }
    }
}
