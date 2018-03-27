
#项目名称： Spring多数据源分布式事务管理/springmvc+spring+atomikos[jta]+druid+mybatis

------

###[搭建教程](https://blog.csdn.net/zmx729618/article/details/54344296)

#项目版本：1.0版本
#创建时间：2018年03月
#创建者：宋发元
#创建地点：杭州
#开发环境：

> * 基本开发环境：JDK1.8 + Tomcat8.0 + eclipse + mysql

#项目结构：

> * jta

#项目优点：

>项目进行读写分离及分库分表，在一个业务中，在一个事务中处理时候将切换多个数据源，需要保证同一事务多个数据源数据的一致性。
>此处使用atomikos来实现。另外需要注意以下：
> * 1：spring3.0之后不再支持jtom[jta]了，支持第三方开源软件atomikos(http://www.atomikos.com/)来实现． 
> * 2：org.springframework.transaction.jta.JotmFactoryBean类，spring-tx-2.5.6.jar中有此类，spring-tx-3.0.0.RELEASE.jar之后没有此类。
> * 3：atomikos事务控制框架，其中看到有3种数据源，分别是，SimpleDataSourceBean,AtomikosDataSourceBean,AtomikosNonXADataSourceBean。

	1、SimpleDataSourceBean: 这个是最简单地数据源配置,需要配置XA驱动。
	2、AtomikosDataSourceBean:  分布式数据源,Atomikos实现的数据源，需要配置XA驱动，推荐此配置，可以配置连接池的信息。
	3、AtomikosNonXADataSourceBean: 非分布式数据源,该数据源配置需要普通JDBC的驱动，可以配置连接池。

> * 4：Atomikos支持XA(全局事务)和NON-XA(非全局事务)，NON-XA[nonxadatasource]效率高于XA。XA事务往往是包括多个数据源的全局事务，非XA是单个数据源的.
> * 5：XA连接是一个JTA事务中的参与者。XA连接不支持JDBC的自动提交特性。也就是说应用程序不必在xadatasource[XA]连接上调用java.sql.Connection.commit()或java.sql.Connection.rollback()；而应用程序应该使用UserTransaction.begin(),UserTransaction.commit()和UserTransaction.rollback().
	
#功能描述：


