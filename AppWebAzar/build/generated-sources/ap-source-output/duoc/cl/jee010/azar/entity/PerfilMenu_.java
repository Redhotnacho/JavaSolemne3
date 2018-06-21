package duoc.cl.jee010.azar.entity;

import duoc.cl.jee010.azar.entity.Menu;
import duoc.cl.jee010.azar.entity.Perfil;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-21T03:03:53")
@StaticMetamodel(PerfilMenu.class)
public class PerfilMenu_ { 

    public static volatile SingularAttribute<PerfilMenu, Integer> estado;
    public static volatile SingularAttribute<PerfilMenu, Perfil> idPerfil;
    public static volatile SingularAttribute<PerfilMenu, Menu> idMenu;
    public static volatile SingularAttribute<PerfilMenu, Integer> id;
    public static volatile SingularAttribute<PerfilMenu, Date> fechCreacion;

}