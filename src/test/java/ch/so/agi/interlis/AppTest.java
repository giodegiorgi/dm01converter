package ch.so.agi.interlis;

import org.junit.Test;

import ch.so.agi.interlis.App;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}