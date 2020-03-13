package thong.dq.dao;

import org.springframework.stereotype.Repository;
import thong.dq.model.Snippet;

@Repository("snippetDao")
public class SnippetDaoImpl extends AbstractDao<Integer, Snippet> implements SnippetDao {
    @Override
    public Snippet findById(int id) {
        Snippet snippet = getByKey(id);
        return snippet;
    }

    @Override
    public void saveSnippet(Snippet snippet) {
        persist(snippet);
    }

    @Override
    public void updateSnippet(Snippet snippet) {
        update(snippet);
    }

    @Override
    public void deleteSnippet(int id) {

    }
}
