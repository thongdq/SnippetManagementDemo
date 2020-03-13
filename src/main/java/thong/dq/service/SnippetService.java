package thong.dq.service;

import thong.dq.model.Snippet;

public interface SnippetService {

    Snippet findById(int id);

    void saveSnippet(Snippet snippet);

    void updateSnippet(Snippet snippet);

    void deleteSnippet(int id);

}
