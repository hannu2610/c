package com.example.demo4.on1;

import java.util.ArrayList;
import java.util.List;

public class SanPhamS {
    public List<SanPham> ds = new ArrayList<>();

    public boolean add(SanPham sanPham) {
        if (sanPham == null) {
            throw new IllegalArgumentException("Null");
        }
        if (sanPham.getMa() == null || sanPham.getMa().trim().isEmpty()
                || sanPham.getTen() == null || sanPham.getTen().trim().isEmpty()
                || sanPham.getNamBaoHanh() == null
                || sanPham.getGia() == null
                || sanPham.getSl() == null
                || sanPham.getDanhMuc() == null || sanPham.getDanhMuc().trim().isEmpty()) {
            throw new IllegalArgumentException("Rong");
        }
        if (sanPham.getSl() < 1 || sanPham.getSl() > 100) {
            throw new IllegalArgumentException("ngoai pham vi");
        }
        for (SanPham sanPham1 : ds) {
            if (sanPham1.getMa().equals(sanPham.getMa())) {
                throw new IllegalArgumentException("co ma roi");
            }
        }
        ds.add(sanPham);
        return true;
    }
}
