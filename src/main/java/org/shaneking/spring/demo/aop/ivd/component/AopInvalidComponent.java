package org.shaneking.spring.demo.aop.ivd.component;

import org.shaneking.spring.demo.aop.ivd.annotation.AopInvalidAnno;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component
public class AopInvalidComponent {
  @AopInvalidAnno
  public void aopValid() {
    System.out.println(this.getClass().getName());
  }

  public void aopInvalid() {
    aopValid();
  }

  public void aopProxy() {
    ((AopInvalidComponent) AopContext.currentProxy()).aopValid();
  }
}
