package com.company;

import com.company.OpenHashMap.*;

public class Main {

    public static void main(String[] args) {
        OpenHashMap HM = new OpenHashMap(10);
        HM.put(8, 22541354513L);
        HM.put(7, 225414513L);
        System.out.println("Get method: " + HM.get(8));
        System.out.println("Size method: " + HM.size());
    }
}
