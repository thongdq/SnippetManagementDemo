package thong.dq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import thong.dq.model.Snippet;
import thong.dq.service.SnippetService;

@Controller
@RequestMapping("/snippet")
@CrossOrigin(origins = "http://localhost:4200")
public class SnippetController {

    @Autowired
    SnippetService snippetService;

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<Snippet> updateSnippet(@RequestBody Snippet snippet) {
        Snippet currentSnippet = snippetService.findById(snippet.getId());
        if(currentSnippet == null) {
            return new ResponseEntity<Snippet>(HttpStatus.NOT_FOUND);
        }

        currentSnippet.setDescription(snippet.getDescription());
        currentSnippet.setDetail(snippet.getDetail());
        currentSnippet.setLanguage(snippet.getLanguage());

        snippetService.updateSnippet(currentSnippet);

        return new ResponseEntity<Snippet>(currentSnippet, HttpStatus.OK);
    }

}
