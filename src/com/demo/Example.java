package com.demo;

import java.util.*;

public class Example {
    Set<Integer> set = new HashSet<>();
    List<String > l = new LinkedList<>();
    String str = new String("good" );
    char[] ch = {'a','b','c'};
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        System.out.println(map.get("1"));
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        list.clear();
        System.out.println(list);
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        //System.out.println("5" + 2);
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.println(ex.ch);

        int num = 1;
        System.out.println("changeNum()方法调用之前：num = " + num);
        changeNum(num);
        System.out.println("changeNum()方法调用之后：num = " + num);
    }
    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'g';
    }
    public static void changeNum(int x){
        x = 2;
    }
}
