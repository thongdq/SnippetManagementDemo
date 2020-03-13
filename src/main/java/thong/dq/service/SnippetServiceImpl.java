package thong.dq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import thong.dq.dao.SnippetDao;
import thong.dq.model.Snippet;

@Service("snippetService")
@Transactional
public class SnippetServiceImpl implements SnippetService {

    @Autowired
    SnippetDao snippetDao;

    @Override
    public Snippet findById(int id) {
        return snippetDao.findById(id);
    }

    @Override
    public void saveSnippet(Snippet snippet) {
        snippetDao.saveSnippet(snippet);
    }

    @Override
    public void updateSnippet(Snippet snippet) {
        snippetDao.updateSnippet(snippet);
    }

    @Override
    public void deleteSnippet(int id) {

    }
}
