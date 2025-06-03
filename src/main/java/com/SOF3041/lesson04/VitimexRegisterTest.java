package com.SOF3041.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VitimexRegisterTest {
    public static void main(String[] args) {
        // Khởi tạo trình điều khiển Chrome
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Mở trang web
            driver.get("https://vitimex.com.vn/");

            // Nhấp vào liên kết "Đăng ký"
            WebElement registerLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Đăng ký")));
            registerLink.click();

            // Đợi và điền các trường thông tin đăng ký
            WebElement nameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("ten")));
            WebElement phoneInput = driver.findElement(By.name("phone"));
            WebElement emailInput = driver.findElement(By.name("email"));
            WebElement passwordInput = driver.findElement(By.name("password"));
            WebElement confirmPasswordInput = driver.findElement(By.name("confirm_password"));

            nameInput.sendKeys("Tran Xuan Vinh");
            phoneInput.sendKeys("0395227608");
            emailInput.sendKeys("beochy204@gmail.com");
            passwordInput.sendKeys("123");
            confirmPasswordInput.sendKeys("123");

            // Nhấp vào nút "Đăng ký"
            WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
            submitButton.click();

            // Đợi xác nhận đăng ký thành công (có thể cần chỉnh locator)
            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("alert-success")));
            System.out.println("Đăng ký thành công!");

        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi trong quá trình đăng ký: " + e.getMessage());
        } finally {
            // Đợi 5 giây rồi đóng trình duyệt
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}

