package duoc.cl.jee010.azar.entity;

import duoc.cl.jee010.azar.entity.Carton;
import duoc.cl.jee010.azar.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-21T03:03:53")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> estado;
    public static volatile ListAttribute<Venta, Carton> cartonList;
    public static volatile SingularAttribute<Venta, Integer> totalVenta;
    public static volatile SingularAttribute<Venta, Usuario> idUsuario;
    public static volatile SingularAttribute<Venta, Integer> id;
    public static volatile SingularAttribute<Venta, Date> fechCreacion;
    public static volatile SingularAttribute<Venta, Date> fechaVenta;

}