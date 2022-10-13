package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    public void shouldCalcFirstRange() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSecondRange() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcSqr(100, 200);
        assertEquals(expected, actual);
    }
}
