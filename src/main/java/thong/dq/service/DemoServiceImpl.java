package thong.dq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import thong.dq.dao.DemoDao;
import thong.dq.model.Demo;

@Service("demoService")
@Transactional
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public Demo findById(int id) {
        return demoDao.findById(id);
    }
}
