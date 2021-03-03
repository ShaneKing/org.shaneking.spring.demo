package sktest.demo.aop.ivd.component;

import org.junit.jupiter.api.Test;
import org.shaneking.demo.aop.ivd.component.AopInvalidComponent;
import org.shaneking.leon.test.SKSpringMvcUnit;
import org.springframework.beans.factory.annotation.Autowired;

public class AopInvalidComponentTest extends SKSpringMvcUnit {
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
