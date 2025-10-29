package com.example.demo4.on1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamSTest {
    private SanPhamS service;
    @BeforeEach
    public void setUp(){
        service = new SanPhamS();
    }

    @Test
    public void themhople(){
        SanPham sanPham= new SanPham("1","Tungu",5,1.0f,1,"ngusi");
        assertTrue(service.add(sanPham));
    }

    @Test
    public void trung(){
        SanPham sanPham= new SanPham("1","Tungu",5,1.0f,1,"ngusi");
        SanPham sanPham2= new SanPham("1","Tungu",5,1.0f,1,"ngusi");
        assertTrue(service.add(sanPham));
assertThrows(IllegalArgumentException.class,()->service.add(sanPham2));
    }

    @Test
    public void themla1(){
        SanPham sanPham= new SanPham("1","Tungu",5,1.0f,1,"ngusi");
        assertTrue(service.add(sanPham));
    }
    @Test
    public void themla100(){
        SanPham sanPham= new SanPham("1","Tungu",5,1.0f,100,"ngusi");
        assertTrue(service.add(sanPham));
    }
 @Test
    public void themla101(){
        SanPham sanPham= new SanPham("1","Tungu",5,1.0f,101,"ngusi");
     assertThrows(IllegalArgumentException.class,()->service.add(sanPham));

 }
 @Test
    public void themnull(){
     SanPham sanPham= new SanPham("","",0,0f,0,"");
     assertThrows(IllegalArgumentException.class,()->service.add(sanPham));

 }
}