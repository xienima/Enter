# 
# 学习笔记
## Ioc原理
### 反射 通过反射动态的获取类的属性和方法
### 工厂模式  
beanFactory 提供基本的功能  ApplicationContext 增加了特定的功能
### 配置元数据
### 实例化容器
beans的范围 </br>
singleton bean </br>
 Only one instance is ever created </br>
prototype bean </br>
 A brand new bean instance is created </br>
#### 多线程方式  通过ApplicationContext 调用getBean 获取prototype bean </br>
