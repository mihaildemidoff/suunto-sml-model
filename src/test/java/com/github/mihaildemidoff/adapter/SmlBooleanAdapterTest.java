package com.github.mihaildemidoff.adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Mikhail Demidov
 */
public class SmlBooleanAdapterTest {

    private SmlBooleanAdapter adapter;

    @Before
    public void setUp() throws Exception {
        adapter = new SmlBooleanAdapter();
    }

    @Test
    public void testMarshal() throws Exception {
        assertEquals("true", adapter.marshal(Boolean.TRUE));
        assertEquals("false", adapter.marshal(Boolean.FALSE));
    }

    @Test
    public void testUnmarshal() throws Exception {
        assertTrue(adapter.unmarshal("TRUE"));
        assertTrue(adapter.unmarshal("true"));
        assertFalse(adapter.unmarshal("FALSE"));
        assertFalse(adapter.unmarshal("false"));
    }

    @Test
    public void testUnmarshalNull() throws Exception {
        assertNull(adapter.unmarshal(null));
    }

    @Test
    public void testUnmarshalIncorrectInput() throws Exception {
        assertFalse(adapter.unmarshal("bomboclat"));
    }

    @Test
    public void testMarshalNull() throws Exception {
        assertNull("true", adapter.marshal(null));
    }

}
