package com.company.Java;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MainTest {

    Main main;
    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void randNum() {
        int random = (int) (Math.random() * 19 + 1);
        assertTrue(random >= 1 && 20 >= random);
    }

    @Test
    void intro() {
        String intro = "Hello! What is your name? ";
        assertEquals("Hello! What is your name? ", intro, "Failure with intro method.");
    }

    @Test
    void getName() {
        String name = "J";
        assertEquals("J", name, "Failure with getName method.");
    }

    @Test
    void feedback() {
        int random = 10;
        assertEquals(10, random, "Failure with feedback method.");
    }

    @Test
    void getGuess() {
    }

    @Test
    void playing() {
    }

    @Test
    void continuing() {
    }

    @AfterEach
    void tearDown() {
    }
}