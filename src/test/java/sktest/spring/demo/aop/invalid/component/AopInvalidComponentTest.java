package sktest.spring.demo.aop.invalid.component;

import org.junit.Test;
import org.shaneking.spring.demo.aop.invalid.component.AopInvalidComponent;
import org.springframework.beans.factory.annotation.Autowired;
import sktest.spring.demo.SKUnit;

public class AopInvalidComponentTest extends SKUnit {

  @Autowired
  private AopInvalidComponent aopInvalidComponent;

  @Test
  public void aopValid() {
    aopInvalidComponent.aopValid();// 2 line log and  1 line system out
  }

  @Test
  public void aopInvalid() {
    aopInvalidComponent.aopInvalid();// just 1 line system out
  }

  @Test
  public void aopProxy() {
    aopInvalidComponent.aopProxy();// 2 line log and  1 line system out
  }
}
