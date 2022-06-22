# 服务器信息

### linux服务器

服务器信息:

* ssh 192.168.1.100 22 root root
* docker mysql 192.168.1.100 3307 root 123456
* jenkins http://192.168.1.100:8080/ wuchao wuchao
* webapp http://192.168.1.100:8081/
* github https://github.com/woody-pet/woody/ woody-pet Hi1234567
* gitlab http://192.168.1.100:8090/ wuchao 87654321

启动web服务：
    
    #结束项目进程
    PID=`ps -ef | grep woody- | grep -v grep | awk '{ print $2 }'`
    if [ ${PID} ];
    then
    echo 'Application is stopping...'
    echo kill $PID DONE
    kill $PID
    else
    echo 'Application is already stopped...'
    fi
    
    BUILD_ID=dontKillMe
    #开启项目
    nohup java -jar $WORKSPACE/target/woody-0.0.1-SNAPSHOT.jar &> /dev/null &
    #nohup java -jar $WORKSPACE/target/woody-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &


启动jenkins:
    
    cd /root/jenkins/
    nohup ./jdk-11.0.10/bin/java -jar jenkins.war &> /dev/null &
    
    docker run -d -p 8080:8080 -p 50000:50000 \
        --restart always \
        -v /root/apache-maven-3.8.1:/usr/local/mavem \
        -v /root/jenkins/jenkins_home:/var/jenkins_home \
        -v /etc/localtime:/etc/localtime \
        --name jenkins docker.io/jenkins

创建mysql:

docker run -p 3307:3306 --name mysql01 
    --privileged=true --restart always 
    -v /usr/local/docker/mysql/conf:/etc/mysql 
    -v /usr/local/docker/mysql/logs:/var/log/mysql 
    -v /usr/local/docker/mysql/data:/var/lib/mysql 
    -v /usr/local/docker/mysql/mysql-files:/var/lib/mysql-files 
    -e MYSQL_ROOT_PASSWORD=123456 -d mysql:8.0

创建gitlab:

* 默认密码位置 /etc/gitlab/initial_root_password BDNIgs3GUUOcAGUX8KaRD0nWC8rnwStYs8/nPmYIeGc=

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