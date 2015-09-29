package fr.taharbakir;

import java.time.Clock;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        pocadd p = new pocadd();
        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("i",5);
        map.put("j",9);
        p.add(map);
        System.out.println(map.get("res"));
    }
}
