Java多线程

线程池的原理，为什么要创建线程池？

线程的生命周期，什么时候会出现僵死进程；

什么实现线程安全，如何实现线程安全；

创建线程池有哪几个核心参数？ 如何合理配置线程池的大小？

synchronized、volatile区别、synchronized锁粒度、模拟死锁场景、原子性与可见性；

JVM相关

JVM内存模型，GC机制和原理；GC分哪两种；什么时候会触发Full GC？

JVM里的有几种classloader，为什么会有多种？

什么是双亲委派机制？介绍一些运作过程，双亲委派模型的好处；(这个我真的不会...)

什么情况下我们需要破坏双亲委派模型；

常见的JVM调优方法有哪些？可以具体到调整哪个参数，调成什么值？

JVM虚拟机内存划分、类加载器、垃圾收集算法、垃圾收集器、class文件结构是如何解析的；

Java扩展

红黑树的实现原理和应用场景；

NIO是什么？适用于何种场景？

Java9比Java8改进了什么；

HashMap内部的数据结构是什么？底层是怎么实现的？

说说反射的用途及实现，反射是不是很慢，我们在项目中是否要避免使用反射；

说说自定义注解的场景及实现；

List和Map区别，Arraylist与LinkedList区别，ArrayList与Vector 区别；

Spring
Spring AOP的实现原理和场景；（应用场景很重要）

Spring bean的作用域和生命周期；

Spring Boot比Spring做了哪些改进？ Spring 5比Spring4做了哪些改进；（惭愧呀，我们还在用Spring4，高版本的没关心过）

Spring IOC是什么？优点是什么？

SpringMVC、动态代理、反射、AOP原理、事务隔离级别；

中间件

Dubbo完整的一次调用链路介绍；

Dubbo支持几种负载均衡策略？

Dubbo Provider服务提供者要控制执行并发请求上限，具体怎么做？

Dubbo启动的时候支持几种配置方式？

了解几种消息中间件产品？各产品的优缺点介绍；

消息中间件如何保证消息的一致性和如何进行消息的重试机制？

Spring Cloud熔断机制介绍；

Spring Cloud对比下Dubbo，什么场景下该使用Spring Cloud？

