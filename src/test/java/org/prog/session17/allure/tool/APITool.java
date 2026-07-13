package org.prog.session17.allure.tool;

import io.qameta.allure.Step;

public class APITool {

    @Step("Call API for {0}")
    public void mrthod1(String s1) {
    }

    @Step("Call another API for {0}")
    public void mrthod2(String s2) {
    }

    @Step("Call API {0} times")
    public void mrthod3(int i) {
    }

    @Step("Call API for {0} and {1}")
    public void mrthod4(String s1, String s2) {
    }

    @Step("Call API to reset login")
    public void mrthod5() {
    }

    @Step("Call API to logout")
    public void mrthod6() {
    }
}
