package com.SOF3041.lesson03.service;

/**
 * Lớp dịch vụ truy xuất các phần tử trong mảng
 */
public class TruyXuatMangService {

    /**
     * Lấy phần tử tại vị trí chỉ định từ một mảng
     *
     * @param mang mảng cần truy xuất
     * @param viTri vị trí của phần tử cần lấy
     * @return phần tử tại vị trí chỉ định
     * @throws IndexOutOfBoundsException nếu vị trí nằm ngoài phạm vi của mảng
     */
    public <T> T layPhanTuTheoViTri(T[] mang, int viTri) {
        if (mang == null) {
            throw new IllegalArgumentException("Mảng không thể là null");
        }
        
        if (viTri < 0 || viTri >= mang.length) {
            throw new IndexOutOfBoundsException("Vị trí " + viTri + " nằm ngoài phạm vi của mảng có độ dài " + mang.length);
        }
        
        return mang[viTri];
    }
}
