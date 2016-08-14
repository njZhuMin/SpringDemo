package com.sunnywr.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BeanImplTwo implements BeanInterface {
}
