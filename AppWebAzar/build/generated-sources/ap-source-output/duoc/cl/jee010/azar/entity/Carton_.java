package duoc.cl.jee010.azar.entity;

import duoc.cl.jee010.azar.entity.MontoCarton;
import duoc.cl.jee010.azar.entity.Premio;
import duoc.cl.jee010.azar.entity.Sorteo;
import duoc.cl.jee010.azar.entity.Venta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-21T03:03:54")
@StaticMetamodel(Carton.class)
public class Carton_ { 

    public static volatile SingularAttribute<Carton, Integer> estado;
    public static volatile SingularAttribute<Carton, Integer> precio;
    public static volatile SingularAttribute<Carton, String> nroSerie;
    public static volatile ListAttribute<Carton, MontoCarton> montoCartonList;
    public static volatile SingularAttribute<Carton, String> combinacion;
    public static volatile SingularAttribute<Carton, Integer> id;
    public static volatile SingularAttribute<Carton, Sorteo> idSorteo;
    public static volatile SingularAttribute<Carton, Date> fechCreacion;
    public static volatile SingularAttribute<Carton, Premio> idPremio;
    public static volatile SingularAttribute<Carton, Venta> idVenta;

}