package com.libros.gestion.repository;

import com.libros.gestion.model.Pedido;
import com.libros.gestion.model.reportes.ReportePedidoPendient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

    /***
     *Obtengo los pedidos segun estado, los libros cantidades y monto total
     */
    @Query(value= "select l.descripcion as nombre, lp.cantidad as cantidad, (l.precio * lp.cantidad) as total from pedido as pd , libroPedido as lp, libro as l\n" +
            "where pd.id= lp.pedido_id and lp.libro_id= l.id and pd.estado=:pedido_estado",nativeQuery = true)
    Iterable<ReportePedidoPendient> getPedidoLibro(@Param("pedido_estado") char pedido_estado);

}
