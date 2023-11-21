import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatePriceTest {
    @Test
    void test_calculate_price() {
        CalculatePrice calculatePrice = new CalculatePrice();
        double baseprice = 100.0;
        double specialprice = 20.0;
        double extraprice = 10.0;
        int extras = 0; // adjust as needed
        double discount = 20.0; // adjust as needed

        double price = calculatePrice.calculatePrice(baseprice, specialprice, extraprice, extras, discount);

        Assertions.assertEquals(108,price);
    }
}