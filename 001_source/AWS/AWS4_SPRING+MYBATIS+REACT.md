### SPRING + MYBATIS(JPA) + REACT AWS ( EC2 - 1개 VER :SPRING 8080 / react 3000 )

##### 1. 준비물  (.jar)
1. spring boot - pom.xml ( lombok )
2. maven install

```bash
@CrossOrigin(origins = {"http://localhost:3000","http://13.209.76.240"}, allowCredentials = "true")
@RestController
@RequestMapping("/api/member")
public class JwtMemberApiController {
```

##### 2. AWS EC2
1. https://console.aws.amazon.com
2. ec2 - 로그인 ( Ubuntu 24 / 키페어 / 보안그룹 / 30G )

##### 3. EC2 접속
13.209.76.240
ssh -i "project2.pem" ubuntu@ec2-13-209-76-240.ap-northeast-2.compute.amazonaws.com

Q. ec2에 jar 파일 올리기
```bash
scp -i "C:\Users\tj-bu-703-05\Desktop\001_source\AWS\project2.pem" "C:\Users\tj-bu-703-05\Desktop\001_source\AWS\project001-0.0.1-SNAPSHOT.jar" ubuntu@13.209.76.240:/home/ubuntu/
```

##### 4. RAM - SWAPFILE
```bash
sudo fallocate -l 8G /swapfile
sudo chmod       600 /swapfile
sudo mkswap /swapfile
sudo swapon /swapfile
sudo swapon --show
sudo free -h
```
> 시스템에서 메모리 부족할때 임시저장소로 스왑
1. sudo fallocate -l 8G /swapfile   : 8G 빈파일
2. sudo chmod       600 /swapfile   : 소유자 읽고 쓰기 권한
3. sudo mkswap /swapfile            : 포맷
4. sudo swapon /swapfile            : 사용가능하게 시스템활성화
5. sudo swapon --show               : 현재사용되는 스왑영역 표시
6. sudo free -h                     : 메모리상태확인



##### 5. JDK
```bash
sudo  apt-cache search jdk
sudo  apt-get update
sudo  apt-get install  openjdk-11-jdk
java -version
sudo  vi  /etc/profile

export  JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export  PATH=$JAVA_HOME/bin::$PATH
export  CLASSPATH=$CLASSPATH:$JAVA_HOME/lib/tools.jar

source  /etc/profile
```



##### 6. MYSQL
```bash
sudo apt-cache search mysql-server
sudo apt-get  update
sudo apt-get install mysql-server-8.0
/etc/init.d/mysql status
sudo mysql -uroot  
select  user,host, plugin  from mysql.user;

use mysql
UPDATE user SET plugin='caching_sha2_password' WHERE user='root';
flush  privileges;

set password for  'root'@'localhost'='1234';

create database myboot;

sudo systemctl status mysql
sudo systemctl restart mysql
```

##### 7. 파일올리기 - scp 
```bash
scp -i   "C:\Users\tj-bu-703-teacher\Desktop\AWS\project1.pem"        "C:\Users\tj-bu-703-teacher\Desktop\AWS\mvcboard-0.0.1-SNAPSHOT.jar" ubuntu@13.209.6.133:/home/ubuntu/ 

yes
```

##### 8. 백그라운드에서 실행
```bash
nohup java -jar project001-0.0.1-SNAPSHOT.jar &
jobs
```
cat  nohup.out

##### 9. 호스트확인
네트워크 : port 8080 열기
http://  ec2주소:8080

##### 10. scp

```bash
scp -i "C:\Users\tj-bu-703-05\Desktop\001_source\AWS\project2.pem" "C:\Users\tj-bu-703-05\Desktop\001_source\AWS\thejoa.sql" ubuntu@13.209.76.240:/home/ubuntu/
yes
```

##### 11. [EC2]-[front] ssh를 이용하여 연결하여 git파일다운로드

```bash
2. github에서 clone
   git clone https://github.com/sally03915/aws.git
   ls
```

```bash
mysql -u root -p thejoa  < thejoa.sql
```

##### 12. 명령어

```bash
cd aws
ls
cd 003 탭
cd front
```

##### 12. aws ec2 관리

port를 8080 열거나
port를 80으로

http://13.209.49.199

##### 13. [EC2]- [front]- [config]-config.js

> 주소 확인!

<br/>
<br/>

2. [front]- [sagas]- index.js

```
axios.defaults.baseURL = backUrl;
axios.defaults.withCredentials = true;
```

<br/>
<br/>

3. [front] - package.json

```bash
"dev": "next -p 3000",
"build": "cross-env ANALYZE=false NODE_ENV=production next build",
"start": "cross-env NODE_ENV=production next start -p 3000"
```

※ 참고 - 파일 수정 후 다시 받을때

```bash
git pull    origin main
git reset --hard origin/main     // 강제적용
```

##### 14. 노드 설치하기

```bash
sudo  apt-get  update
sudo  apt-get  install  -y  build-essential
sudo  apt-get  install  curl
sudo  apt-get  install nodejs  -y
sudo  apt-get  install npm

node -v
npm  -v

sudo npm install          --legacy-peer-deps
```

##### 15. build

```bash
sudo npm install react-is
```

```bash
sudo npm run build
```

🚀 일반적인 Next.js 프로젝트 (50~100 페이지) → 1~5분
⚡ 대형 프로젝트 (1000+ 페이지, 복잡한 이미지 최적화 포함) → 5~15분 이상

※ 참고 - 파일 수정 후 다시 받을때

```bash
git pull    origin main
git reset --hard origin/main     // 강제적용
```

##### 16. pm2

```bash
sudo npm install pm2 --legacy-peer-deps
```

<br/>
<br/>
<br/>

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

---

##### 17. nginx ?

```bash
sudo su
sudo lsof -i tcp:80
(나오는 값이 없어야 함, 나온다면 sudo kill -9 프로세스아이디(PID))
```

```bash
sudo apt-get install -y nginx
```

```bash
sudo rm /etc/nginx/sites-available/default
sudo rm /etc/nginx/sites-enabled/default
```

```bash
cd /etc/nginx/sites-available
sudo vi proxy.conf
```

```bash
server {
    listen 80;

    location / {
        proxy_pass http://localhost:3000;
        proxy_http_version 1.1;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header Cookie $http_cookie;
    }

    location ~ ^/(api|movies|member) {
        proxy_pass http://localhost:8080;
        proxy_http_version 1.1;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header Cookie $http_cookie;
    }
}
```

~ 정규표현식을 사용하겠다는 의미입니다 (^ 같은 패턴이 들어갈 때 필요)
^/() 요청 URL이 /로 시작하고 안의 내용(posts 등)과 일치하는지 확인

```bash
sudo ln -s /etc/nginx/sites-available/proxy.conf /etc/nginx/sites-enabled/proxy.conf
```

```bash
sudo nginx -t

```

```bash
sudo service nginx restart
```

##### 18.

```bash
cd front 경로까지
sudo npm start && sudo npx pm2

npx pm2 logs
npx pm2 kill
sudo npx pm2 list
sudo npx pm2 reload all
sudo npx pm2 stop app

sudo lsof -i tcp:3065
sudo lsof -i tcp:80
```

```bash
sudo chown ubuntu:ubuntu uploads
sudo chmod 755 uploads
```
