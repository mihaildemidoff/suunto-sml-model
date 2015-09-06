package com.github.mihaildemidoff.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Mikhail Demidov
 */
public class SmlDateAdapter extends XmlAdapter<String, Date> {

    private static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss";

    /**
     * @inheritDoc
     */
    @Override
    public Date unmarshal(final String v) throws Exception {
        if (v == null) {
            return null;
        }
        return createSimpleDateFormat().parse(v);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String marshal(final Date v) throws Exception {
        if (v == null) {
            return null;
        }
        return createSimpleDateFormat().format(v);
    }

    private SimpleDateFormat createSimpleDateFormat() {
        return new SimpleDateFormat(DATE_PATTERN);
    }

}
