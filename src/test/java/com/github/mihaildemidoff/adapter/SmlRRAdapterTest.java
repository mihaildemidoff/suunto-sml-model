package com.github.mihaildemidoff.adapter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Mikhail Demidov
 */
public class SmlRRAdapterTest {

    private SmlRRAdapter adapter;

    @Before
    public void setUp() throws Exception {
        adapter = new SmlRRAdapter();
    }

    @Test
    public void testMarshalNull() throws Exception {
        assertNull(adapter.marshal(null));
    }

    @Test
    public void testUnmarshalEmpty() throws Exception {
        assertEquals(new ArrayList<Integer>(), adapter.unmarshal(""));
    }

    @Test
    public void testMarshalEmpty() throws Exception {
        assertEquals("", adapter.marshal(new ArrayList<Integer>()));
    }

    @Test
    public void testUnmarshal() throws Exception {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), adapter.unmarshal(" 1   2 3 4 5 "));
    }

    @Test
    public void testMarshal() throws Exception {
        assertEquals("1 2 3 4 5", adapter.marshal(Arrays.asList(1, 2, 3, 4, 5)));
    }


    @Test
    public void testUnmarshalNull() throws Exception {
        assertNull(adapter.unmarshal(null));
    }

}
