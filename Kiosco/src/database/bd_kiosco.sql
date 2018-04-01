/*drop database bd_kiosco*/
CREATE DATABASE bd_kiosco;

use bd_kiosco;

CREATE TABLE password(
    id INT AUTO_INCREMENT,
    password VARCHAR(8),
    PRIMARY KEY(id)
);
INSERT INTO password VALUES(null, 'admin');
/*select password from password where password = 'admin';
*/
CREATE TABLE producto(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(140),
    precio INT,
    cantidad INT,
    PRIMARY KEY(id)
);

CREATE TABLE boleta(
    id INT AUTO_INCREMENT,
    fecha VARCHAR(50),
    PRIMARY KEY(id)
);
/*select * from boleta
delete from boleta
*/insert into boleta values(null, "");

CREATE TABLE detalle(
    id INT AUTO_INCREMENT,
    producto INT,
    boleta INT,
    cantidad INT,
    precio INT,
    PRIMARY KEY(id),
    FOREIGN KEY(producto) REFERENCES producto(id),
    FOREIGN KEY(boleta) REFERENCES boleta(id)
);

/*SELECT * FROM producto where nombre like '%coy%'
*/
/*select * from producto
select * from detalle
select SUM(150*2) as 'Total precio' from producto where id = 1

insert into producto VALUES(null, 'Sprite 500cc', 700, 100)

UPDATE producto Set cantidad = cantidad + (3) where id = 1;
UPDATE producto Set precio = 600 where id = 2
UPDATE producto SET cantidad = 20 where id = 2;
*/