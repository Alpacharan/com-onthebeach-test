package Holiday;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Utils extends Base{

        public void scrollToPage() {
            JavascriptExecutor js =(JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        }
        public void drpDown(){
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            JavascriptExecutor je=((JavascriptExecutor)driver);
            je.executeScript("arguments[0].scrollIntoView(true);",element);

        }
		 public void capScreenshot(WebDriver driver, String Screenshot) {

        try {
            TakesScreenshot t = (TakesScreenshot) Base.driver;
            File source = t.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("Screenshots"+Screenshot+".png"));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception" + e.getMessage());
        }
    }
    }


