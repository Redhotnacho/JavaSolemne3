package duoc.cl.jee010.azar.entity;

import duoc.cl.jee010.azar.entity.Carton;
import duoc.cl.jee010.azar.entity.MontoVenta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-21T03:03:53")
@StaticMetamodel(MontoCarton.class)
public class MontoCarton_ { 

    public static volatile SingularAttribute<MontoCarton, Carton> idCarton;
    public static volatile SingularAttribute<MontoCarton, Integer> estado;
    public static volatile SingularAttribute<MontoCarton, MontoVenta> idMontoventa;
    public static volatile SingularAttribute<MontoCarton, Integer> id;
    public static volatile SingularAttribute<MontoCarton, Date> fechCreacion;

}