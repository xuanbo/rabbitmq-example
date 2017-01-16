package example.rabbitmq.spring;

/**
 * 消息生产者
 *
 * Created by null on 2017/1/16.
 */
public interface MessageProducer {

    void sendMessage(Object message);
}
