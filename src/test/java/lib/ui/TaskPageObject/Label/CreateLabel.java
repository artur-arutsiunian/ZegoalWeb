package lib.ui.TaskPageObject.Label;

import lib.ui.MainPageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateLabel extends MainPageObject {

    private final static String
    CHOOSE_TASK = "(//span[@class='status-cell_link-cell__w93Tz'])[1]",
    CLICK_ON_LABEL_FIELD = "(//div[text()='N/A'])[1]",
    ADD_LABEL_BUTTON = "//div[text()='Add label']",
    INPUT_IN_NAME_FIELD = "//textarea[@placeholder='Name']",
    CLICK_ON_COLOR_FIELD = "//div[@id='mui-component-select-color']",
    GET_LIST_OF_COLORS = "//div[@class='MuiPaper-root MuiMenu-paper MuiPopover-paper MuiPaper-elevation8 MuiPaper-rounded']/ul/li",
    CHOOSE_COLOR = "//div[text()='Pink']",
    CLICK_ON_CREATE_BUTTON = "//span[text()='Create']",
    CLICK_ON_LABEL_FIELD_SECOND_TIME = "(//div[text()='N/A'])[1]",
    LABEL_COLOR_IS_PINK = "//li[@data-color='#ff375f']",
    LABEL_NAME_IS_AUTO = "//li[text()='auto']";

    public CreateLabel(WebDriver driver)
    {
        super(driver);
    }

    public void createLabelMethod() throws InterruptedException {
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_TASK),
                "can't click on task",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_LABEL_FIELD),
                "can't find 'label' field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(ADD_LABEL_BUTTON),
                "can't click on 'add label' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(INPUT_IN_NAME_FIELD),
                "auto",
                "can't input name of label",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_COLOR_FIELD),
                "can't click on 'color' field",
                5
        );
        Thread.sleep(2000);
        this.waitForElementsPresentSize(
                By.xpath(GET_LIST_OF_COLORS),
                "can't receive list of colors",
                5
        );

        int amount_of_elements = getAmountOfElements(
                By.xpath(GET_LIST_OF_COLORS)
        );
        Assert.assertEquals("Found incorrect number of colors", 9, amount_of_elements);

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_COLOR),
                "can't choose color",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_CREATE_BUTTON),
                "can't click on 'create' button",
                5
        );
        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CLICK_ON_LABEL_FIELD_SECOND_TIME),
                "can't find 'label' field",
                5
        );
        Thread.sleep(2000);
        this.assertElementHasAttribute(
                By.xpath(LABEL_COLOR_IS_PINK),
                "data-color",
                "#ff375f",
                "can't confirm that label color is correct"
        );
        Thread.sleep(2000);
        this.assertElementHasText(
                By.xpath(LABEL_NAME_IS_AUTO),
                "auto",
                "can't confirm that label name is correct"
        );
    }
}
