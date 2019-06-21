# spring-boot-mssql
Sping Boot + thymeleaf + Spring Data JPA 集成SQLServer示例
## 快速部署
* 1.clone项目到本地`git@github.com/yoloyl/spring-boot-mssql.git`
* 2.在配置文件引入SQLServer驱动、设置用户名密码
```
spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.datasource.url=jdbc:sqlserver://localhost:1433;DatabaseName=test
spring.datasource.username=sa
spring.datasource.password=123456
```
* 3.启动项目，在浏览器中输入`http://localhost:8088`
