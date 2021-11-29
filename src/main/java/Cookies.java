import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.Set;


public class Cookies {
    public static WebDriver driver;

    public static void main(String[] args) {
        launch_opera();
        openUrl();
        add_cookies();
        get_cookies();

    }

    public static void launch_opera() {
        System.setProperty("webdriver.opera.driver", "./src/main/resources/operadriver.exe");
        driver = new OperaDriver();
        driver.manage().window().maximize();
    }

    public static void openUrl() {
        driver.get("https://www.youtube.com/");
    }

    public static void add_cookies() {
        Cookie cok = new Cookie("Rafa", "Test Cookie set by Automated Script");
        driver.manage().addCookie((cok));

    }

    public static void get_cookies() {
        Set allCookies= driver.manage().getCookies();
        System.out.println(allCookies);
        System.out.println("Name of Cookies Present:"+allCookies.size());
    }

}

