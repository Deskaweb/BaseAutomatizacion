package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {

    protected WebDriver webDriver;

    public Page(WebDriver webDriver) {


        try
        {
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }

        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void espera(Integer segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
        }
    }
}
