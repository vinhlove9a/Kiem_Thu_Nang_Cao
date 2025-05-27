package lesson03;

import com.SOF3041.lesson03.service.ChiaService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Lớp kiểm thử cho DichVuChia
 * Sử dụng phân tích giá trị biên và phân vùng tương đương
 */
public class TestChia {

    ChiaService dichVu = new ChiaService();

    // Phân vùng tương đương: số dương / số dương
    @Test
    @DisplayName("Kiểm tra phép chia với các số dương (10 / 2)")
    public void kiemTraChiaSoDuong() {
        assertEquals(5, dichVu.chia(10, 2));
    }

    // Phân vùng tương đương: số âm / số dương
    @Test
    @DisplayName("Kiểm tra phép chia với số bị chia âm (-10 / 2)")
    public void kiemTraChiaSoBiChiaAm() {
        assertEquals(-5, dichVu.chia(-10, 2));
    }

    // Phân vùng tương đương: số dương / số âm
    @Test
    @DisplayName("Kiểm tra phép chia với số chia âm (10 / -2)")
    public void kiemTraChiaSoChiaAm() {
        assertEquals(-5, dichVu.chia(10, -2));
    }

    // Phân vùng tương đương: số âm / số âm
    @Test
    @DisplayName("Kiểm tra phép chia với cả hai số âm (-10 / -2)")
    public void kiemTraChiaCaHaiSoAm() {
        assertEquals(5, dichVu.chia(-10, -2));
    }

    // Giá trị biên: số bị chia = 0
    @Test
    @DisplayName("Kiểm tra phép chia với số bị chia bằng 0 (0 / 5)")
    public void kiemTraChiaSoBiChiaBang0() {
        assertEquals(0, dichVu.chia(0, 5));
    }

    // Giá trị biên: số chia = 1
    @Test
    @DisplayName("Kiểm tra phép chia với số chia bằng 1 (10 / 1)")
    public void kiemTraChiaChoSo1() {
        assertEquals(10, dichVu.chia(10, 1));
    }

    // Giá trị biên: số chia = -1
    @Test
    @DisplayName("Kiểm tra phép chia với số chia bằng -1 (10 / -1)")
    public void kiemTraChiaChoSoAm1() {
        assertEquals(-10, dichVu.chia(10, -1));
    }

    // Giá trị biên: giá trị số nguyên lớn nhất
    @Test
    @DisplayName("Kiểm tra phép chia với giá trị số nguyên lớn nhất (Integer.MAX_VALUE / 1)")
    public void kiemTraChiaGiaTriLonNhat() {
        assertEquals(Integer.MAX_VALUE, dichVu.chia(Integer.MAX_VALUE, 1));
    }

    // Giá trị biên: giá trị số nguyên nhỏ nhất
    @Test
    @DisplayName("Kiểm tra phép chia với giá trị số nguyên nhỏ nhất (Integer.MIN_VALUE / 1)")
    public void kiemTraChiaGiaTriNhoNhat() {
        assertEquals(Integer.MIN_VALUE, dichVu.chia(Integer.MIN_VALUE, 1));
    }

    // Trường hợp lỗi: chia cho 0
    @Test
    @DisplayName("Kiểm tra phép chia cho 0 sẽ ném ngoại lệ ArithmeticException")
    public void kiemTraChiaCho0() {
        assertThrows(ArithmeticException.class, () -> dichVu.chia(10, 0));
    }
}
