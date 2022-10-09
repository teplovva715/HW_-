package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get ( "http://google.com" );


    }
}