package Class25_InterFace;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver []webDrivers={new ChromeDriver(),new Firefox() };
        for(WebDriver web:webDrivers){
            web.openBrowser();
            web.closeElement();
            web.maximizeWindows();
            web.findElement();
        }
    }
}
