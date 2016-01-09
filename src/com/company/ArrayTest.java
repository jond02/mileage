package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jondann on 1/8/16.
 */
public class ArrayTest {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Scanner[][] sca = new Scanner[][] {{sc, sc1},{sc, sc1}};

        System.out.println(sca[0][1].toString());

        //type wasn't declared
        ArrayList cool = new ArrayList();

        int x = 5;
        String y = "yes";

        cool.add(x);
        cool.add(y);



    }

}
