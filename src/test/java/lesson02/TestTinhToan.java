package lesson02;

import com.SOF3041.lesson02.service.TinhToanService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for TinhToanService
 */
public class TestTinhToan {

    TinhToanService service = new TinhToanService();

    @Test
    @DisplayName("Test tinhTong with 5 + 10")
    public void tinhTong1() {
        assertEquals(15, service.tinhTong(5, 10));
    }

    @Test
    @DisplayName("Test tinhTong with 4 + 10")
    public void tinhTong2() {
        assertEquals(14, service.tinhTong(4, 10));
    }

    @Test
    @DisplayName("Test tinhTong with 6 + 10") 
    public void tinhTong3() {
        assertEquals(16, service.tinhTong(6, 10));
    }

    @Test
    @DisplayName("Test tinhTong with 9 + 10")
    public void tinhTong4() {
        assertEquals(19, service.tinhTong(9, 10));
    }

    @Test
    @DisplayName("Test tinhTong with 10 + 10")
    public void tinhTong5() {
        assertEquals(20, service.tinhTong(10, 10));
    }
    
    @Test
    @DisplayName("Test tinhTong with negative numbers")
    public void tinhTongWithNegativeNumbers() {
        assertEquals(-5, service.tinhTong(-2, -3));
    }
    
    @Test
    @DisplayName("Test tinhTong with zero")
    public void tinhTongWithZero() {
        assertEquals(7, service.tinhTong(7, 0));
        assertEquals(5, service.tinhTong(0, 5));
        assertEquals(0, service.tinhTong(0, 0));
    }
    
    @Test
    @DisplayName("Test tinhTong with positive and negative numbers")
    public void tinhTongWithMixedSigns() {
        assertEquals(0, service.tinhTong(5, -5));
        assertEquals(-3, service.tinhTong(2, -5));
        assertEquals(3, service.tinhTong(-2, 5));
    }
    
    @ParameterizedTest
    @CsvSource({
        "1, 1, 2",
        "5, 5, 10",
        "-1, -1, -2",
        "-5, 5, 0",
        "0, 0, 0",
        "100, 200, 300"
    })
    @DisplayName("Parameterized test for tinhTong")
    public void parameterizedTinhTongTest(int a, int b, int expected) {
        assertEquals(expected, service.tinhTong(a, b));
    }
}
