package com.github.mihaildemidoff.rr;

import com.github.mihaildemidoff.adapter.SmlRRAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

/**
 * Class represent heart rate variability info.
 * Class contains list of positive integers where each element represents R peak on cardiogram.
 *
 * @author Mikhail Demidov
 * @see <a href="https://en.wikipedia.org/wiki/Heart_rate_variability">
 * https://en.wikipedia.org/wiki/Heart_rate_variability
 * </a>
 */
@XmlRootElement(name = "R-R")
@XmlAccessorType(XmlAccessType.FIELD)
public class RR {

    @XmlElement(name = "Data")
    @XmlJavaTypeAdapter(SmlRRAdapter.class)
    private List<Integer> data;

    public RR() {
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(final List<Integer> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("data", data)
            .toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final RR rr = (RR) o;

        return new EqualsBuilder()
            .append(data, rr.data)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(data)
            .toHashCode();
    }
}
