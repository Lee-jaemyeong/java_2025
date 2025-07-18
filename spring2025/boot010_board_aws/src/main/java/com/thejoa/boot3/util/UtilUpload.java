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
/*
package com.thejoa.boot3.util;

import java.io.File;  //##
import java.io.IOException;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UtilUpload {
	@Value("${resource.path}")// application.properties 변수    resource.path
	private String uploadPath;
	
	public  String fileUpload(MultipartFile file) throws IOException {
		
		//1. 파일이름 중복안되게 설정
		String save= UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
		
		try {
			//2. 파일업로드기능
			File target=new File(uploadPath ,save); 
			////###  추가
			if (!target.getParentFile().exists()) {
			    target.getParentFile().mkdirs(); // 디렉토리 생성
			}
	
			
			FileCopyUtils.copy(file.getBytes(), target);  // 실제파일올리기
		}catch (IOException e1) {
		    e1.printStackTrace(); // 추가로 로그를 남길 수 있습니다.
		    System.err.println("File Upload Error: " + e1.getMessage());
		}
		
		
		return save;
	}
}
*/