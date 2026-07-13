package org.prog.session17.allure.tool;

import io.qameta.allure.Step;

public class WebTool {

    @Step("Load page {0}")
    public void mrthod1(String s1) {
    }

    @Step("Find user by name {0}")
    public void mrthod2(String s2) {
    }

    @Step("Count users: {0}")
    public void mrthod3(int i) {
    }

    @Step("Check price for {0} and {1}")
    public void mrthod4(String s1, String s2) {
    }

    @Step("Log out")
    public void mrthod5() {
    }

    @Step("Close tab")
    public void mrthod6() {
    }
}
