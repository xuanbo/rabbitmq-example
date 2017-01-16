#   rabbit-example

与spring集成

基于gradle构建

##  运行例子

*   可以修改`applicationContext-rabbitmq.xml`中的`queue`名字，注意`rabbit:direct-exchange`和`rabbit:listener-container`也要相应的修改
*   `app.properties`中配置`rabbitmq`的连接信息
*   运行test中的`AppTest`类或执行`gradle build`


## 参考

*   [rabbitmq官方例子](http://www.rabbitmq.com/tutorials/tutorial-one-java.html)**推荐**
*   [rabbitmq教程系列](http://blog.csdn.net/lmj623565791/article/details/37607165)
*   [消息队列RabbitMQ与Spring集成](http://blog.csdn.net/jacman/article/details/50261915)
*   [结合Spring，运行RabbitMQ](http://blog.csdn.net/u011439289/article/details/52447526)**推荐**