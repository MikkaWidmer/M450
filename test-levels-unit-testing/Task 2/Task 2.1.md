**Abstrakte Testfälle:**

Hier sind abstrakte Testfälle, die auf logischen Operatoren basieren:

| Testfall | Beschreibung                                             |
|----------|----------------------------------------------------------|
| 1        | Grenzfall: Kaufpreis = 15,000 CHF (5% Rabatt erwartet)   |
| 2        | Grenzfall: Kaufpreis = 20,000 CHF (7% Rabatt erwartet)   |
| 3        | Grenzfall: Kaufpreis = 25,000 CHF (8.5% Rabatt erwartet) |
| 4        | Kaufpreis < 15,000 CHF (0% Rabatt erwartet)              |
| 5        | Kaufpreis > 25,000 CHF (5% Rabatt erwartet)              |
**Konkrete Testfälle:**

Hier sind konkrete Testfälle mit bestimmten Eingabewerten:

| Testfall | Kaufpreis | Erwarteter Rabatt |
|----------|------------|-----------------|
| 1        | 10,000 CHF | 0 CHF           |
| 2        | 18,000 CHF | 900 CHF         |
| 3        | 22,000 CHF | 1540 CHF        |
| 4        | 30,000 CHF | 2550 CHF        |

**Testfälle für eine Autovermietungswebseite:**

Hier sind fünf wichtige funktionale Black-Box-Testfälle für eine Autovermietungsplattform:

1. **Testfall: Suche nach verfügbaren Autos**

    - **Beschreibung:** Der Benutzer gibt seine Suchkriterien ein und sucht nach verfügbaren Autos.
    - **Erwartetes Resultat:** Die Webseite zeigt eine Liste verfügbarer Autos entsprechend den Suchkriterien.
    - **Effektives Resultat:** Die Suche funktioniert nicht korrekt, es werden keine oder falsche Ergebnisse angezeigt.
    - **Status:** Fehler
    - **Mögliche Ursache:** Probleme mit der Datenbankabfrage oder dem Suchalgorithmus.

2. **Testfall: Buchung eines Autos**

    - **Beschreibung:** Der Benutzer wählt ein Auto aus und bucht es für einen bestimmten Zeitraum.
    - **Erwartetes Resultat:** Die Buchung wird erfolgreich abgeschlossen, und das Auto wird für den angegebenen Zeitraum reserviert.
    - **Effektives Resultat:** Die Buchung schlägt fehl, und das Auto bleibt verfügbar.
    - **Status:** Fehler
    - **Mögliche Ursache:** Probleme mit der Buchungsfunktionalität oder der Datenbank.

3. **Testfall: Benutzeranmeldung und -registrierung**

    - **Beschreibung:** Der Benutzer meldet sich an oder registriert sich auf der Plattform.
    - **Erwartetes Resultat:** Der Benutzer kann sich erfolgreich anmelden oder registrieren und hat Zugriff auf personalisierte Funktionen.
    - **Effektives Resultat:** Anmelde- oder Registrierungsprozess schlägt fehl.
    - **Status:** Fehler
    - **Mögliche Ursache:** Probleme mit der Benutzerverwaltung oder Authentifizierung.

4. **Testfall: Online-Zahlung für die Buchung**

    - **Beschreibung:** Der Benutzer bezahlt online für die gebuchte Autovermietung.
    - **Erwartetes Resultat:** Die Zahlung wird erfolgreich verarbeitet, und die Buchung wird bestätigt.
    - **Effektives Resultat:** Die Zahlung schlägt fehl, oder die Buchung wird nicht bestätigt.
    - **Status:** Fehler
    - **Mögliche Ursache:** Probleme mit dem Zahlungs-Gateway oder der Buchungsverwaltung.

5. **Testfall: Stornierung einer Buchung**

    - **Beschreibung:** Der Benutzer storniert eine zuvor getätigte Buchung.
    - **Erwartetes Resultat:** Die Buchung wird erfolgreich storniert, und das reservierte Auto wird wieder verfügbar.
    - **Effektives Resultat:** Die Stornierung schlägt fehl, oder das Auto bleibt als reserviert markiert.
    - **Status:** Fehler
    - **Mögliche Ursache:** Probleme mit der Stornierungsfunktionalität oder der Buchungsverwaltung.

**Tabelle in Markdown für das Repository:**


| ID | Beschreibung | Erwartetes Resultat | Effektives Resultat | Status | Mögliche Ursache |
|----|--------------|----------------------|----------------------|--------|-------------------|
| 1  | Suche nach verfügbaren Autos | Liste verfügbarer Autos wird angezeigt | Suche funktioniert nicht korrekt | Fehler | Probleme mit Datenbankabfrage oder Suchalgorithmus |
| 2  | Buchung eines Autos | Buchung wird erfolgreich abgeschlossen | Buchung schlägt fehl | Fehler | Probleme mit Buchungsfunktionalität oder Datenbank |
| 3  | Benutzeranmeldung und -registrierung | Erfolgreiche Anmeldung/Registrierung | Anmelde- oder Registrierungsprozess schlägt fehl | Fehler | Probleme mit Benutzerverwaltung oder Authentifizierung |
| 4  | Online-Zahlung für die Buchung | Zahlung wird erfolgreich verarbeitet | Zahlung schlägt fehl oder Buchung wird nicht bestätigt | Fehler | Probleme mit Zahlungs-Gateway oder Buchungsverwaltung |
| 5  | Stornierung einer Buchung | Buchung wird erfolgreich storniert | Stornierung schlägt fehl oder Auto bleibt als reserviert markiert | Fehler | Probleme mit Stornierungsfunktionalität oder Buchungsverwaltung |


Übung 3
 
### black-box
| ID | Description | Expected | Actual | Result |
|----|--------------|----------------------|----------------------|--------|
| 1 | Konto erstellt | wenn man alle konten anzeigt sieht man das neue konto | Man sieht das neu erstellte Konto | PASSED |
| 2 | Wechselkurs zwischen CHF und USD | 1 CHF = 1.134818 USD | 1 CHF = 1.134818 USD | PASSED |
| 3 | eine falsche währung beim erstellen | es wird USD verwendet da es die währung nicht gibt | Die eingegebene W�hrung ist nicht bekannt, es wird USD verwendet | PASSED |

### white-box
- ()printBalance
- ()deposit
- ()deleteAccount
- ()printAccountDetails

### verbesserungen
ui auswahl vergrössern dass man alles machen kann
