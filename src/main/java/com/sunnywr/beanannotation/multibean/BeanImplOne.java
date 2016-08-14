package com.sunnywr.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BeanImplOne implements BeanInterface {
}
