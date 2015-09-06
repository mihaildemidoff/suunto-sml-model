package com.github.mihaildemidoff.adapter;

import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mikhail Demidov
 */
public class SmlRRAdapter extends XmlAdapter<String, List<Integer>> {

    private static final String REGEX = " ";

    /**
     * @inheritDoc
     */
    @Override
    public List<Integer> unmarshal(final String v) throws Exception {
        if (v == null) {
            return null;
        }
        final String[] splitted = v.split(REGEX);
        final List<Integer> output = new ArrayList<Integer>();
        for (final String token : splitted) {
            if (StringUtils.isNotEmpty(token)) {
                output.add(Integer.parseInt(token));
            }
        }
        return output;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String marshal(final List<Integer> v) throws Exception {
        if (v == null) {
            return null;
        }
        return StringUtils.join(v, REGEX);
    }

}
