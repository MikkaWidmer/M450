package ch.tbz.m450.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    private Address address;

    @BeforeEach
    public void setUp() {
        // Vor jedem Test wird eine neue Adresse erstellt
        address = new Address();
        // Hier könnten Sie auch Testdaten für die Adresse initialisieren
    }

    @Test
    public void testAddressCreation() {
        assertNotNull(address);
        // Fügen Sie weitere Tests für die Address-Klasse hinzu, wenn nötig
    }
}
