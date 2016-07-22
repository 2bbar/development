package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by blazej.baron on 7/20/16.
 */
@RestController
public class LibraryController {

    @RequestMapping("/")
    private String test(){
        return "test test";
    }
}
