package lesson03;

import com.SOF3041.lesson03.service.TinhTrungBinhService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Lớp kiểm thử cho DichVuTinhTrungBinh
 */
public class TestTrungBinh {

    TinhTrungBinhService dichVu = new TinhTrungBinhService();

    @Test
    @DisplayName("Kiểm tra tính trung bình cộng với các số dương")
    public void kiemTraTrungBinhCongVoiCacSoDuong() {
        List<Integer> danhSachSo = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3.0, dichVu.tinhTrungBinhCong(danhSachSo));
    }

    @Test
    @DisplayName("Kiểm tra tính trung bình cộng với các số âm")
    public void kiemTraTrungBinhCongVoiCacSoAm() {
        List<Integer> danhSachSo = Arrays.asList(-1, -2, -3, -4, -5);
        assertEquals(-3.0, dichVu.tinhTrungBinhCong(danhSachSo));
    }

    @Test
    @DisplayName("Kiểm tra tính trung bình cộng với các số hỗn hợp")
    public void kiemTraTrungBinhCongVoiCacSoHonHop() {
        List<Integer> danhSachSo = Arrays.asList(-10, -5, 0, 5, 10);
        assertEquals(0.0, dichVu.tinhTrungBinhCong(danhSachSo));
    }

    @Test
    @DisplayName("Kiểm tra tính trung bình cộng với một số duy nhất")
    public void kiemTraTrungBinhCongVoiMotSoDuyNhat() {
        List<Integer> danhSachSo = Collections.singletonList(5);
        assertEquals(5.0, dichVu.tinhTrungBinhCong(danhSachSo));
    }

    @Test
    @DisplayName("Kiểm tra tính trung bình cộng với danh sách trống sẽ ném ngoại lệ ArithmeticException")
    public void kiemTraTrungBinhCongVoiDanhSachTrong() {
        List<Integer> danhSachSo = Collections.emptyList();
        assertThrows(ArithmeticException.class, () -> dichVu.tinhTrungBinhCong(danhSachSo));
    }

    @Test
    @DisplayName("Kiểm tra tính trung bình cộng với danh sách null sẽ ném ngoại lệ ArithmeticException")
    public void kiemTraTrungBinhCongVoiDanhSachNull() {
        assertThrows(ArithmeticException.class, () -> dichVu.tinhTrungBinhCong(null));
    }
}
