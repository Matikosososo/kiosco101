/*drop database bd_kiosco*/
CREATE DATABASE bd_kiosco;

use bd_kiosco;

CREATE TABLE password(
    id INT AUTO_INCREMENT,
    password VARCHAR(8),
    PRIMARY KEY(id)
);
INSERT INTO password VALUES(null, 'admin');
select password from password where password = 'admin';

CREATE TABLE producto(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(140),
    precio INT,
    cantidad INT,
    PRIMARY KEY(id)
);

CREATE TABLE boleta(
    id INT AUTO_INCREMENT,
    fecha VARCHAR(30),
    PRIMARY KEY(id)
);

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

SELECT * FROM producto where nombre like '%coy%'

/*select * from producto

select SUM(precio*cantidad) as 'Total precio' from producto

insert into producto VALUES(null, 'Frugelle', 150, 100)

UPDATE producto Set cantidad = cantidad + (-3) where id = 1;
UPDATE producto Set precio = 600 where id = 2
*/