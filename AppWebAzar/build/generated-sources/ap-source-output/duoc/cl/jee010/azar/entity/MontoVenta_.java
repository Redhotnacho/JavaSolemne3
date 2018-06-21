package duoc.cl.jee010.azar.entity;

import duoc.cl.jee010.azar.entity.MontoCarton;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-21T03:03:53")
@StaticMetamodel(MontoVenta.class)
public class MontoVenta_ { 

    public static volatile SingularAttribute<MontoVenta, Integer> estado;
    public static volatile ListAttribute<MontoVenta, MontoCarton> montoCartonList;
    public static volatile SingularAttribute<MontoVenta, Date> fechaInicio;
    public static volatile SingularAttribute<MontoVenta, String> periodo;
    public static volatile SingularAttribute<MontoVenta, Integer> montoAcumulado;
    public static volatile SingularAttribute<MontoVenta, Integer> id;
    public static volatile SingularAttribute<MontoVenta, Integer> tipoPremio;
    public static volatile SingularAttribute<MontoVenta, Date> fechCreacion;

}