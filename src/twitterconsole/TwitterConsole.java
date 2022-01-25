
package twitterconsole;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TwitterConsole {

    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.gecko.driver", "D:\\java projects\\Cookies\\TwitterConsole\\src\\twitterconsole\\geckodriver.exe");

        
        String UserName,UserPassword;
        Scanner Obj = new Scanner(System.in);
        
        
        System.out.println("Enter the User name");
        UserName = Obj.nextLine();
        
        
        System.out.println("Enter the Password");
        UserPassword = Obj.nextLine();
        
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://twitter.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        WebElement userName = driver.findElement(By.cssSelector("div#react-root > div > div > div:nth-of-type(2) > main > div > div > div > form > div > div > label > div > div:nth-of-type(2) > div > input"));
        userName.sendKeys(UserName);
        
        WebElement userPassword = driver.findElement(By.cssSelector("div#react-root > div > div > div:nth-of-type(2) > main > div > div > div > form > div > div:nth-of-type(2) > label > div > div:nth-of-type(2) > div > input"));
        userPassword.sendKeys(UserPassword);
        userPassword.sendKeys(Keys.ENTER);
        
        String hashtag;
        System.out.println("Enter the HashTag");
        hashtag = Obj.nextLine();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.cssSelector("div#react-root > div > div > div:nth-of-type(2) > main > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div > div > div > div > div > form > div > div > div > div:nth-of-type(2) > input"));
        searchBox.sendKeys(hashtag);
        searchBox.sendKeys(Keys.ENTER);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement choosePhotos = driver.findElement(By.cssSelector("div#react-root > div > div > div:nth-of-type(2) > main > div > div > div > div > div > div > div:nth-of-type(2) > nav > div > div:nth-of-type(2) > div > div:nth-of-type(4) > a"));
        choosePhotos.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement sendpost = driver.findElement(By.cssSelector("div#react-root > div > div > div:nth-of-type(2) > header > div > div > div > div > div:nth-of-type(3) > a > div > span > div > div > span"));
        sendpost.click();
              sendpost.sendKeys("sifglwdfld");
       
       
    }

}
