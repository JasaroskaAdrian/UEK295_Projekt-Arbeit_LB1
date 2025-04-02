Projekt-Checkliste
Anwendungsfunktionalität
[ … ] - 0-3 Punkte – Die Applikation funktioniert nicht oder nur teilweise.
[ … ] - 1 Punkt – Nur ein geringer Teil des Funktionsumfangs funktioniert.
[ x ] - 2 Punkte – Der größte Teil der Applikation funktioniert korrekt.
[ … ] - 3 Punkte – Die ganze Applikation funktioniert und es gibt keine Skriptfehler.
Versionsverwaltung
[ … ] - 0 Punkte – Keine korrekte Versionsverwaltung verwendet.
[ … ] - 2 Punkte – Versionsverwaltung nur ansatzweise korrekt angewendet.
[ x ] - 4 Punkte – Versionsverwaltung wurde größtenteils korrekt angewendet; die meisten Tage wurden mit Commits dokumentiert.
[ … ] - 6 Punkte – Tägliche Commits mit sinnvollen und aussagekräftigen Commit-Messages.
Dokumentation
[ … ] - 0 Punkte – Keine brauchbare Dokumentation abgegeben.
[ … ] - 1 Punkt – Dokumentation ist unvollständig oder im falschen Format.
[ x ] - 2 Punkte – Dokumentation ist vollständig und als PDF abgegeben.
Formale Anforderungen
[ … ] - 0 Punkte – Dokument ist unstrukturiert und entspricht nicht den Anforderungen.
[ … ] - 2 Punkte – Nur ein kleiner Teil der Anforderungen wurde erfüllt.
[ … ] - 4 Punkte – Der größte Teil der formalen Anforderungen wurde erfüllt.
[ x ] - 6 Punkte – Alle formalen Anforderungen erfüllt (Inhaltsverzeichnis, angemessene Schriftart/-größe, klare Gliederung, seriöse Sprache, Autor & Datum, Seitenzahlen).
Arbeitsjournal
[ … ] - 0 Punkte – Kein richtiges Arbeitsjournal vorhanden.
[ … ] - 2 Punkte – Arbeitsjournal ist unvollständig oder schlecht geführt.
[ … ] - 4 Punkte – Arbeitsjournal ist größtenteils vollständig und strukturiert.
[ … ] - 6 Punkte – Arbeitsjournal ist vollständig und für alle Arbeitstage detailliert geführt.
Namensschema für Daten
[ … ] - 0 Punkte – Kein Namensschema definiert oder völlig unzureichend.
[ … ] - 2 Punkte – Namensschema definiert nur wenige Regeln korrekt.
[ … ] - 4 Punkte – Namensschema ist größtenteils klar und sinnvoll.
[ x ] - 6 Punkte – Namensschema ist vollständig und definiert klar Groß-/Kleinschreibung sowie Benennungen.
Beschreibung der Endpoints
[ … ] - 0 Punkte – API-Endpoints nicht oder unvollständig dokumentiert.
[ … ] - 2 Punkte – Nur ein Teil der Endpoints ist dokumentiert.
[ … ] - 4 Punkte – Die meisten Endpoints sind ausreichend dokumentiert.
[ … ] - 6 Punkte – Alle Endpoints sind vollständig dokumentiert (Pfad, Parameter, Zweck, HTTP-Methode).
API-Struktur
[ … ] - 0 Punkte – Endpoints sind inkonsistent oder entsprechen nicht den REST-Richtlinien.
[ … ] - 3 Punkte – Endpoints sind nur an wenigen Stellen konsistent.
[ x ] - 6 Punkte – Die meisten Endpoints sind strukturell sinnvoll.
[ … ] - 9 Punkte – REST-Richtlinien werden sauber umgesetzt, alle Ressourcen haben sinnvolle Endpoints und Argumente.
HTTP Response Codes
[ … ] - 0 Punkte – An vielen Stellen falsche Antwortcodes.
[ … ] - 4.5 Punkte – In einigen Situationen falsche Antwortcodes.
[ x ] - 9 Punkte – Korrekte Antwortcodes für alle Fälle (z. B. 404 für nicht vorhandene Ressourcen, *401* für fehlende Authentifizierung).
OpenAPI-Dokumentation
[ … ] - 0 Punkte – Keine OpenAPI-Dokumentation abgegeben.
[ … ] - 4 Punkte – API-Dokumentation ist deutlich unzureichend.
[ x ] - 8 Punkte – API-Dokumentation ist größtenteils ausreichend.
[ ... ] - 12 Punkte – OpenAPI-Dokumentation ist enthalten und umfassend (Beschreibung aller Endpoints, Parameter, Beispielwerte, HTTP-Methoden, Rückgabedaten).
Einhaltung der Code-Style-Richtlinien
[ … ] - 0 Punkte – Code-Style-Richtlinien kaum beachtet.
[ … ] - 2 Punkte – Code-Style nur teilweise eingehalten.
[ … ] - 4 Punkte – Code-Style wurde an den meisten Stellen eingehalten.
[ x ] - 6 Punkte – Code folgt vollständig den Richtlinien.
Code-Kommentare !!!!
[ … ] - 0 Punkte – Code kaum oder gar nicht kommentiert.
[ … ] - 2 Punkte – Kommentare unzureichend.
[ … ] - 4 Punkte – Die meisten nicht selbsterklärenden Code-Stellen sind kommentiert.
[ x ] - 6 Punkte – Alle notwendigen Stellen sind ausführlich kommentiert.
Tabellenstruktur
[ … ] - 0 Punkte – Datenbankstruktur entspricht nicht dem Modell.
[ … ] - 2 Punkte – Nur wenige Teile entsprechen dem Modell.
[ … ] - 4 Punkte – Die meisten Tabellen entsprechen dem Modell.
[ x ] - 6 Punkte – Die Datenbank entspricht durchgehend dem Modell.
Dateistruktur
[ … ] - 0 Punkte – Keine klare Struktur, alle Dateien im selben Ordner.
[ … ] - 2 Punkte – Teilweise sinnvolle Struktur.
[ x ] - 4 Punkte – Einheitliche und logische Dateistruktur, Dateien sind sinnvoll gruppiert.
Sicherheit
[ … ] - 0 Punkte – Große Sicherheitsrisiken vorhanden.
[ x ] - 2 Punkte – Sicherheitsrisiken bestehen, sind aber schwer auszunutzen.
[ … ] - 4 Punkte – Keine erkennbaren Sicherheitsrisiken.
Authentifizierung
[ … ] - 0 Punkte – Endpoints sind nicht oder falsch geschützt.
[ … ] - 3 Punkte – Nur teilweise korrekt geschützte Endpoints.
[ … ] - 6 Punkte – Die meisten Endpoints sind korrekt geschützt.
[ x ] - 9 Punkte – Alle geschützten Endpoints erfordern eine korrekte Authentifizierung.
Datenbank Seed !!!!
[ … ] - 0 Punkte – Kein Seed vorhanden (keine initialen Daten).
[ … ] - 2 Punkte – Flyway installiert, aber SQL-Dateien fehlen.
[ … ] - 4 Punkte – Flyway korrekt installiert, für jede Entität sind mindestens 2 Datensätze vorhanden.
Benutzerverwaltung
[ … ] - 0 Punkte – Anmeldung, Registrierung oder Rollenverwaltung fehlen oder sind fehlerhaft.
[ … ] - 3 Punkte – Anmeldung und Registrierung korrekt implementiert.
[ x ] - 6 Punkte – Anmeldung, Rollenverwaltung und Validierung vollständig umgesetzt.