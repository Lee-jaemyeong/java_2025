2. spring + security + jpa + s3

##### 1. [EC2-S3]

1. 네비게이션 - 서비스 - S3
  버킷만들기 : jaemyeong1025 , 리전설정 , ACL 비활성화 - 내가 접속한 계정에서만 소유하도록 , 동의 □ 모든 퍼블릭 액세스 차단 풀기
2. [권한]탭
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "AddPerm",
            "Effect": "Allow",
            "Principal": "*",
            "Action": [
                "s3:GetObject",
                "s3:PutObject"
            ],
            "Resource": "arn:aws:s3:::jaemyeong1025/*"
        }
    ]
}

3. 내이름탭 클릭 - 보안자격증명 -  새 액세스키만들기 - 키 다운로드

##### 2. [SPRING] 

0. S3파일설정

> pom.xml
```bash
  <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-aws</artifactId>
      <version>2.2.1.RELEASE</version>
  </dependency>
```

> application.properties
```bash
#   cloud.aws.credentials.access-key=AKIAYPPLQIR74M2JYDH2
#   cloud.aws.credentials.secret-key=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
  cloud.aws.region.static=ap-northeast-2
  cloud.aws.s3.bucket=jaemyeong1025
  cloud.aws.stack.auto=false
```

> S3 설정클래스
```bash
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Config {

    @Value("${cloud.aws.credentials.access-key}")
    private String accessKey;

    @Value("${cloud.aws.credentials.secret-key}")
    private String secretKey;

    @Value("${cloud.aws.region.static}")
    private String region;

    @Bean
    public AmazonS3 amazonS3() {
        AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        return AmazonS3ClientBuilder.standard()
            .withRegion(region)
            .withCredentials(new AWSStaticCredentialsProvider(credentials))
            .build();
    }
}
```

> 파일업로드 클래스 설정 / 기존 설정 변경
```bash
package com.thejoa.boot3.util;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;

@Component
public class UtilUpload {

    private final AmazonS3 amazonS3;

    @Value("${cloud.aws.s3.bucket}")
    private String bucketName;

    public UtilUpload(AmazonS3 amazonS3) {
        this.amazonS3 = amazonS3;
    }

    public String fileUpload(MultipartFile file) throws IOException {
        // 1. 고유한 파일 이름 생성
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();

        // 2. 메타데이터 설정
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(file.getSize());
        metadata.setContentType(file.getContentType());

        try {
            // 3. S3에 파일 업로드
            amazonS3.putObject(bucketName, fileName, file.getInputStream(), metadata);
        } catch (IOException e) {
            e.printStackTrace(); // 예외 처리
            throw e;
        }

        // 4. 업로드된 파일의 S3 URL 반환
        return amazonS3.getUrl(bucketName, fileName).toString();
    }
}
```

> detail.html (버킷설정)

1. spring boot - pom.xml ( lombok )
2. maven install

##### 3 