

#打包
mvn clean install

#mysql 禁用group full query
set global sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';

#运行
java -jar XXX.jar

#创建API数据库
CREATE DATABASE IF NOT EXISTS product_dev DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
grant all privileges on product_dev.* to product_dev@localhost identified by 'password_dev';


