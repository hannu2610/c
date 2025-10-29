package com.example.demo4.on1;

public class Tongcacsole {
    public Integer tongsolẹ(Integer bd, Integer kt){
        if (bd == null|| kt== null ){
            throw new NullPointerException("Null roi");
        }
        if (bd<1 || kt>1000 || bd>kt){
            throw new IllegalArgumentException("ngoai pham vi");
        }
        int tong = 0;
       for (int i=bd;i<=kt;i++){
           if(i%2!=0){
               tong+=i;
           }
       }
       return tong;
    }
}
