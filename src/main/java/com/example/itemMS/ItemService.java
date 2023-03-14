package com.example.itemMS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    private static  Map<Long, Item> map = new HashMap<>() ;
  static {
        map.put(1l,new Item(1l,"catagory1","item1",100));
        map.put(2l,new Item(2l,"catagory2","item2",200));
        map.put(3l,new Item(3l,"catagory3","item3",300));

    }

    public Item findById(long id){

      logger.info("Item service, finding item by id");
        Item item = map.get(id);
        if(item==null) throw new RuntimeException("Not found");
        return item;
    }

}
