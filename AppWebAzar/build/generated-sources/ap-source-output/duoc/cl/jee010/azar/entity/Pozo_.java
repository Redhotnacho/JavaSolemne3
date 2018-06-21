package duoc.cl.jee010.azar.entity;

import duoc.cl.jee010.azar.entity.Premio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-21T03:03:53")
@StaticMetamodel(Pozo.class)
public class Pozo_ { 

    public static volatile SingularAttribute<Pozo, Integer> estado;
    public static volatile SingularAttribute<Pozo, Integer> monto;
    public static volatile ListAttribute<Pozo, Premio> premioList;
    public static volatile SingularAttribute<Pozo, Integer> id;
    public static volatile SingularAttribute<Pozo, Date> fechCreacion;

}