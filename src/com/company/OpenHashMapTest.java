package com.company;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OpenHashMapTest {

    @Test
    public void testStandard() {

        OpenHashMap map = new OpenHashMap(15);

        map.put(1, 13161548L);
        map.put(10, 12L);
        map.put(11, 156351313135L);

        assertEquals(null, map.get(8));
        assertEquals(13161548L, map.get(1), 0);
        assertEquals(12L, map.get(10), 0);
        assertEquals(156351313135L, map.get(11), 0);

        assertEquals(3, map.size());

    }

    @Test
    public void testDoublePut() {

        OpenHashMap map = new OpenHashMap(15);

        map.put(1, 13161548L);
        map.put(10, 12L);

        assertEquals(13161548L, map.get(1), 0);
        assertEquals(12L, map.get(10), 0);

        map.put(1, 14L);
        map.put(10, 122L);
        map.put(12, 11111L);

        assertEquals(14L, map.get(1), 0);
        assertEquals(122L, map.get(10), 0);
    }
}
