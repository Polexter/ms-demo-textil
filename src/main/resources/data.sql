insert into TB_BRAND (NU_ID, TX_DESCRIPTION) values (1, 'ZARA');
insert into TB_BRAND (NU_ID, TX_DESCRIPTION) values (2, 'H&M');
insert into TB_BRAND (NU_ID, TX_DESCRIPTION) values (3, 'Forever 21');
insert into TB_BRAND (NU_ID, TX_DESCRIPTION) values (4, 'Mango');
insert into TB_BRAND (NU_ID, TX_DESCRIPTION) values (5, 'Topshop');
insert into TB_BRAND (NU_ID, TX_DESCRIPTION) values (6, 'ASOS');


INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (1, {ts '2020-06-14 00:00:00'}, {ts '2020-12-31 23:59:59'}, 1, 35455, 0, 35.50, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (1, {ts '2020-06-14 15:00:00'}, {ts '2020-06-14 18:30:00'}, 2, 35455, 1, 25.45, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (1, {ts '2020-06-15 00:00:00'}, {ts '2020-06-15 11:00:00'}, 3, 35455, 1, 30.50, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (1, {ts '2020-06-15 16:00:00'}, {ts '2020-12-31 23:59:59'}, 4, 35455, 1, 38.95, 'EUR');


INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (2, {ts '2021-01-01 00:00:00'}, {ts '2021-02-28 23:59:59'}, 6, 35455, 0, 45.80, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (2, {ts '2021-03-01 00:00:00'}, {ts '2021-12-31 23:59:59'}, 5, 35455, 0, 42.25, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (3, {ts '2022-01-01 00:00:00'}, {ts '2022-01-15 23:59:59'}, 2, 35455, 0, 29.90, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (3, {ts '2022-01-16 00:00:00'}, {ts '2022-06-30 23:59:59'}, 1, 35455, 1, 32.50, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (3, {ts '2022-07-01 00:00:00'}, {ts '2022-07-31 23:59:59'}, 2, 35455, 1, 28.75, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (4, {ts '2022-08-01 00:00:00'}, {ts '2022-12-31 23:59:59'}, 3, 35455, 0, 35.60, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (4, {ts '2023-01-01 00:00:00'}, {ts '2023-03-15 23:59:59'}, 2, 35455, 0, 32.90, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (4, {ts '2023-03-16 00:00:00'}, {ts '2023-03-31 23:59:59'}, 1, 35455, 1, 28.45, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (4, {ts '2023-04-01 00:00:00'}, {ts '2023-04-30 23:59:59'}, 2, 35455, 1, 30.75, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (5, {ts '2023-05-01 00:00:00'}, {ts '2023-05-31 23:59:59'}, 3, 35455, 1, 33.20, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (5, {ts '2023-06-01 00:00:00'}, {ts '2023-06-30 23:59:59'}, 4, 35455, 0, 38.10, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (5, {ts '2023-07-01 00:00:00'}, {ts '2023-07-31 23:59:59'}, 3, 35455, 1, 35.80, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (6, {ts '2023-08-01 00:00:00'}, {ts '2023-09-30 23:59:59'}, 2, 35455, 0, 28.90, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (6, {ts '2023-10-01 00:00:00'}, {ts '2023-10-31 23:59:59'}, 1, 35455, 0, 25.60, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (6, {ts '2023-11-01 00:00:00'}, {ts '2023-11-30 23:59:59'}, 2, 35455, 1, 29.75, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (6, {ts '2023-12-01 00:00:00'}, {ts '2023-12-31 23:59:59'}, 1, 35455, 1, 27.80, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (1, {ts '2024-01-01 00:00:00'}, {ts '2024-01-31 23:59:59'}, 5, 35455, 0, 41.20, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (1, {ts '2024-02-01 00:00:00'}, {ts '2024-02-29 23:59:59'}, 4, 35455, 0, 39.90, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (2, {ts '2024-03-01 00:00:00'}, {ts '2024-03-31 23:59:59'}, 6, 35455, 0, 46.75, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (2, {ts '2024-04-01 00:00:00'}, {ts '2024-04-30 23:59:59'}, 5, 35455, 0, 44.80, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (2, {ts '2024-05-01 00:00:00'}, {ts '2024-05-31 23:59:59'}, 6, 35455, 1, 42.90, 'EUR');

INSERT INTO TB_PRICES (NU_BRAND_ID, DT_START_DATE, DT_END_DATE, NU_PRICE_LIST, NU_PRODUCT_ID, NU_PRIORITY, NU_PRICE, TX_CURRENCY)
VALUES (2, {ts '2024-05-01 00:00:00'}, {ts '2024-05-31 23:59:59'}, 6, 35456, 1, 42.90, 'EUR');
    