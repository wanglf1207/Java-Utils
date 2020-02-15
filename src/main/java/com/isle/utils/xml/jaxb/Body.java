package com.isle.utils.xml.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  wanglf1207
 */
public class Body {

    // 这几个标签是body标签的属性
    private String att1;
    private String att2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;

    private Level level;


    // 明细
    private List<Detail> detailList = new ArrayList<>();


    public List<Detail> getDetailList() {
        return detailList;
    }
    public void setDetailList(List<Detail> detailList) {
        this.detailList = detailList;
    }


    @XmlAttribute(name = "att1")
    public String getAtt1() {
        return att1;
    }

    public void setAtt1(String att1) {
        this.att1 = att1;
    }

    @XmlAttribute(name = "att2")
    public String getAtt2() {
        return att2;
    }

    public void setAtt2(String att2) {
        this.att2 = att2;
    }


    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}

