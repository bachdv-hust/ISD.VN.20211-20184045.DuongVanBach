package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaceRushOrderControllerTest {
    private PlaceRushOrderController controller;
    @BeforeEach
    void setUp() throws Exception {
        controller = new PlaceRushOrderController();
    }

    @Test
    public void testName() {
        assertTrue(controller.validateName("Nguyen van A "));
        assertFalse(controller.validateName("Nnguyen Van A 123"));
        assertFalse(controller.validateName("Nnguyen Van A @"));
        fail("Not yet implemented");
    }
    @Test
    public void testPhoneNumber(){
        assertTrue(controller.validatePhoneNumber("0393841111"));
        assertFalse(controller.validatePhoneNumber(""));
    }
    @Test
    public void testAddress(){
        assertFalse(controller.validateName(""));
        assertTrue(controller.validateName("Ha Noi"));
    }
    @Test
    public void testScheduledDate(){
        assertFalse(controller.validateScheduledDate("1/1/2021"));
        assertTrue(controller.validateScheduledDate("1-1-2021"));
        assertTrue(controller.validateScheduledDate("01/01/2021"));
    }

}