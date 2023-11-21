class CalculatePrice{
    double calculatePrice(double baseprice, double specialprice, double extraprice, int extras, double discount) {
        double addon_discount;
        double result;

        if (extras >= 3)
            addon_discount = 10;
        else if (extras >= 5)
            addon_discount = 15;
        else
            addon_discount = 0;

        if (discount > addon_discount)
            addon_discount = discount;

        double discountedBasePrice = baseprice / 100.0 * (100 - addon_discount);

        result = discountedBasePrice + specialprice + extraprice;

        return result;
    }
}