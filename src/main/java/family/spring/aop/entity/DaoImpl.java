package family.spring.aop.entity;

/**
 * Created by yangboyu on 2018/2/28.
 */
public class DaoImpl implements Dao {

    @Override
    public void select() {
        System.out.println("Enter DaoImpl.select()");
    }

    @Override
    public void insert() {
        System.out.println("Enter DaoImpl.insert()");
    }

}