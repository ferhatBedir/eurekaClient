package com.ipara.merchantApplyService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/controller")
public class Controller {

    @GetMapping("/getAll")
    public List<String> getAll(){
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java Script");
        list.add("VueJS");
        return list;
    }


}
