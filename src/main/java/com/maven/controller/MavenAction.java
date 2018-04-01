package com.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MavenAction {
    @RequestMapping(value="/hello")
    @ResponseBody
    public Map test(String username,String password){
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", username);
        map.put("key2", password);
        return map;
    }
}
