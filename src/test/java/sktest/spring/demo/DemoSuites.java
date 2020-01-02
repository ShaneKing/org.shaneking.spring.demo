package sktest.spring.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sktest.spring.demo.aop.ivd.component.AopInvalidComponentTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({AopInvalidComponentTest.class})
public class DemoSuites {
}
