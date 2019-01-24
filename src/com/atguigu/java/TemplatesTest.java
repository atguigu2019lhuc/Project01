package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 2019/1/24 - 13:26
 */
public class TemplatesTest {

    //模版六：prsf
    private static final Customer CUST = new Customer();

    //模版一：psvm
    public static void main(String[] args) {

        //模版二：
        System.out.println("hello");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1=10;
        System.out.println("num1 = " + num1);

        //模版三：fori
        String[] arr=new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模版四：list.for
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }

        //模版五：ifn
        if (list == null) {
            
        }
        //inn
        if (list != null) {
            
        }
    }
}
