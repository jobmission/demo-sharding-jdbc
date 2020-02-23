
#打包
````
mvn clean install
````
#运行
````
java -jar sharding-jdbc-demo-0.0.1-SNAPSHOT.jar
````
#创建数据库
````
CREATE DATABASE IF NOT EXISTS product_dev_0 DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
CREATE DATABASE IF NOT EXISTS product_dev_1 DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
create user 'user_dev'@'localhost' identified by 'pass_dev';
grant all privileges on product_dev_0.* to 'user_dev'@'localhost';
grant all privileges on product_dev_1.* to 'user_dev'@'localhost';
````
#执行单元测试模拟数据

