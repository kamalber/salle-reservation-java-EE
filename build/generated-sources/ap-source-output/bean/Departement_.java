package bean;

import bean.Formation;
import bean.Prof;
import bean.Secretaire;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-29T16:24:54")
@StaticMetamodel(Departement.class)
public class Departement_ { 

    public static volatile ListAttribute<Departement, Formation> formations;
    public static volatile ListAttribute<Departement, Prof> profs;
    public static volatile SingularAttribute<Departement, Secretaire> secretaire;
    public static volatile SingularAttribute<Departement, Integer> id;
    public static volatile SingularAttribute<Departement, String> nom;

}