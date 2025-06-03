package com.SOF3041.lesson04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1 - Maximize browser của mình
        driver.manage().window().maximize();

//2 - Đi đến 1 url
        driver.navigate().to("https://anhtester.com");

//3 - Lấy Title và in ra console
        System.out.println(driver.getTitle());

//4 - Thoát hẳn Browser
        driver.quit();
    }
}
