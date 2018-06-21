package duoc.cl.jee010.azar.entity;

import duoc.cl.jee010.azar.entity.PerfilMenu;
import duoc.cl.jee010.azar.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-21T03:03:53")
@StaticMetamodel(Perfil.class)
public class Perfil_ { 

    public static volatile SingularAttribute<Perfil, Integer> estado;
    public static volatile ListAttribute<Perfil, Usuario> usuarioList;
    public static volatile ListAttribute<Perfil, PerfilMenu> perfilMenuList;
    public static volatile SingularAttribute<Perfil, Integer> id;
    public static volatile SingularAttribute<Perfil, String> nombre;
    public static volatile SingularAttribute<Perfil, Date> fechCreacion;

}