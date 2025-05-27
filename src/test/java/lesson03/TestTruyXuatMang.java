package lesson03;

import com.SOF3041.lesson03.service.TruyXuatMangService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Lớp kiểm thử cho ArrayElementAccessor
 */
public class TestTruyXuatMang {

    TruyXuatMangService accessor = new TruyXuatMangService();

    @Test
    @DisplayName("Kiểm tra truy cập vị trí hợp lệ trong mảng số nguyên")
    public void testTruyCapViTriHopLeTrongMangSoNguyen() {
        Integer[] mang = {1, 2, 3, 4, 5};
        assertEquals(3, accessor.layPhanTuTheoViTri(mang, 2));
    }

    @Test
    @DisplayName("Kiểm tra truy cập phần tử đầu tiên (trường hợp biên)")
    public void testTruyCapPhanTuDauTien() {
        String[] mang = {"đầu tiên", "thứ hai", "thứ ba"};
        assertEquals("đầu tiên", accessor.layPhanTuTheoViTri(mang, 0));
    }

    @Test
    @DisplayName("Kiểm tra truy cập phần tử cuối cùng (trường hợp biên)")
    public void testTruyCapPhanTuCuoiCung() {
        Double[] mang = {1.1, 2.2, 3.3};
        assertEquals(3.3, accessor.layPhanTuTheoViTri(mang, 2));
    }

    @Test
    @DisplayName("Kiểm tra truy cập vị trí âm sẽ ném ngoại lệ IndexOutOfBoundsException")
    public void testTruyCapViTriAm() {
        Character[] mang = {'a', 'b', 'c'};
        assertThrows(IndexOutOfBoundsException.class, () -> accessor.layPhanTuTheoViTri(mang, -1));
    }

    @Test
    @DisplayName("Kiểm tra truy cập vị trí bằng độ dài mảng sẽ ném ngoại lệ IndexOutOfBoundsException")
    public void testTruyCapViTriBangDoDaiMang() {
        Boolean[] mang = {true, false, true};
        assertThrows(IndexOutOfBoundsException.class, () -> accessor.layPhanTuTheoViTri(mang, 3));
    }

    @Test
    @DisplayName("Kiểm tra truy cập vị trí lớn hơn độ dài mảng sẽ ném ngoại lệ IndexOutOfBoundsException")
    public void testTruyCapViTriLonHonDoDaiMang() {
        Integer[] mang = {10, 20, 30};
        assertThrows(IndexOutOfBoundsException.class, () -> accessor.layPhanTuTheoViTri(mang, 10));
    }

    @Test
    @DisplayName("Kiểm tra truyền mảng null sẽ ném ngoại lệ IllegalArgumentException")
    public void testMangNull() {
        Integer[] mang = null;
        assertThrows(IllegalArgumentException.class, () -> accessor.layPhanTuTheoViTri(mang, 0));
    }

    @Test
    @DisplayName("Kiểm tra truy cập phần tử trong mảng rỗng sẽ ném ngoại lệ IndexOutOfBoundsException")
    public void testMangRong() {
        String[] mang = new String[0];
        assertThrows(IndexOutOfBoundsException.class, () -> accessor.layPhanTuTheoViTri(mang, 0));
    }
}
