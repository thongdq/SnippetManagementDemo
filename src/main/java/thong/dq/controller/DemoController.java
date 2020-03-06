package thong.dq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import thong.dq.model.Demo;
import thong.dq.service.DemoService;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/get-{id}-demo", method = RequestMethod.GET)
    public ResponseEntity<Demo> getAllDemo(@PathVariable("id") Integer id) {
        Demo demo = demoService.findById(id);
        return new ResponseEntity<Demo>(demo, HttpStatus.OK);
    }

}
