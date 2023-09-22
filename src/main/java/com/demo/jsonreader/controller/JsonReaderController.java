package com.demo.jsonreader.controller;

import com.demo.jsonreader.component.DataInitializer;
import com.demo.jsonreader.model.Roots;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "v1/jsonreader",  produces = "application/json")
public class JsonReaderController {


    @Autowired
    DataInitializer dataInitializer;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Roots> getAllRoots() {
        Roots roots = new Roots(dataInitializer.getRoots());
        return ResponseEntity.ok(roots);
    }
}
