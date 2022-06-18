import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start001 {
    WebDriver wd;

    @Test
    public void start001() {
        wd = new ChromeDriver();
        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");// with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        //wd.close();
        wd.quit();
    }

    @Test
    public void firstTest01() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        //open form --> click login button
        WebElement loginTab =wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();
        // fill valid email
        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("noa@gmail.com");
        // fill valid password
        WebElement passwordtextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordtextBox.click();
        passwordtextBox.clear();
        passwordtextBox.sendKeys("Nnoa12345$");
        // click login button
        WebElement loginButton = wd.findElement(By.cssSelector("button"));
        loginButton.click();

        //Assert
    }
    @Test
    public void firstRegistrationSuccess(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        //open form --> click login button
        WebElement loginTab =wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();
        // fill valid email
        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("alex@gmail.com");
        // fill valid password
        WebElement passwordtextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordtextBox.click();
        passwordtextBox.clear();
        passwordtextBox.sendKeys("Alex12345$");
        // click login button
        List<WebElement> loginButton = wd.findElements(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(6)"));
        loginButton.clear();

    }

}
