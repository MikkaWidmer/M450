package ch.tbz.m450.service;

import ch.tbz.m450.repository.Address;
import ch.tbz.m450.repository.AddressRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AddressServiceTest {

    @Mock
    private AddressRepository addressRepository;

    @InjectMocks
    private AddressService addressService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveAddress() {
        Address addressToSave = new Address(); // Hier könnten Sie Testdaten für die Adresse erstellen
        when(addressRepository.save(any())).thenReturn(addressToSave);

        Address savedAddress = addressService.save(addressToSave);

        assertNotNull(savedAddress);
        // Weitere Überprüfungen können je nach Bedarf hinzugefügt werden
    }

    @Test
    public void testGetAllAddresses() {
        Address address1 = new Address(0, "John", "Doe", "123456789", Date.valueOf(LocalDate.now()));
        Address address2 = new Address(1, "Alice", "Murr", "121342089", Date.valueOf(LocalDate.now()));
        List<Address> addresses = Arrays.asList(address1, address2);
        when(addressRepository.findAll()).thenReturn(addresses);

        List<Address> allAddresses = addressService.getAll();

        assertEquals(2, allAddresses.size());
        // Weitere Überprüfungen können je nach Bedarf hinzugefügt werden
    }

    @Test
    public void testGetAddressById() {
        int addressId = 1;
        Address address = new Address();
        when(addressRepository.findById(addressId)).thenReturn(Optional.of(address));

        Optional<Address> retrievedAddress = addressService.getAddress(addressId);

        assertTrue(retrievedAddress.isPresent());
        // Weitere Überprüfungen können je nach Bedarf hinzugefügt werden
    }
}
