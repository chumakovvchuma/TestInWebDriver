import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;


public class Cheeskake {

    @Test

    public void listCheesecakes() {
        System.setProperty("webdriver.gecko.driver","c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.thecheesecakefactory.com/");

        driver.findElement(By.linkText("Menu")).click();

        driver.findElement(By.linkText("Cheesecake")).click();

        List<WebElement> cheesecakes = driver.findElements(By.xpath("id(&#39;leftNav_levelTwo&#39;)//li"));



        System.out.println(cheesecakes.size() + " cheesecakes:");

        for (int i=0; i<cheesecakes.size(); i++) {

            System.out.println(i+1 + ". " + cheesecakes.get(i).getText());

        }

    }


}
