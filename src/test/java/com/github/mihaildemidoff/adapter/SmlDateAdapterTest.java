package com.github.mihaildemidoff.adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @author Mikhail Demidov
 */
public class SmlDateAdapterTest {

    private SmlDateAdapter adapter;

    @Before
    public void setUp() throws Exception {
        adapter = new SmlDateAdapter();
    }

    @Test
    public void testMarshalNull() throws Exception {
        assertNull(adapter.marshal(null));
    }

    @Test
    public void testUnmarshalNull() throws Exception {
        assertNull(adapter.marshal(null));
    }

}
