/* Tabla product */
INSERT INTO product (id, name) VALUES(35455, 'PRODUCTO 1');
INSERT INTO product (id, name) VALUES(35456, 'PRODUCTO 2');

/* Tabla brand */
INSERT INTO brand (id, name) VALUES(1, 'ZARA');
INSERT INTO brand (id, name) VALUES(2, 'BRAND 2');
 
/* Tabla prices*/
INSERT INTO prices (id, brand_id,start_date,end_date,price_list,product_id,priority,price,curr) VALUES(1, 1,TIMESTAMP '2020-06-14 00:00:00', TIMESTAMP '2020-12-31 23:59:59',1,35455,0,35.50,'EUR');
INSERT INTO prices (id, brand_id,start_date,end_date,price_list,product_id,priority,price,curr) VALUES(2, 1,TIMESTAMP '2020-06-14 15:00:00', TIMESTAMP '2020-06-14 18:30:00',2,35455,1,25.45,'EUR');
INSERT INTO prices (id, brand_id,start_date,end_date,price_list,product_id,priority,price,curr) VALUES(3, 1,TIMESTAMP '2020-06-15 00:00:00', TIMESTAMP '2020-06-15 11:00:00',3,35455,1,30.50,'EUR');
INSERT INTO prices (id, brand_id,start_date,end_date,price_list,product_id,priority,price,curr) VALUES(4, 1,TIMESTAMP '2020-06-15 16:00:00', TIMESTAMP '2020-12-31 23:59:59',4,35455,1,38.95,'EUR');