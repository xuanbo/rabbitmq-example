package example.rabbitmq.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by null on 2017/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-core.xml"})
public class AppTest {

    @Resource
    private MessageProducer messageProducer;

    @Test
    public void runner() {
        messageProducer.sendMessage("Hello World");
    }
}
