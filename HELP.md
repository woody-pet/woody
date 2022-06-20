# 服务器信息

### linux服务器

服务器信息:

* ssh 192.168.1.100 22 root root
* mysql 192.168.1.100 3306 root Hi.1234567
* docker mysql 192.168.1.100 3307 root 123456
* jenkins http://192.168.1.100:8080/ wuchao wuchao
* webapp http://192.168.1.100:8081/
* github https://github.com/woody-pet/woody/ woody-pet Hi.1234567
* gitlab http://192.168.1.100:8090/ wuchao 87654321

启动jenkins:
    nohup ./jdk-11.0.10/bin/java -jar jenkins.war &> /dev/null &

创建mysql:
docker run -p 3307:3306 --name mysql01 --privileged=true 
    -v /usr/local/docker/mysql/conf:/etc/mysql 
    -v /usr/local/docker/mysql/logs:/var/log/mysql 
    -v /usr/local/docker/mysql/data:/var/lib/mysql 
    -v /usr/local/docker/mysql/mysql-files:/var/lib/mysql-files 
    -e MYSQL_ROOT_PASSWORD=123456 -d mysql:8.0

创建gitlab:
#/etc/gitlab/initial_root_password #BDNIgs3GUUOcAGUX8KaRD0nWC8rnwStYs8/nPmYIeGc=
docker run --detach \
--publish 8433:443 --publish 8090:80 --publish 8022:22 \
--name gitlab \
--restart always \
--volume $GITLAB_HOME/config:/etc/gitlab \
--volume $GITLAB_HOME/logs:/var/log/gitlab \
--volume $GITLAB_HOME/data:/var/opt/gitlab \
--privileged=true \
gitlab/gitlab-ce:latest

防火墙:
firewall-cmd --zone=public --add-port=80/tcp --permanent
firewall-cmd --reload
firewall-cmd --list-ports
systemctl stop firewalld