package example.rabbitmq.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

/**
 * 消息接收
 *
 * Created by null on 2017/1/16.
 */
@Service("messageReceiver")
public class MessageReceiver implements MessageListener {

    private static final Logger log = LoggerFactory.getLogger(MessageReceiver.class);

    @Override
    public void onMessage(Message message) {
        String msg = new String(message.getBody());
        log.info("消息接收[{}]", msg);
    }
}
