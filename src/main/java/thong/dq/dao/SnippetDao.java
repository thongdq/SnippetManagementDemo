package thong.dq.dao;

import thong.dq.model.Snippet;

import java.util.List;

public interface SnippetDao {

    Snippet findById(int id);

    void saveSnippet(Snippet snippet);

    void updateSnippet(Snippet snippet);

    void deleteSnippet(int id);

}
