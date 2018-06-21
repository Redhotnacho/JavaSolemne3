package duoc.cl.jee010.azar.entity;

import duoc.cl.jee010.azar.entity.Carton;
import duoc.cl.jee010.azar.entity.Premio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-21T03:03:53")
@StaticMetamodel(Sorteo.class)
public class Sorteo_ { 

    public static volatile SingularAttribute<Sorteo, Integer> estado;
    public static volatile ListAttribute<Sorteo, Carton> cartonList;
    public static volatile ListAttribute<Sorteo, Premio> premioList;
    public static volatile SingularAttribute<Sorteo, Integer> id;
    public static volatile SingularAttribute<Sorteo, String> combinacionGanadora;
    public static volatile SingularAttribute<Sorteo, Date> fechCreacion;
    public static volatile SingularAttribute<Sorteo, Date> fechaSorteo;

}