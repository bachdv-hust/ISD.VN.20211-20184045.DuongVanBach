package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaceOrderControllerTest {
    private PlaceOrderController controller;
    @BeforeEach
    void setUp() throws Exception {
        controller = new PlaceOrderController();
    }

    @Test
    public void testName() {
        assertTrue(controller.validateName("Nguyen van A "));
        assertFalse(controller.validateName("Nnguyen Van A 123"));
        assertFalse(controller.validateName("Nnguyen Van A @"));
        fail("Not yet implemented");
    }
    @Test
    public void testAddress(){

    }
}