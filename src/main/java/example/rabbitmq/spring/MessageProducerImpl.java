package example.rabbitmq.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 消息生产者
 *
 * Created by null on 2017/1/16.
 */
@Service("messageProducer")
public class MessageProducerImpl implements MessageProducer {

    private static final Logger log = LoggerFactory.getLogger(MessageProducerImpl.class);

    @Resource
    private AmqpTemplate amqpTemplate;

    @Resource
    private AmqpTemplate topicTemplate;

    @Value("${mq.queueKey}")
    private String queueKey;

    public void sendMessage(Object message) {
        log.info("发送消息[{}]", message);
        // direct
        amqpTemplate.convertAndSend(queueKey, message);
        // topic
        topicTemplate.convertAndSend("foo.bar", message);
    }
}
