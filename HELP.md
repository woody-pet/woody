# 服务器信息

### linux服务器

服务器信息:

* ssh 192.168.1.100 22 root root
* mysql 192.168.1.100 3306 root Hi.1234567
* docker mysql 192.168.1.100 3307 root 123456
* jenkins http://192.168.1.100:8080/ wuchao wuchao
* webapp http://192.168.1.100:8081/
* github https://github.com/woody-pet/woody/ woody-pet Hi.1234567


docker run -p 3307:3306 --name mysql01 --privileged=true 
    -v /usr/local/docker/mysql/conf:/etc/mysql 
    -v /usr/local/docker/mysql/logs:/var/log/mysql 
    -v /usr/local/docker/mysql/data:/var/lib/mysql 
    -v /usr/local/docker/mysql/mysql-files:/var/lib/mysql-files 
    -e MYSQL_ROOT_PASSWORD=123456 -d mysql:8.0

firewall-cmd --zone=public --add-port=80/tcp --permanent
