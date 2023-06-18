package HWclass9;

import Utils.CommonMethods;

import java.io.IOException;

public class Task1 extends CommonMethods1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        Thread.sleep(1000);
        takeScreenshot("SSHW9");
        Thread.sleep(1000);
        driver.quit();

    }
}

//HW9:
//create a method in Common methods for screenshot
//it should take file name as a parameter.