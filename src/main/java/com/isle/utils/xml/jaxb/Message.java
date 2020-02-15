package com.isle.utils.xml.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  wanglf1207
 */
@XmlRootElement( name = "message" )
public class Message {

    // 报文头
    List<Header> headerList = new ArrayList<>();
    List<Body> bodyList = new ArrayList<>();

    @XmlElement(name = "header")
    public List<Header> getHeaderList() {
        return headerList;
    }

    public void setHeaderList(List<Header> headerList) {
        this.headerList = headerList;
    }

    @XmlElement(name = "body")
    public List<Body> getBodyList() {
        return bodyList;
    }

    public void setBodyList(List<Body> bodyList) {
        this.bodyList = bodyList;
    }

}
