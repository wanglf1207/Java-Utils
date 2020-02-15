package com.isle.utils.xml.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  wanglf1207
 */
public class Test {

    public static  void main(String[] args){

        Message message = new Message();

        Header header = new Header();
        List<Header> headerList = new ArrayList<>();

        header.setTranctionId("123456");
        headerList.add(header);

        Body body = new Body();

        List<Body> bodyList = new ArrayList<>();
        body.setName("wanglf");
        body.setAtt1("value1");
        body.setAtt2("value2");
        body.setGender("2");

        List<Detail> detailList = new ArrayList<>();

        Detail detail = new Detail();
        detail.setOperation("=");
        detail.setValue("30");


        Detail detail2 = new Detail();
        detail2.setOperation("1=");
        detail2.setValue("20");

        detailList.add(detail);
        detailList.add(detail2);

        body.setDetailList(detailList);

        Level level = new Level();
        level.setValue("10");
        level.setOperation(">");

        body.setLevel(level);

        bodyList.add(body);

        message.setBodyList(bodyList);
        message.setHeaderList(headerList);

        String xml = object2Xml(message);
        // 截取掉JAXB生成XML的头带的standalone="yes"
        xml = xml.replace("standalone=\"yes\"","");
        System.out.println(xml);

    }
    /**
     * @param xmlStr 字符串
     * @param c      对象Class类型
     * @return 对象实例
     */
    @SuppressWarnings("unchecked")
    public static <T> T xml2Object(String xmlStr, Class<T> c) {
        try {
            JAXBContext context = JAXBContext.newInstance(c);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            T t = (T) unmarshaller.unmarshal(new StringReader(xmlStr));
            return t;
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param object 对象
     * @return 返回xmlStr
     */
    public static String object2Xml(Object object) {
        //这个地方传的是一个对象
        try {
            StringWriter writer = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller marshal = context.createMarshaller();
            marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // 格式化输出
            marshal.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");// 编码格式,默认为utf-8
            marshal.setProperty(Marshaller.JAXB_FRAGMENT, false);// 是否省略xml头信息
            marshal.setProperty("jaxb.encoding", "UTF-8");
            marshal.marshal(object, writer);
            return new String(writer.getBuffer());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
