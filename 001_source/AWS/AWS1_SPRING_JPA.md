
##### 1. 준비물

1. spring boot - pom.xml( lombok )
2. maven install

##### 2. AWS EC2

1. https://console.aws.amazon.com/
2. ec2 - 로그인 ( Ubuntu 24 / 키페어 / 보안그룹 / 30G )

##### 3. EC2 접속

ip주소
43.201.105.198
54.180.96.140

연결 ssh 클라이언트 
ssh -i "project1.pem" ubuntu@ec2-43-201-105-198.ap-northeast-2.compute.amazonaws.com
ssh -i "project1.pem" ubuntu@ec2-54-180-96-140.ap-northeast-2.compute.amazonaws.com


##### 4. RAM -SWAPFILE

```bash
sudo fallocate -l 8G /swapfile
sudo chmod 600 /swapfile
sudo mkswap /swapfile
sudo swapon /swapfile
sudo swapon --show
sudo free -h
```

> 시스템에서 메모리 부족할 때 임시저장소로 스왑
1. sudo fallocate -l 8G /swapfile : 8G 빈파일
2. sudo chmod 600 /swapfile : 소유자 읽고 쓰기 권한
3. sudo mkswap /swapfile  : 포맷
4. sudo swapon /swapfile  : 사용가능하게 시스템 활성화
5. sudo swapon --show     : 현재 사용되는 스왑영역 표시
6. sudo free -h           : 메모리 상태 확인

##### 5. JDK

```bash
sudo apt-cache search jdk
sudo apt-get update
sudo apt-get install openjdk-11-jdk
java -version
sudo vi /etc/profile

export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=$CLASSPATH:$JAVA_HOME/lib/tools.jar

source /etc/profile
```

##### 6. MYSQL

```bash
sudo apt-cache search mysql-server
sudo apt-get  update
sudo apt-get install mysql-server-8.0
/etc/init.d/mysql status
sudo mysql -uroot  
select user,host, plugin from mysql.user

use mysql
UPDATE user SET plugin='caching_sha2_password' WHERE user='root';
flush  privileges
set password for  'root'@'localhost'='1234'

create database myboot
```

##### 7. 파일올리기 - scp

```bash
scp -i "C:\Users\tj-bu-703-05\Desktop\001_source\AWS\project1.pem" "C:\Users\tj-bu-703-05\Desktop\001_source\AWS\mvcboard-0.0.1-SNAPSHOT.jar" ubuntu@43.201.105.198:/home/ubuntu/

yes
```

##### 8. 백그라운드에서 실행

```bash
nohup java -jar mvcboard-0.0.1-SNAPSHOT.jar & 
jobs
```

##### 9. 호스트확인

네트워크 : port 8080 열기
http:// ec2 주소: 8080

##### 10. S3 올라갔는지 확인