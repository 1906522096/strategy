策略模式的demo

定义一个父类的接口，统一的入口，利用spring的serviceMap自动注入service，并根据不同的策略，进入到不同的service实现

service名字规范的话,在map里面是首字母小写的，当然也可以用@Component自己定义
