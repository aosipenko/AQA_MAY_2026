package org.prog.session17.allure;

import org.prog.session17.allure.tool.APITool;
import org.prog.session17.allure.tool.DBTool;
import org.prog.session17.allure.tool.WebTool;
import org.testng.annotations.Test;

public class AllureStepsDemoTest {

    private APITool apiTool = new APITool();
    private DBTool dbTool = new DBTool();
    private WebTool webTool = new WebTool();

    @Test
    public void allureStepsDemo() {
        apiTool.mrthod1("test_value_1");
        apiTool.mrthod5();
        dbTool.mrthod1("test_value_1");
        dbTool.mrthod2("test_value_2");
        webTool.mrthod1("test_value_1");
        webTool.mrthod5();
    }
}
