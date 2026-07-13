package org.prog.session17.allure.tool;

import io.qameta.allure.Step;

public class DBTool {

    @Step("Call DB for {0}")
    public void mrthod1(String s1) {
    }

    @Step("Call another DB for {0}")
    public void mrthod2(String s2) {
    }

    @Step("Call DB {0} times")
    public void mrthod3(int i) {
    }

    @Step("Call DB for {0} and {1}")
    public void mrthod4(String s1, String s2) {
    }

    @Step("Call DB to reset login")
    public void mrthod5() {
    }

    @Step("Call DB to logout")
    public void mrthod6() {
    }
}
