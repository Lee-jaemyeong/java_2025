package com.thejoa.boot009.myjpa;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
	private final UserRepository userRepository;
	private final PostRepository postRepository;
	
	@Autowired
	public LikeService( UserRepository userRepository, PostRepository postRepository) {
		super();
		this.userRepository = userRepository;
		this.postRepository = postRepository;	
	}
	
	@Transactional
	public void likePost( Long userId, Long postId ) {
		User user = userRepository.findById(userId).orElseThrow( ()-> new RuntimeException("사용자 없음") );
		Post post = postRepository.findById(postId).orElseThrow( ()-> new RuntimeException("게시글 없음") );
		
		user.getLikedPosts().add(post);
		post.getLikedUsers().add(user);
		
		userRepository.save(user); // 관계저장
	}
}
