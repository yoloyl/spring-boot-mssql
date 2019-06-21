# Spring-boot-mssql 集成示例
![mssql](https://img.shields.io/badge/SQLServer-2008R2-9cf.svg)
![SpringBoot](https://img.shields.io/badge/Spring&nbsp;Boot-2.1.6-brightgreen.svg)  
Sping Boot + thymeleaf + Spring Data JPA 集成SQLServer示例
## 快速部署
1. clone项目到本地`git@github.com/yoloyl/spring-boot-mssql.git`
1. 在配置文件引入SQLServer驱动、设置用户名密码
```
spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.datasource.url=jdbc:sqlserver://localhost:1433;DatabaseName=test
spring.datasource.username=sa
spring.datasource.password=
```
3. 启动项目，在浏览器中输入`http://localhost:8088`
