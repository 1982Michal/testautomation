package com.jsystems.testautomation.parametrized;


import com.jsystems.testautomation.ConfigJUpiter;
import com.jsystems.testautomation.GamePlay;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Parametrized test with JUnit 5")
public class ParametrizedJUpiterTest extends ConfigJUpiter {

    @ParameterizedTest
    @CsvSource({"Hello, 5", "Hello JUnit 5, 15", "'Hello, Junit 5!', 25"})
    public void parametrizedFirstTest(String param1, int param2) {
        assertTrue(param1.contains("Hello"));
        assertTrue(param2 % 5 == 0);

    }

    @DisplayName("Check if it contains Hello for String param")
    @ParameterizedTest
    @CsvSource({"Hello", "FirstHello", "Hello World"})
    public void parametrizedFirstTestOneParam(String param) {
        assertTrue(param.contains("Hello"));

    }

    @DisplayName("Check if it contains Hello for integer param")
    @ParameterizedTest
    @CsvSource({"15", "25", "35"})
    public void parametrizedFirstTestOneParam(int param) {
        assertTrue(param % 5 == 0);

    }


    @DisplayName("Check if file contains params")
    @ParameterizedTest
    @CsvFileSource(resources = "/plik.csv")
    public void parameterizednextTestCsvFile(String param1, int param2) {
        assertTrue(param1.contains("Hello"));
        assertTrue(param2 % 5 == 0);
    }

    GamePlay gamePlay = new GamePlay();


    @Test
    @DisplayName("Test for checking if exception was thrown")
    public void exceptionTest() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    gamePlay.play(0);
                }
        );
    }
}



