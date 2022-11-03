# System aukcyjny

## Wprowadzenie

Specyfikacja wymagań funkcjonalnych w ramach informatyzacji procesu sprzedaży produktów w oparciu o mechanizm aukcyjny. 

## Procesy biznesowe

---
<a id="bc1"></a>
### BC1: Sprzedaż aukcyjna 

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Opis:** Proces biznesowy opisujący sprzedaż za pomocą mechanizmu aukcyjnego. |

**Scenariusz główny:**
1. [Sprzedający](#ac1) wystawia produkt na aukcję. ([UC1](#uc1))
2. [Kupujący](#ac2) oferuje kwotę za produkt wyższą od aktualnie najwyższej oferty. ([BR1](#br1)) ([UC5](#uc5))
3. [Kupujący](#ac2) wygrywa aukcję ([BR2](#br2)) ([UC6](#uc6))
4. [Kupujący](#ac2) przekazuje należność Sprzedającemu. ([UC3](#uc3))
5. [Sprzedający](#ac1) przekazuje produkt Kupującemu. ([UC3](#uc3))

**Scenariusze alternatywne:** 

2.A. Oferta Kupującego została przebita, a [Kupujący](#ac2) pragnie przebić aktualnie najwyższą ofertę.
* 2.A.1. Przejdź do kroku 2.

3.A. Czas aukcji upłynął i [Kupujący](#ac2) przegrał aukcję. ([BR2](#br2))
* 3.A.1. Koniec przypadku użycia.

---

## Aktorzy

<a id="ac1"></a>
### AC1: Sprzedający

Osoba oferująca towar na aukcji.

<a id="ac2"></a>
### AC2: Kupujący

Osoba chcąca zakupić produkt na aukcji.


## Przypadki użycia poziomu użytkownika

### Aktorzy i ich cele

[Sprzedający](#ac1):
* [UC1](#uc1): Wystawienie produktu na aukcję
* [UC2](#uc2): Monitorowanie aukcji
* [UC3](#uc3): Wygenerowanie listu przewozowego z danymi osoby, która wygrała aukcję

[Kupujący](#ac2)
* [UC4](#uc4): Przeglądanie produktów
* [UC5](#uc5): Złożenie oferty na produkt
* [UC6](#uc6): Sprawdzenie statusu aukcji
* [UC7](#uc7): Zapłata za wygraną aukcję

---
<a id="uc1"></a>
### UC1: Wystawienie produktu na aukcję

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:**
1. [Sprzedający](#ac1) zgłasza do systemu chęć wystawienia produktu na aukcję.
2. System prosi o podanie danych produktu i ceny wywoławczej.
3. [Sprzedający](#ac1) podaje dane produktu oraz cenę wywoławczą.
4. System weryfikuje poprawność danych.
5. System informuje o pomyślnym wystawieniu produktu na aukcję.

**Scenariusze alternatywne:** 

4.A. Podano niepoprawne lub niekompletne dane produktu.
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.
---
<a id="uc2"></a>
### UC2: Monitorowanie aukcji

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:**
1. [Sprzedający](#ac1) wybiera aukcje, której status chce sprawdzić.
2. System wyświetla aktuany stan akucji.

---

<a id="uc3"></a>
### UC3: Wygenerowanie listu przewozowego z danymi osoby, która wygrała aukcję

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:**
1. [Sprzedający](#ac1) wybiera zakończoną aukcje.
2. System generuję list przewozowy z danymi osoby, która wygrała aukcje.
3. [Sprzedający](#ac1) drukuje list przewozowy.

**Scenariusze alternatywne:** 

2.A. Nikt nie brał udziału w aukcji
* 2.A.1 System informuje o braku ofert
* 2.A.2 [Sprzedający](#ac1) może jeszcze raz wystawić aukcje

2.B. Aukcja nadal trwa
* 2.B.1 System informuje o niezakończeniu się aukcji

---

<a id="uc4"></a>
### UC4: Przeglądanie produktów

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) zgłasza do systemu chęć obejrzenia aukcji
2. System wyświetla liste aktywnych aukcji


---

<a id="uc5"></a>
### UC5: Złożenie oferty na produkt

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) wybiera produkt na który chce złożyć ofertę
2. System prosi o podanie kwoty jaką kupujący chce zaproponować za dany produkt informując przy tym, że podana kwota musi być o conajmniej 1,00 PLN większa od aktualnie największej.
3. [Kupujący](#ac2) podaje swoją ofertę.
4. System weryfikuje poprawność danych.
5. System informuje o pomyślnym złożeniu oferty.

**Scenariusze alternatywne:** 

4.A. Podano kwotę nie większą o 1,00 PLN od aktualnie największej.
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.

---

<a id="uc4"></a>

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) wybiera produkt na który chce złożyć ofertę
2. System prosi o podanie kwoty jaką kupujący chce zaproponować za dany produkt informując przy tym, że podana kwota musi być o conajmniej 1,00 PLN większa od aktualnie największej.
3. [Kupujący](#ac2) podaje swoją ofertę.
4. System weryfikuje poprawność danych.
5. System informuje o pomyślnym złożeniu oferty.

**Scenariusze alternatywne:** 

4.A. Podano kwotę nie większą o 1,00 PLN od aktualnie największej.
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.

## Obiewkty biznesowe (inaczje obiekty dziedzinowe lub informatycjne)

### BO1: Aukcja

Aukcja jest formą zawierania transakcji kupna-sprzedaży, w której Sprzedający określa cenę wywoławczą produktu, natomiast Kupujący mogą oferować własną ofertę zakupu każdorazowo proponując kwotę wyższą od aktualnie oferowanej kwoty. Aukcja kończy się po upływie określonego czasu. Jeśli złożona została co najmniej jedna oferta zakupy produkt nabywa ten Kupujący, który zaproponował najwyższą kwotę. 

### BO2: Produkt

Fizyczny lub cyfrowy obiekt, który ma zostać sprzedany w ramach aukcji.

## Reguły biznesowe

<a id="br1"></a>
### BR1: Złożenie oferty

Złożenie oferty wymaga zaproponowania kwoty wyższej niż aktualnie oferowana o minimum 1,00 PLN.


<a id="br2"></a>
### BR2: Rozstrzygnięcie aukcji

Aukcję wygrywa ten z [Kupujący](#ac2)ch, który w momencie jej zakończenia (upłynięcia czasu) złożył najwyższą ofertę.

## Macierz CRUDL


| Przypadek użycia                                  | Aukcja | Produkt | ... |
| ------------------------------------------------- | ------ | ------- | --- |
| UC1: Wystawienia produktu na aukcję               |    C   |    C    | ... |
| ???                                               |  ...   |  ...    | ... |


