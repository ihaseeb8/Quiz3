import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

        public static void main(String[] args){

            Configuration con = new Configuration();
            con.configure().addAnnotatedClass(Person.class);
            SessionFactory sf= con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction trans = session.beginTransaction();

            Person p = new Person();
            p.name = "haseeb";
            p.personId = 123;

            session.save(p);
            trans.commit();

        }


}
