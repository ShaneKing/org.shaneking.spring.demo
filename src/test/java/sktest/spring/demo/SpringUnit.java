package sktest.spring.demo;

import org.junit.runner.RunWith;
import org.shaneking.spring.demo.SpringUnitApplication;
import org.shaneking.test.SKUnit;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringUnitApplication.class)
public class SpringUnit extends SKUnit {
}
