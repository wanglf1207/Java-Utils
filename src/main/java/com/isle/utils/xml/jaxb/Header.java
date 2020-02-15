package com.isle.utils.xml.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wanglf1207
 */
public class Header {

    @XmlElement(name = "tranction_id")
    public String getTranctionId() {
        return tranctionId;
    }

    public void setTranctionId(String tranctionId) {
        this.tranctionId = tranctionId;
    }

    private String tranctionId;

}

