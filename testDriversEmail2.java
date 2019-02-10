import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDriversEmail2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/abtahiayon/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.gmail.com/");

        driver.findElement(By.id("identifierId")).sendKeys("automation4648@gmail.com");

        driver.findElement(By.className("CwaK9")).click();

        Thread.sleep(2000);

        //driver.findElement(By.className("RveJvd snByac"));

        driver.findElement(By.name("password")).sendKeys("ayon1996");


        driver.findElement(By.className("CwaK9")).click();

        Thread.sleep(5000);

        driver.findElement(By.className("aic")).click();

        Thread.sleep(2000);

        driver.findElement(By.className("vO")).sendKeys("tselenium753@gmail.com");

        Thread.sleep(2000);

        driver.findElement(By.className("aoT")).sendKeys("Selenium");

        driver.findElement(By.className("Am")).sendKeys("Hi this is world");

        driver.findElement(By.className("aoO")).click();

        Thread.sleep(2000);

        driver.findElement(By.className("gbii")).click();

        driver.findElement(By.id("gb_71")).click();


        String at = driver.getTitle();
        String et = "gmail";
        //driver.close();
        if (at.equalsIgnoreCase(et)) ;
        {
            System.out.println("Test Successful");
        }

    }
}
