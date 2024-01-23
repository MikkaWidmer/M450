package ch.tbz.m450.util;

import ch.tbz.m450.repository.Address;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressComparatorTest {

    private final AddressComparator addressComparator = new AddressComparator();

    @Test
    public void testAddressComparisonByFirstname() {
        Address address1 = createTestAddress("Alice", "Doe", "123456789");
        Address address2 = createTestAddress("John", "Doe", "123456789");

        int result = addressComparator.compare(address1, address2);

        assertTrue(result < 0); // Alice kommt vor John
    }


    @Test
    public void testAddressComparisonByLastname() {
        Address address1 = createTestAddress("John", "Doe", "123456789");
        Address address2 = createTestAddress("John", "Smith", "123456789");

        int result = addressComparator.compare(address1, address2);

        assertTrue(result < 0); // Doe kommt vor Smith
    }

    @Test
    public void testAddressComparisonEqual() {
        Address address1 = createTestAddress("John", "Doe", "123456789");
        Address address2 = createTestAddress("John", "Doe", "123456789");

        int result = addressComparator.compare(address1, address2);

        assertEquals(0, result); // Adressen sind gleich
    }

    private Address createTestAddress(String firstname, String lastname, String phonenumber) {
        Address address = new Address();
        address.setFirstname(firstname);
        address.setLastname(lastname);
        address.setPhonenumber(phonenumber);
        // Weitere Eigenschaften setzen, wenn nötig
        return address;
    }

    @Test
    public void testAddressComparisonByPhonenumber() {
        Address address1 = createTestAddress("Alice", "Doe", "123456789");
        Address address2 = createTestAddress("Alice", "Doe", "987654321");

        int result = addressComparator.compare(address1, address2);

        System.out.println("Result: " + result);

        assertTrue(result < 0); // 123456789 kommt vor 987654321
    }

}
