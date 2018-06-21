package duoc.cl.jee010.azar.entity;

import duoc.cl.jee010.azar.entity.PerfilMenu;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-21T03:03:53")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, String> nombreMenu;
    public static volatile SingularAttribute<Menu, Integer> estado;
    public static volatile ListAttribute<Menu, PerfilMenu> perfilMenuList;
    public static volatile SingularAttribute<Menu, Integer> padreMenu;
    public static volatile SingularAttribute<Menu, Integer> id;
    public static volatile SingularAttribute<Menu, Date> fechCreacion;
    public static volatile SingularAttribute<Menu, String> destinoMenu;

}