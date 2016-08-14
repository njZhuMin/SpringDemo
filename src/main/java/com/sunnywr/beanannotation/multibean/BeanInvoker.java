package com.sunnywr.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanInvoker {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    @Qualifier("beanImplTwo")
    private BeanInterface beanInterface;

    public void say() {
        System.out.println("List...");
        if(list != null && list.size() != 0) {
            for(BeanInterface bean : list)
                System.out.println(bean.getClass().getName());
        }
        else
            System.out.println("List<BeanInterface> list is null.");

        System.out.println();

        System.out.println("Map...");
        if(map != null && map.size() != 0) {
            for(Map.Entry<String, BeanInterface> entry : map.entrySet())
                System.out.println(entry.getKey() + ": "
                        + entry.getValue().getClass().getName());
        }
        else
            System.out.println("Map<String, BeanInterface> map is null.");

        System.out.println();

        System.out.println("Qualifier...");
        if(beanInterface != null)
            System.out.println(beanInterface.getClass().getName());
        else
            System.out.println("beanInterface is null.");
    }
}
