package ch.tbz.m450.controller;

import ch.tbz.m450.controller.AddressController;
import ch.tbz.m450.repository.Address;
import ch.tbz.m450.service.AddressService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class AddressControllerTest {

    @Mock
    private AddressService addressService;

    @InjectMocks
    private AddressController addressController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateAddress() {
        Address addressToCreate = createTestAddress();
        when(addressService.save(addressToCreate)).thenReturn(addressToCreate);

        ResponseEntity<Address> response = addressController.createAddress(addressToCreate);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(addressToCreate, response.getBody());
        verify(addressService, times(1)).save(addressToCreate);
    }

    @Test
    public void testGetAddresses() {
        Address address1 = createTestAddress();
        Address address2 = createTestAddress();
        List<Address> addresses = Arrays.asList(address1, address2);
        when(addressService.getAll()).thenReturn(addresses);

        ResponseEntity<List<Address>> response = addressController.getAddresses();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(addresses, response.getBody());
        verify(addressService, times(1)).getAll();
    }

    @Test
    public void testGetAddressById() {
        int addressId = 1;
        Address address = createTestAddress();
        when(addressService.getAddress(addressId)).thenReturn(Optional.of(address));

        ResponseEntity<Address> response = addressController.getAddress(addressId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(address, response.getBody());
        verify(addressService, times(1)).getAddress(addressId);
    }

    @Test
    public void testGetAddressByIdNotFound() {
        int addressId = 1;
        when(addressService.getAddress(addressId)).thenReturn(Optional.empty());

        ResponseEntity<Address> response = addressController.getAddress(addressId);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertTrue(response.getBody() == null);
        verify(addressService, times(1)).getAddress(addressId);
    }

    // Hilfsmethode zur Erstellung von Testadressen
    private Address createTestAddress() {
        Address address = new Address();
        address.setId(1);
        address.setFirstname("John");
        address.setLastname("Doe");
        address.setPhonenumber("123456789");
        // Weitere Eigenschaften setzen, wenn nötig
        return address;
    }
}
