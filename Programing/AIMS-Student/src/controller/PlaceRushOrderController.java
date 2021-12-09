package controller;

public class PlaceRushOrderController extends PlaceOrderController {

    /**
     * This method validate address
     * @param address is address want to check
     * @return true if address is ok
     */
    @Override
    public boolean validateAddress(String address) {
        return false;
    }

    /**
     * This method validate date
     * @param date is date want to check
     * @return true if date is ok
     */
    public boolean validateScheduledDate(String date) {
        return false;
    }

}
