package example.rabbitmq.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

/**
 * 接收主题
 *
 * Created by null on 2017/1/16.
 */
@Service("topicMessageReceiver")
public class TopicMessageReceiver implements MessageListener {

    private static final Logger log = LoggerFactory.getLogger(TopicMessageReceiver.class);

    @Override
    public void onMessage(Message message) {
        String msg = new String(message.getBody());
        log.info("消息接收[{}]", msg);
    }
}
