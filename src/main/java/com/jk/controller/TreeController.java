package com.jk.controller;

import com.jk.pojo.Tree;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@EnableAutoConfiguration
public class TreeController {
    @Autowired
    private TreeService treeService;

    @RequestMapping("tree")
    @ResponseBody
    public Object tree(){

        List<Tree> list = treeService.tree("0");
        return list;
    }


}