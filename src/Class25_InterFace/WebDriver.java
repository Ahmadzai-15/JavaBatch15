package Class25_InterFace;
public interface WebDriver {
    void openBrowser();
    void closeElement();
    void maximizeWindows();
    void findElement();}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Click on Chrome icon to OpenBrowser");
    }
    @Override
    public void closeElement() {
        System.out.println("Click on Chrome X close icon to closeBrowser");
    }
    @Override
    public void findElement() {
        System.out.println("ctr+f to find the file/word");}
    @Override
    public void maximizeWindows() {
        System.out.println("Click on Chrome Maximize icon to Maximize the page");}}
class Firefox implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Click on FireFox icon to OpenBrowser");
    }
    @Override
    public void closeElement() {
        System.out.println("Click on FireFox icon to CloseBrowser");
    }
    @Override
    public void findElement() {
        System.out.println("ctr+f to find the file/word");
    }
    @Override
    public void maximizeWindows() {
        System.out.println("Click on FireFox icon to maximize the page");

    }
}