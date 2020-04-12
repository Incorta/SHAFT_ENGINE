package testPackage01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;
import com.shaft.gui.element.Touch.SwipeDirection;
import com.shaft.validation.Verifications;
import com.shaft.validation.Verifications.VerificationType;

public class Test_Appium2 {
    private WebDriver driver;

    private By accessibilityButton = By.xpath("//android.widget.TextView[@content-desc='Accessibility']");
    private By viewsButton = By.xpath("//android.widget.TextView[@content-desc='Views']");
    private By webView3 = By.xpath("//android.widget.TextView[@content-desc='WebView3']");

//    @Test
//    public void verifyLandingPageContent() {
//	Verifications.verifyElementExists(driver, accessibilityButton, VerificationType.POSITIVE);
//	ElementActions.performTouchAction(driver).swipeElementIntoView(viewsButton, SwipeDirection.DOWN);
//	Verifications.verifyElementExists(driver, viewsButton, VerificationType.POSITIVE);
//	ElementActions.performTouchAction(driver).tap(viewsButton);
//	ElementActions.performTouchAction(driver).swipeElementIntoView(webView3, SwipeDirection.DOWN).tap(webView3);
//    }

    @BeforeClass
    public void setup() {
	driver = BrowserFactory.getBrowser();
    }
}
