package controller;

public class PlaceRushOrderController extends  PlaceOrderController{
    @Override
    public boolean validateAddress(String address) {
        return false;

    }

    public boolean validateScheduledDate(String date) {
        return false;
    }
}
