CREATE TABLE `cliente` (
  `id` int NOT NULL,
  `nombres` varchar(100) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `tipo_doc_id` int DEFAULT NULL,
  `num_doc` varchar(45) DEFAULT NULL,
  `fec_nacimiento` date DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `genero_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Cliente_TipoDoc` FOREIGN KEY (`tipo_doc_id`) REFERENCES `tipo_doc` (`id`),
  CONSTRAINT `fk_Cliente_Genero` FOREIGN KEY (`genero_id`) REFERENCES `genero` (`id`)
);


CREATE TABLE `pedido` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cliente_id` int Not NULL,
  `fec_inicio_dedido` date DEFAULT NULL,
  `fec_ultima_modif` date DEFAULT NULL,
  `estado` int DEFAULT NULL,
  `fec_registro` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Pedido_Cliente` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`)
) ;

CREATE TABLE `libro` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) Not NULL,
  `editorial_id` int DEFAULT NULL,
  `edicion` int DEFAULT NULL,
  `imagen` varchar(45) DEFAULT NULL,
  `autor` varchar(50) DEFAULT NULL,
  `precio` decimal DEFAULT NULL,
  `stock` int DEFAULT NULL,
  `categoria_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Libro_Editorial` FOREIGN KEY (`editorial_id`) REFERENCES `editorial` (`id`),
  CONSTRAINT `fk_Libro_Categoria` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`)
) ;

CREATE TABLE `libroPedido` (
  `libro_id` int NOT NULL,
  `pedido_id` int NOT NULL,
  `cantidad` int DEFAULT NULL,
  PRIMARY KEY (`libro_id`,`pedido_id`),
  CONSTRAINT `fk_Libro_id` FOREIGN KEY (`libro_id`) REFERENCES `libro` (`id`),
  CONSTRAINT `fk_Pedido_id` FOREIGN KEY (`pedido_id`) REFERENCES `pedido` (`id`)
) ;


CREATE TABLE `factura` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_pedido` int NOT NULL,
  `iva` date DEFAULT NULL,
  `fec_ingreso` date DEFAULT NULL,
  `fec_registro` date DEFAULT NULL,
   `total` decimal default null,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_factura_pedido` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id`));
   
   
alter table pedido add column fec_inicio_pedido date;
alter table pedido drop column fec_inicio_pedido;

select * from libreriaAmigos.pedido;

SELECT `cliente`.`id`,
    `cliente`.`nombres`,
    `cliente`.`apellidos`,
    `cliente`.`tipo_doc_id`,
    `cliente`.`num_doc`,
    `cliente`.`fec_nacimiento`,
    `cliente`.`telefono`,
    `cliente`.`email`,
    `cliente`.`direccion`,
    `cliente`.`genero_id`
FROM `libreriaAmigos`.`cliente`;

/***SET SQL_SAFE_UPDATES = 0; para hacer update***/