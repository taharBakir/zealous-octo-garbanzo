package fr.taharbakir.test;

import fr.taharbakir.pocadd;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: tahar
 * Date: 29/09/15
 * Time: 22:08
 * To change this template use File | Settings | File Templates.
 */
public class pocaddTest {
    @Test
    public void testAdd() throws Exception {
        pocadd p = new pocadd();
        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("i",5);
        map.put("j",9);
        p.add(map);
        Assert.assertEquals(new Integer(14),(Integer)map.get("res"));
               
    }
}
