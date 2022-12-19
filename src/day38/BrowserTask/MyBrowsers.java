package day38.BrowserTask;

public class MyBrowsers {
    public static void main(String[] args) {
        ChromeBrowser chrome=new ChromeBrowser();
        Firefox firefox= new Firefox();
        chrome.openBrowser();
        chrome.closeBrowser();
        System.out.println("---------------------------");
        firefox.openBrowser();
        firefox.closeBrowser();
    }
}
