package duoc.cl.jee010.azar.entity;

import duoc.cl.jee010.azar.entity.Premio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-21T03:03:53")
@StaticMetamodel(TipoPremio.class)
public class TipoPremio_ { 

    public static volatile SingularAttribute<TipoPremio, Integer> estado;
    public static volatile SingularAttribute<TipoPremio, Integer> tipo;
    public static volatile SingularAttribute<TipoPremio, Integer> aciertos;
    public static volatile ListAttribute<TipoPremio, Premio> premioList;
    public static volatile SingularAttribute<TipoPremio, Integer> id;
    public static volatile SingularAttribute<TipoPremio, Integer> cantidad;
    public static volatile SingularAttribute<TipoPremio, Date> fechCreacion;

}