/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutkse.testngdemo;

import com.hieutkse.testngdemo.testdata.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 *
 * @author Admin
 */
public class LoginTest { 
    public String baseUrl = "http://localhost:8080/TestNGDemo/";
    String driverPath = "chromedriver.exe";
    public WebDriver driver;

    
    //*** TEST mình đang đứng ở login screen
//    @Test
//    public void verifyIndexpageTitle() {
//        System.out.println("Launching chrome browser");
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        driver = new ChromeDriver();
//        driver.get(baseUrl);
//        String expectedTitle = "LOGIN PAGE";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);
//        driver.close();
//    }

    
    //***TEST login thành công bằng role user và nhập thẳng username & password vào code
//    @Test
//    public void testLoginSuccesfullyByUserRole() throws InterruptedException {
//        System.out.println("Launching chrome browser");
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        driver = new ChromeDriver();
//        driver.get(baseUrl);
//        
//        WebElement username = driver.findElement(By.id("username"));
//        username.sendKeys("hieu");
//        
//        WebElement password = driver.findElement(By.id("password"));
//        password.sendKeys("1");
//        
//        WebElement loginButton = driver.findElement(By.id("Login"));
//        loginButton.click();
//        
//        Thread.sleep(3000);
//        
//        String expectedTitle = "USER PAGE";
//        String actualTile = driver.getTitle();
//        Assert.assertEquals(actualTile, expectedTitle);
//        driver.close();
//    }

    
    //***TEST login thành công bằng role admin và nhập thẳng username & password vào code
//    @Test
//    public void testLoginSuccesfullyByAdminRole() throws InterruptedException {
//        System.out.println("Launching chrome browser");
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        driver = new ChromeDriver();
//        driver.get(baseUrl);
//        
//        WebElement username = driver.findElement(By.id("username"));
//        username.sendKeys("admin");
//        
//        WebElement password = driver.findElement(By.id("password"));
//        password.sendKeys("123");
//        
//        WebElement loginButton = driver.findElement(By.id("Login"));
//        loginButton.click();
//        
//        Thread.sleep(3000);
//        
//        String expectedTitle = "ADMIN PAGE";
//        String actualTile = driver.getTitle();
//        Assert.assertEquals(actualTile, expectedTitle);
//        driver.close();
//    }

    
    //***TEST login thất bại nhập thẳng username & password vào code
//    @Test
//    public void testLoginFailed() throws InterruptedException {
//        System.out.println("Launching chrome browser");
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        driver = new ChromeDriver();
//        driver.get(baseUrl);
//        
//        WebElement username = driver.findElement(By.id("username"));
//        username.sendKeys("asdads");
//        
//        WebElement password = driver.findElement(By.id("password"));
//        password.sendKeys("asfda");
//        
//        WebElement loginButton = driver.findElement(By.id("Login"));
//        loginButton.click();
//        
//        Thread.sleep(3000);
//        
//        String expectedErrorMessage = "Invalid username and password";
//        
//        WebElement errorMessage = driver.findElement(By.id("error"));
//        String actualErrorMessage = errorMessage.getText();
//        
//        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
//    }
   
    
    
    //***GET DATA FROM ARRAYLIST     
//    @DataProvider
//    public static Object[][] initData() {
//        return new String[][] {
//            {"hieu","pa"}
//        };
//    }
//    
//    @Test(dataProvider = "initData")
//    public void testLoginSuccesfullyByUserRoleData(String username, String password) throws InterruptedException {
//        System.out.println("Launching chrome browser");
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        driver = new ChromeDriver();
//        driver.get(baseUrl);
//        
//        WebElement usernameWeb = driver.findElement(By.id("username"));
//        usernameWeb.sendKeys(username);
//        
//        WebElement passwordWeb = driver.findElement(By.id("password"));
//        passwordWeb.sendKeys(password);
//        
//        WebElement loginButton = driver.findElement(By.id("Login"));
//        loginButton.click();
//        
//        Thread.sleep(3000);
//        
//        String expectedTitle = "USER PAGE";
//        String actualTile = driver.getTitle();
//        Assert.assertEquals(actualTile, expectedTitle);
//        driver.close();
//    }
    
    
    
//*** GET DATA FROM EXCEL
//    @DataProvider
//    public Object[][] getLoginData() throws Exception {
//        Object data[][] = TestUtil.getTestData();
//        return data;
//    }
//    
//    @Test(dataProvider = "getLoginData")
//    public void testLoginSuccesfullyByUserRoleData(String username, String password) throws InterruptedException {
//        System.out.println("Launching chrome browser");
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        driver = new ChromeDriver();
//        driver.get(baseUrl);
//        
//        WebElement usernameWeb = driver.findElement(By.id("username"));
//        usernameWeb.sendKeys(username);
//        
//        WebElement passwordWeb = driver.findElement(By.id("password"));
//        passwordWeb.sendKeys(password);
//        
//        WebElement loginButton = driver.findElement(By.id("Login"));
//        loginButton.click();
//        
//        Thread.sleep(3000);
//        
//        String expectedTitle = "USER PAGE";
//        String actualTile = driver.getTitle();
//        Assert.assertEquals(actualTile, expectedTitle);
//        driver.close();
//    }
}
