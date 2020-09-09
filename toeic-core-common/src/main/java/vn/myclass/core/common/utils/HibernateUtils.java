package vn.myclass.core.common.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static final SessionFactory sessionFactory = buildSessionFactory();  //final cố định 1 biến
    private static SessionFactory buildSessionFactory() {
        try {
            //create sesionfactory from hibernate.cfg.xml
            return  new Configuration().configure().buildSessionFactory();
        }catch (Throwable e) {
            System.out.println("Initial session factory fail"+e);   //xem lỗi nằm ở chỗ nào
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory getSessionFactory() {   //lớp khác sử dụng sẽ trỏ vô và get ra
        return sessionFactory;
    }
}
