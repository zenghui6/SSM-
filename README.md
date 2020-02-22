### SSM脚手架
spring + springMVC + Mybatis + log4j + MybatisGenerator 

实现了
- 简单配置
- 日志打印
- 逆向文件
- 上传文件的配置
- 加入了Json 和 Restful 的配置 (在spring-mvc.xml 和 web.xml)


#### SSM整合步骤

![3MQkKe.png](https://s2.ax1x.com/2020/02/22/3MQkKe.png)

#### mybatis-config.xml:  简化类命名空间,配置数据源交给spring管理
####  spring-dao.xml :  
1. 关联数据库文件,引入database.properties

2. 配置数据源连接池信息: dataSource

3. 配置sqlSessionFactory对象 :
    - 注入数据源 :dataSource
    - 绑定mybatis配置文件 : configLocation
    - 绑定Sql映射文件的地址: mapperLocation
    
4 配置dao接口扫描包,动态实现dao接口注入到spring容器中
    - 将 sqlSessionFactory 注入 bean 中 : sqlSessionFactoryBeanName
    - 扫描 dao 包

#### spring-service.xml
1. 开启注解配置  
2. 扫描 service 包
3. 声明事务配置 : DataSourceTransactionManager 
4. aop 事务支持

#### spring-mvc.xml:
1. 注解驱动: 可加入对Json传输的支持
2. 静态资源过滤
3. 扫描 Controller 包
    - 扫描@Controller注解
4. 配置视图解析器
5. 配置文件解析器(可选)

#### web.xml
1. 配置监听器启动Spring容器
2. 将url控制交给 springMVC 的 DispatcherServlet(核心分发器)
3. 乱码过滤
4. session过期时间
5. 添加对 put 和 delete方式的支持




 
  