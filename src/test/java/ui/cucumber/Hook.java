package ui.cucumber;

import io.cucumber.java.After;
import ui.core.DriverManage;

public class Hook {
@After
public void close(){
    DriverManage.getInstance().getDriver().quit();
}
}
