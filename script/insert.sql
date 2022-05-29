
INSERT INTO `libreriaAmigos`.`pedido`(cliente_id,fec_ultima_modif,fec_registro,estado,fec_inicio_pedido)VALUES(3,'2022-05-20','2022-05-27','E','2022-05-19');
INSERT INTO `libreriaAmigos`.`pedido`(cliente_id,fec_ultima_modif,fec_registro,estado,fec_inicio_pedido)VALUES(2,'2022-05-22','2022-05-26','P','2022-05-17');
INSERT INTO `libreriaAmigos`.`pedido`(cliente_id,fec_ultima_modif,fec_registro,estado,fec_inicio_pedido)VALUES(15,'2022-05-27','2022-05-27','E','2022-05-27');
INSERT INTO `libreriaAmigos`.`pedido`(cliente_id,fec_ultima_modif,fec_registro,estado,fec_inicio_pedido)VALUES(17,'2022-05-27','2022-05-26','E','2022-05-19');
INSERT INTO `libreriaAmigos`.`pedido`(cliente_id,fec_ultima_modif,fec_registro,estado,fec_inicio_pedido)VALUES(14,'2022-05-20','2022-05-27','E','2022-05-19');


INSERT INTO `libreriaAmigos`.`autor`(`nombre`)VALUES
('Isabel ALLENDE'),
('Flor M. Salvador'),
('Sosa Villada Camila'),
('Jenkins Reid Taylor'),
('Enriquez Mariana'),
('Kellen Alice'),
('Exilart Gabriela');



INSERT INTO `libreriaAmigos`.`editorial`(`nombre`)VALUES
('Tusquets');




/**************************Insert Libro Pedido*********************/
alter table factura drop column fec_registro;


INSERT INTO `libreriaAmigos`.`factura`(id,id_pedido,iva,fec_ingreso,total)
VALUES(1,21,'2022-05-19',null);

/*************************insert Factura ************************/


/******************reporte***********************************/

select * from pedido as pd where pd.estado='P';

select * from pedido as pd , libroPedido as lp, libro as l
where pd.id= lp.pedido_id and lp.libro_id= l.id 



/**el mes con más ventas**/


