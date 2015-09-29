package fr.taharbakir;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: tahar
 * Date: 29/09/15
 * Time: 21:51
 * To change this template use File | Settings | File Templates.
 */
public class pocadd {

    public pocadd(){}

    public void add(HashMap<String,Object> map){
        Integer i = (Integer)map.get("i");
        Integer j = (Integer)map.get("j");

        map.put("res",i+j);
    }
}
