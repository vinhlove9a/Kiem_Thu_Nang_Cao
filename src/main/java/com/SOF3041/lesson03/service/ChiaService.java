package com.SOF3041.lesson03.service;

/**
 * Lớp dịch vụ cung cấp các phép chia
 */
public class ChiaService {

    /**
     * Chia hai số nguyên
     *
     * @param a số bị chia
     * @param b số chia
     * @return kết quả của a chia cho b
     * @throws ArithmeticException nếu b bằng không
     */
    public int chia(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }
}
