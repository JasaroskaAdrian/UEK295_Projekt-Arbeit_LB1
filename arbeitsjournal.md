# Arbeitsjournal

## 23.03.2025

| Nr. | Tätigkeit | Beteiligte Personen | Soll (Std.) | Ist (Std.) |
|-----|-----------|---------------------|-------------|------------|
| 1 | Initiales Projekt-Setup | AJ | 1 | 1.5 |
| 2 | Boilerplate als Vorlage eingerichtet | AJ | 0.5 | 0.5 |
| 3 | Projektstruktur geplant | AJ | 1 | 1 |
| | **Totale Soll/IST** | | **2.5** | **3** |

**Beschreibung des Tagesablaufes**

Heute habe ich mit dem Projekt begonnen. Nach dem Input von Herrn Iannattone über das neue Projekt, habe ich mich zunächst eingearbeitet und die grundlegende Struktur geplant. Als Basis habe ich eine Boilerplate-Vorlage verwendet und in das Repository integriert. Dies half mir, schnell eine Grundstruktur zu haben, auf der ich aufbauen konnte. Die Zeit habe ich hauptsächlich mit der Einrichtung der Entwicklungsumgebung und der Planung der Projektarchitektur verbracht. Ich habe etwas mehr Zeit als geplant benötigt, da ich mich erst mit dem Thema vertraut machen musste.

## 25.03.2025

| Nr. | Tätigkeit | Beteiligte Personen | Soll (Std.) | Ist (Std.) |
|-----|-----------|---------------------|-------------|------------|
| 1 | Docker-Compose eingerichtet | AJ | 1.5 | 2 |
| 2 | MariaDB-Verbindung hergestellt | AJ | 1 | 1.5 |
| 3 | Controller erstellt | AJ | 2 | 2.5 |
| | **Totale Soll/IST** | | **4.5** | **6** |

**Beschreibung des Tagesablaufes**

Heute habe ich mich auf die Infrastruktur und die Controller-Schicht konzentriert. Zuerst habe ich Docker-Compose für das Projekt konfiguriert, um eine konsistente Entwicklungsumgebung zu schaffen. Das hat etwas länger gedauert als erwartet, da ich einige Probleme mit den Ports lösen musste. Anschließend habe ich die Verbindung zur MariaDB-Datenbank eingerichtet und getestet.

Der Großteil des Tages wurde dann mit der Erstellung der Controller verbracht. Ich habe die grundlegende Struktur für die REST-Endpoints implementiert und dabei versucht, einer klaren API-Design-Strategie zu folgen. Die Controller-Implementierung war aufwändiger als geplant, da ich zusätzliche Validierungen einbauen wollte. Insgesamt bin ich mit dem Fortschritt zufrieden, obwohl ich mehr Zeit als geplant benötigt habe.

## 26.03.2025

| Nr. | Tätigkeit | Beteiligte Personen | Soll (Std.) | Ist (Std.) |
|-----|-----------|---------------------|-------------|------------|
| 1 | Komplettes Projekt hinzugefügt | AJ | 3 | 4 |
| 2 | Code-Überprüfung | AJ | 1 | 1.5 |
| 3 | Adminer hinzugefügt | AJ | 0.5 | 0.5 |
| | **Totale Soll/IST** | | **4.5** | **6** |

**Beschreibung des Tagesablaufes**

Heute habe ich das komplette Projekt in das Repository integriert. Ich habe die fehlenden Komponenten wie Services, Repositories und Entitäten implementiert und mit den vorhandenen Controllern verbunden. Diese Arbeit war umfangreicher als erwartet, da ich während der Implementierung einige Designentscheidungen überdenken musste.

Nach der Implementierung habe ich eine Code-Überprüfung durchgeführt, um sicherzustellen, dass alles funktioniert und den Best Practices entspricht. Ich habe einige Verbesserungen vorgenommen, besonders im Bereich der Exception-Handling und Validierung.

Zum Schluss habe ich Adminer als Datenbank-Management-Tool zu Docker hinzugefügt, um die Datenbankadministration zu erleichtern. Ich habe festgestellt, dass es noch einige temporäre Probleme mit der Benutzbarkeit gibt, die ich in den kommenden Tagen lösen muss. Trotz der Herausforderungen bin ich mit dem Fortschritt zufrieden.

## 02.04.2025

| Nr. | Tätigkeit | Beteiligte Personen | Soll (Std.) | Ist (Std.) |
|-----|-----------|---------------------|-------------|------------|
| 1 | Datenbank-Tabellenerstellung korrigiert | AJ | 1.5 | 2 |
| 2 | Authentifizierung angepasst | AJ | 2 | 2.5 |
| 3 | Checkliste hinzugefügt | AJ | 0.5 | 0.5 |
| 4 | Code mit Thunder Client getestet | AJ | 1 | 1.5 |
| 5 | Swagger UI und Endpoint-Schutz angepasst | AJ | 1 | 1 |
| | **Totale Soll/IST** | | **6** | **7.5** |

**Beschreibung des Tagesablaufes**

Heute habe ich mehrere wichtige Aspekte des Projekts verbessert. Zunächst habe ich Probleme mit der Datenbank-Tabellenerstellung behoben, die zuvor Fehler verursacht hatten. Die Korrekturen waren etwas zeitaufwändiger als geplant, da ich einige Beziehungen zwischen den Entitäten neu definieren musste.

Anschließend habe ich die Authentifizierung angepasst und dabei festgestellt, dass es Probleme mit 403 Forbidden-Fehlern bei der Registrierung über Thunder Client gab. Diese konnte ich nach einiger Fehleranalyse beheben.

Um den Projektfortschritt besser zu verfolgen, habe ich eine Checkliste erstellt, die die verbleibenden Aufgaben und den aktuellen Status dokumentiert. Das hilft mir, den Überblick zu behalten und Prioritäten zu setzen.

Nach der Implementierung habe ich umfangreiche Tests mit Thunder Client durchgeführt und dabei ein Problem mit der Platzierung des Bearer-Tokens gefunden und behoben. Schließlich habe ich den Schutz für die Swagger UI, Login- und Registrierungs-Endpoints entfernt, da diese logischerweise ohne Token zugänglich sein müssen - schließlich benötigen Benutzer Zugang zu diesen Funktionen, bevor sie ein Token haben.

Obwohl ich mehr Zeit als geplant benötigt habe, konnte ich mehrere kritische Probleme lösen und das Projekt ist nun in einem deutlich stabileren Zustand.

