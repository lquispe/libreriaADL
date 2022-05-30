package com.libros.gestion.repository;

import com.libros.gestion.model.Factura;
import com.libros.gestion.model.reportes.VentasMes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lili
 * @Date 30/5/22
 */
public interface FacturaRepository extends CrudRepository<Factura, Integer> {

    @Query(value= "SELECT monthname(f.fec_ingreso)as mes, sum(f.total) as total  from factura as f where year(f.fec_ingreso)>2021  group by mes order by total desc ",nativeQuery = true)
    Iterable<VentasMes> getVentasDesc();
}
