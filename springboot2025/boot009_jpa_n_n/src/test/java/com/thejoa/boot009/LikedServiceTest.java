package com.thejoa.boot009;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.thejoa.boot009.myjpa.LikeService;
import com.thejoa.boot009.myjpa.Post;
import com.thejoa.boot009.myjpa.PostRepository;
import com.thejoa.boot009.myjpa.User;
import com.thejoa.boot009.myjpa.UserRepository;

@SpringBootTest
public class LikedServiceTest {
	@Autowired UserRepository userRepository;
	@Autowired PostRepository postRepository;
	@Autowired LikeService likeservice;
	
	@Test
	@Transactional 
	public void testLikedPost() {
		// 사용자 생성
		User user = new User(); user.setUsername("JM");
		userRepository.save(user);
		
		// 게시글 생성
		Post post = new Post(); post.setContent("first board");
		postRepository.save(post);
		
		// 좋아요 추가
		likeservice.likePost(user.getId(), post.getId());
		
		// 사용자의 likedPosts에서 게시글추가확인
		User updatedUser = userRepository.findById(user.getId()).orElseThrow();
		assertTrue(updatedUser.getLikedPosts().contains(post));
		
		// 사용자의 likedUsers에서 사용자추가확인
		Post updatedPost = postRepository.findById(post.getId()).orElseThrow();
		assertTrue(updatedPost.getLikedUsers().contains(user));
	}
}
