package mq.listener;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyMessageListener
 * Package: com.hw.mq.listener
 * Description:
 *
 * @Author Hacker by HW
 * @Create 2024/8/13 20:16
 * @Version 1.0
 */
@Component
public class MyMessageListener {
    @RabbitListener(queues = {"atguigu.queue.fanout2"})
    public void processMessage02(String messageContent, Message message, Channel channel) {
        System.out.println("Consumer02 Message Content:" + messageContent);
    }
}
