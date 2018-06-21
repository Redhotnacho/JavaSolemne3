package duoc.cl.jee010.azar.entity;

import duoc.cl.jee010.azar.entity.Carton;
import duoc.cl.jee010.azar.entity.Pozo;
import duoc.cl.jee010.azar.entity.Sorteo;
import duoc.cl.jee010.azar.entity.TipoPremio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-21T03:03:53")
@StaticMetamodel(Premio.class)
public class Premio_ { 

    public static volatile SingularAttribute<Premio, Integer> estado;
    public static volatile SingularAttribute<Premio, Integer> monto;
    public static volatile ListAttribute<Premio, Carton> cartonList;
    public static volatile SingularAttribute<Premio, TipoPremio> idTipopremio;
    public static volatile SingularAttribute<Premio, Integer> id;
    public static volatile SingularAttribute<Premio, Pozo> idPozo;
    public static volatile SingularAttribute<Premio, Sorteo> idSorteo;
    public static volatile SingularAttribute<Premio, Date> fechCreacion;

}