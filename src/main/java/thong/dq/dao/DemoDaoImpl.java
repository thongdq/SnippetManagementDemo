package thong.dq.dao;

import org.springframework.stereotype.Repository;
import thong.dq.model.Demo;

@Repository("demoDao")
public class DemoDaoImpl extends AbstractDao<Integer, Demo> implements DemoDao {
    @Override
    public Demo findById(int id) {
        Demo demo = getByKey(id);
        return demo;
    }
}
