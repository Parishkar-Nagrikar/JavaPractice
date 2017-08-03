package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args) throws Exception
    {
	// write your 0t0code here
        List list =new ArrayList<>();

        list.add("10");
        list.add("11");
        list.add("12");

       // System.out.println(list);

        String str="HelloWorld";

        String rev=" ";

        System.out.println(str.length());

        for (int i=str.length()-1;i>=0;i--)
        {
            System.out.println( rev);
            rev.charAt(i);
        }
        System.out.println(rev);


    }
}
