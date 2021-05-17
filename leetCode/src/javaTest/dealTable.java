package javaTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description:
 * @date 2021/1/14 19:30
 */
public class dealTable {


    public void  dealTable(String s){

        String[] s1 = s.split("\n");

        List<String> name = new ArrayList<>();
        List<String> type = new ArrayList<>();
        List<String> commment = new ArrayList<>();

        for (String tmp : s1){

            String[] tmps = tmp.split(" ");
            int lenth = tmps.length;
            name.add(tmps[0]);
            type.add(tmps[1]);
            commment.add(tmps[lenth-1]);
        }

        name.forEach(e->{
            System.out.println(e);
        });

        System.out.println("----------------------------------------------");

        type.forEach(e->{
            System.out.println(e);
        });

        System.out.println("----------------------------------------------");

        commment.forEach(e->{
            System.out.println(e);
        });
    }


}
