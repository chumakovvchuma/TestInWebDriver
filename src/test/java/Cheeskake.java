import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;


public class Cheeskake {

    @Test

    public void listCheesecakes() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.thecheesecakefactory.com/");

        driver.findElement(By.xpath(".//*[@id='closeBtn']")).click();
        sleep(3000);

        driver.findElement(By.cssSelector(".head-menu>span")).click();
        sleep(3000);

        driver.findElement(By.xpath(".//*[@id='foodMenuPanels']/div[2]/div/div[1]/ul/li[1]/a/div")).click();
        sleep(3000);

        driver.findElement(By.xpath(".//*[@id='foodMenuPanels']/div[2]/div/div[2]/ul[7]/li[1]/a/div")).click();
        sleep(3000);

        List<WebElement> cheesecakes = driver.findElements(By.xpath("id(&#39;leftNav_levelTwo&#39;)//li"));



        System.out.println(cheesecakes.size() + " cheesecakes:");

        for (int i=0; i<cheesecakes.size(); i++) {

            System.out.println(i+1 + ". " + cheesecakes.get(i).getText());

        }

    }


}
