### Aufgabe 2 - JUnit Zusammenfassung

#### JUnit Features:

1. **Annotations:**
- `@Test`: Markiert eine Testmethode.
- `@BeforeAll`, `@AfterAll`: Methoden, die vor bzw. nach allen Tests in der Klasse ausgeführt werden.
- `@BeforeEach`, `@AfterEach`: Methoden, die vor bzw. nach jedem Test ausgeführt werden.

2. **Assertions:**
- `assertEquals(expected, actual)`: Vergleicht erwarteten und tatsächlichen Wert.
- `assertTrue(condition)`, `assertFalse(condition)`: Überprüft, ob eine Bedingung wahr bzw. falsch ist.
- `assertNull(object)`, `assertNotNull(object)`: Überprüft, ob ein Objekt null bzw. nicht null ist.

4. **Exceptions Testen:**
- `@Test(expected = Exception.class)`: Überprüft, ob eine bestimmte Exception erwartet wird.
- `assertThrows(Exception.class, () -> { /* Code, der die Exception auslöst */ })`: Überprüft, ob ein bestimmter Code eine Exception auslöst.

5. **Timeout:**
- `@Test(timeout = 1000)`: Begrenzt die Ausführungszeit eines Tests auf 1000 Millisekunden.

6. **Wiederholte Tests:**
- `@RepeatedTest(n)`: Führt den Test n-mal aus.



#### Anwendungsfälle / Beispiele:

- **Assertions:**

````java
  @Test
  void testAdd() {
      assertEquals(4, calculator.add(2, 2));
      assertTrue(calculator.subtract(5, 3) > 0);
      assertNull(calculator.multiply(0, 5));
  }
```

- **Exceptions Testen:**
```java
  @Test
  void testDivideByZero() {
      assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
  }
```

- **Timeout:**
```java
  @Test(timeout = 1000)
  void testPerformance() {
      // Test, der in weniger als 1000 Millisekunden ausgeführt werden muss
      // ...
  }
```

https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations

Aufgabe 4

# Funktionsweise der Software

Die Software ist eine einfache Banking-Anwendung, die es ermöglicht, Konten zu erstellen, Einzahlungen und Abhebungen vorzunehmen sowie Kontoauszüge zu drucken. Hier sind die grundlegenden Funktionalitäten und Zusammenhänge:

## Klassenstruktur
- **Bank:** Verwaltet verschiedene Konten.
- **Account:** Repräsentiert ein Konto mit Kontonummer, Saldo und Buchungen.
- **SavingsAccount:** Erbt von Account, ermöglicht Einzahlungen und Abhebungen.
- **SalaryAccount:** Erbt von Account, hat eine Kreditlimite für Abhebungen.
- **PromoYouthSavingsAccount:** Erbt von SavingsAccount, gewährt einen Bonus auf Einzahlungen.

## Funktionalitäten

### Bank
- `createSavingsAccount()`: Erstellt ein Sparkonto und fügt es der Bank hinzu.
- `createPromoYouthSavingsAccount()`: Erstellt ein Jugend-Sparkonto mit Bonus und fügt es der Bank hinzu.
- `createSalaryAccount(creditLimit)`: Erstellt ein Lohnkonto mit Kreditlimite und fügt es der Bank hinzu.
- `deposit(accountId, date, amount)`: Zahlt einen Betrag auf ein Konto ein.
- `withdraw(accountId, date, amount)`: Heb einen Betrag von einem Konto ab.
- `getBalance(accountId)`: Gibt den Kontostand eines Kontos zurück.
- `printTop5()`: Druckt die Top 5 Konten nach Saldo.
- `printBottom5()`: Druckt die Bottom 5 Konten nach Saldo.

### Account
- `deposit(date, amount)`: Zahlt einen Betrag auf das Konto ein.
- `withdraw(date, amount)`: Hebt einen Betrag vom Konto ab.
- `print()`: Druckt den Kontoauszug.
- `print(year, month)`: Druckt den Monats-Kontoauszug.

### SavingsAccount
- Erbt von Account.
- Erlaubt Einzahlungen und Abhebungen.

### SalaryAccount
- Erbt von Account.
- Hat eine Kreditlimite für Abhebungen.

### PromoYouthSavingsAccount
- Erbt von SavingsAccount.
- Gewährt einen Bonus auf Einzahlungen.

## Zusammenhänge
- **Bank erstellt Konten:** Die Bank kann verschiedene Konten erstellen, darunter Sparkonten, Jugend-Sparkonten und Lohnkonten.
- **Einzahlungen und Abhebungen:** Konten können Einzahlungen und Abhebungen verarbeiten, wobei bestimmte Kontotypen spezielle Regeln haben (z. B. Bonus für Jugend-Sparkonten).
- **Kontoauszug drucken:** Die Bank kann Kontoauszüge für einzelne Konten, Monate oder insgesamt drucken.
- **Top und Bottom Konten:** Die Bank kann die Top und Bottom Konten nach dem aktuellen Saldo drucken.
