package com.SOF3041.lesson03.service;

import java.util.List;

/**
 * Lớp dịch vụ tính trung bình cộng của danh sách các số
 */
public class TinhTrungBinhService {

    /**
     * Tính trung bình cộng của một danh sách các số nguyên
     *
     * @param danhSachSo danh sách các số nguyên
     * @return giá trị trung bình dưới dạng số thực
     * @throws ArithmeticException nếu danh sách trống
     */
    public double tinhTrungBinhCong(List<Integer> danhSachSo) {
        if (danhSachSo == null || danhSachSo.isEmpty()) {
            throw new ArithmeticException("Không thể tính trung bình cộng của danh sách trống");
        }

        int tong = 0;
        for (Integer so : danhSachSo) {
            tong += so;
        }

        return (double) tong / danhSachSo.size();
    }
}
