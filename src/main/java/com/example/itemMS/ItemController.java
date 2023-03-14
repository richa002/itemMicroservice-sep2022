package com.example.itemMS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ItemService itemService;
    @RequestMapping("/{id}")
    public Item getItem(@PathVariable long id){
logger.info("Item Controller recieved item request");
//        if(id==2||id==3){
//            System.out.println("in item service");
//            throw new RuntimeException("something wrong happened");
//        }
        Item byId = itemService.findById(id);
        return byId;
    }

}
