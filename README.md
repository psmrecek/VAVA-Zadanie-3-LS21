# VAVA-Zadanie-3 Informačný systém pre hotel (Booking v2)

## Popis zadania

Vytvorte GUI aplikáciu – informačný systém pre hotel. Aplikácia bude umožňovať:

1. Nastavenie a zobrazenie aktuálneho času (aby sme mohli simulovať používanie počas
    viacerých dní)
2. Načítať zapísať všetky údaje z/do súboru
3. Vytvorenie zákazníka
4. Vytvorenie rezervácie pre zákazníka (dátumy od - do, izba, výpočet ceny)
5. Zrušenie rezervácie
6. Ubytovanie zákazníka na základe rezervácie alebo bez rezervácie (izba, od - do, výpočet
    ceny)
7. Zaznamenať platbu zákazníka (dátum, ubytovanie s ktorým súvisí, či bola v hotovosti
    alebo bezhotovostná)
8. Zobraziť ukončené ubytovania, ktoré neboli zaplatené
9. Zobraziť históriu ubytovaní zákazníka (od – do, izba, platba, využité služby)
10. Zobraziť históriu ubytovaní pre izbu

Pri vytvorení rezervácie, alebo pri ubytovaní systém automaticky vypočíta cenu za ubytovanie.
Hotel bude poskytovať aj zľavy na ubytovanie. Systém bude pri vytváraní rezervácie, alebo pri
ubytovaní automaticky vypočítavať zľavu. Spôsob tvorby zľavy určite sami (napr. pri pobytoch
nad X dní (môžu sa rátať aj predchádzajúce) bude zľava Y %).

Hotel bude počas pobytu poskytovať rôzne služby (napr. strava, masáže, športové aktivity). Za
tieto služby môže zákazník zaplatiť napr. na konci ubytovania, spolu za ubytovanie. Systém
bude umožňovať:

- Vytváranie nových typov služieb (služba je definovaná popisom a cenou)
- Zaevidovanie využitia služby počas pobytu, za ktorú zákazník zaplatí spolu s platbou za
    ubytovanie (dátum využitia služby)

Izby budú rôznych kategórii. Každá kategória bude charakterizovaná popisom a cenou. Každá
izba bude mať označenie (číslo alebo reťazec). Ku každej izbe možno uviesť poznámku
a doplniť obrázky izby. Izba bude mať galériu obrázkov.

Informačný systém bude tiež umožňovať:

A. Pridať kategóriu izieb
B. Pridať izbu
C. Editovať informácie o izbe (poznámku)

Aplikácia bude GUI, musí byť funkčná a ošetrená voči chybným vstupom. Nesmú prekrývať
viaceré ubytovania, alebo rezervácie pre izbu. Dátové zložky musia byť zapúzdrenie (všetky
private). Využite objektovo orientované princípy a techniky bez zbytočných duplicít kódu
(DRY). Vhodne aplikujte Logovanie na výnimky a Internacionalizáciu/lokalizáciu (SK/EN US
United States stačí pre základnú domovskú obrazovku).

Pre prácu s dátumom použite triedu java.util.Date. Pre konverziu medzi typmi Date a String
môžete použiť triedy java.text.DateFormat a java.text.SimpleDateFormat. **Nepoužívajte
metódy označené ako deprecated.**

V prípade, že použijete súbory a zdrojové kódy z internetu je povinné uvádzať všetky použité
zdroje. Študent musí rozumieť každému riadku daného kódu a orientovať sa v ňom.

Ak nie je v zadaní niečo explicitne určené, môžete si zadanie doplniť a vymyslieť.

Myslite na príjemné používateľské rozhranie na jednej strane a na druhej na dobrý návrh
a štruktúru.

Inšpirujte sa https://www.booking.com, https://assecosolutions.sk/produkty/asseco-horec ,
https://www.protel.net/ (https://gastrosoft.sk/riesenia-pre-hotel/)

Používateľské rozhranie aplikácie musí byť prehľadné (zobrazovanie informácii a ovládanie
programu). Všetky časti projektu (zdrojové kódy + JAR spustiteľné súbory aplikácie) sa
odovzdávajú do systému AIS.

## Riešenie
Projekt bol vypracovaný vo verzií JAVA 1.8_281 + Maven. GUI bolo vytvorené v Java Swing.
