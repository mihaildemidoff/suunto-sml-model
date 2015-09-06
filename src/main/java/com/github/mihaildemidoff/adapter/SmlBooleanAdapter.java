package com.github.mihaildemidoff.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Mikhail Demidov
 */
public class SmlBooleanAdapter extends XmlAdapter<String, Boolean> {

    /**
     * @inheritDoc
     */
    @Override
    public Boolean unmarshal(final String v) throws Exception {
        if (v == null) {
            return null;
        }
        return Boolean.parseBoolean(v);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String marshal(final Boolean v) throws Exception {
        if (v == null) {
            return null;
        }
        return String.valueOf(v);
    }

}
