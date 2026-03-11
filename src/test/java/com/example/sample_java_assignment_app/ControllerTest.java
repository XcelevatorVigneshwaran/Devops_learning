package com.example.sample_java_assignment_app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    SpringbootSampleAppApplication app = new SpringbootSampleAppApplication();

    @Test
    void testLogin() {
        String result = app.login("test");
        assertEquals("Please input your credentials for login...", result);
    }

    @Test
    void testRegister() {
        String result = app.register("test");
        assertEquals("Please follow registration process...", result);
    }
}