-- Utwórz tabelę ksiazki
CREATE TABLE ksiazki (
                         ID_ksiazki SERIAL PRIMARY KEY,
                         tytul VARCHAR(255) NOT NULL,
                         autor VARCHAR(255) NOT NULL,
                         wydawnictwo VARCHAR(255) NOT NULL,
                         cena NUMERIC(10,2) NOT NULL
);

-- Utwórz tabelę klienci
CREATE TABLE klienci (
                         ID_klienta SERIAL PRIMARY KEY,
                         imie VARCHAR(100) NOT NULL,
                         nazwisko VARCHAR(100) NOT NULL,
                         email VARCHAR(255) NOT NULL,
                         numer_tel VARCHAR(15) NOT NULL,
                         login VARCHAR(50) NOT NULL,
                         haslo VARCHAR(50) NOT NULL
);

-- Utwórz tabelę adres
CREATE TABLE adres (
                       ID_adresu SERIAL PRIMARY KEY,
                       miejscowosc VARCHAR(100) NOT NULL,
                       kod_pocztowy VARCHAR(10) NOT NULL,
                       numer_budynku VARCHAR(10) NOT NULL
);

-- Utwórz tabelę zamowienia
CREATE TABLE zamowienia (
                            ID_zamowienia SERIAL PRIMARY KEY,
                            ID_klienta INTEGER REFERENCES klienci(ID_klienta),
                            data DATE NOT NULL,
                            ID_adresu INTEGER REFERENCES adres(ID_adresu)
);

-- Utwórz tabelę szczegoly_zamowienia
CREATE TABLE szczegoly_zamowienia (
                                      ID_szczegolu SERIAL PRIMARY KEY,
                                      ID_zamowienia INTEGER REFERENCES zamowienia(ID_zamowienia),
                                      ID_ksiazki INTEGER REFERENCES ksiazki(ID_ksiazki)
);



-- Wstaw 10 rekordów do tabeli ksiazki
INSERT INTO ksiazki (tytul, autor, wydawnictwo, cena)
VALUES
    ('Władca Pierścieni', 'J.R.R. Tolkien', 'Allen & Unwin', 39.99),
    ('Harry Potter i Kamień Filozoficzny', 'J.K. Rowling', 'Bloomsbury', 29.99),
    ('Wiedźmin: Ostatnie życzenie', 'Andrzej Sapkowski', 'SuperNowa', 34.99),
    ('1984', 'George Orwell', 'Secker & Warburg', 24.99),
    ('Zbrodnia i kara', 'Fiodor Dostojewski', 'The Russian Messenger', 19.99),
    ('Duma i uprzedzenie', 'Jane Austen', 'Thomas Egerton', 22.99),
    ('Mistrz i Małgorzata', 'Michaił Bułhakow', 'Harvill Secker', 27.99),
    ('Przygody Sherlocka Holmesa', 'Arthur Conan Doyle', 'George Newnes Ltd', 18.99),
    ('Hobbit, czyli tam i z powrotem', 'J.R.R. Tolkien', 'Allen & Unwin', 25.99),
    ('Pan Tadeusz', 'Adam Mickiewicz', 'Drukarnia Jaʹkuba Gierymskiego', 15.99);

-- Wstaw 10 rekordów do tabeli klienci
INSERT INTO klienci (imie, nazwisko, email, numer_tel, login, haslo)
VALUES
    ('Jan', 'Kowalski', 'jan.kowalski@example.com', '123456789', 'jan_kowalski', 'haslo123'),
    ('Anna', 'Nowak', 'anna.nowak@example.com', '987654321', 'anna_nowak', 'qwerty123'),
    ('Piotr', 'Wiśniewski', 'piotr.wisniewski@example.com', '111222333', 'piotr_wisniewski', 'abc123'),
    ('Katarzyna', 'Dąbrowska', 'katarzyna.dabrowska@example.com', '999888777', 'katarzyna_dabrowska', 'test123'),
    ('Michał', 'Lewandowski', 'michal.lewandowski@example.com', '555444333', 'michal_lewandowski', 'password123'),
    ('Agnieszka', 'Wójcik', 'agnieszka.wojcik@example.com', '222333444', 'agnieszka_wojcik', 'pass123'),
    ('Tomasz', 'Kamiński', 'tomasz.kaminski@example.com', '777888999', 'tomasz_kaminski', 'qwerty456'),
    ('Magdalena', 'Kowalczyk', 'magdalena.kowalczyk@example.com', '333222111', 'magdalena_kowalczyk', 'abc456'),
    ('Krzysztof', 'Zieliński', 'krzysztof.zielinski@example.com', '444555666', 'krzysztof_zielinski', 'pass456'),
    ('Natalia', 'Szymańska', 'natalia.szymanska@example.com', '666555444', 'natalia_szymanska', 'test456');

-- Wstaw 10 rekordów do tabeli adres
INSERT INTO adres (miejscowosc, kod_pocztowy, numer_budynku)
VALUES
    ('Warszawa', '00-001', '10'),
    ('Kraków', '30-001', '20'),
    ('Wrocław', '50-001', '30'),
    ('Poznań', '60-001', '40'),
    ('Gdańsk', '80-001', '50'),
    ('Łódź', '90-001', '60'),
    ('Szczecin', '70-001', '70'),
    ('Bydgoszcz', '85-001', '80'),
    ('Katowice', '40-001', '90'),
    ('Gdynia', '81-001', '100');

-- Wstaw 10 rekordów do tabeli zamowienia
INSERT INTO zamowienia (ID_klienta, data, ID_adresu)
VALUES
    (1, '2024-06-01', 1),
    (2, '2024-06-02', 2),
    (3, '2024-06-03', 3),
    (4, '2024-06-04', 4),
    (5, '2024-06-05', 5),
    (6, '2024-06-06', 6),
    (7, '2024-06-07', 7),
    (8, '2024-06-08', 8),
    (9, '2024-06-09', 9),
    (10, '2024-06-10', 10);

-- Wstaw 10 rekordów do tabeli szczegoly_zamowienia
INSERT INTO szczegoly_zamowienia (ID_zamowienia, ID_ksiazki)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5),
    (6, 6),
    (7, 7),
    (8, 8),
    (9, 9),
    (10, 10);