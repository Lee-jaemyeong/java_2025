package com.thejoa.project001.member;

import lombok.Getter;

@Getter
public enum MemberRole {
	ADMIN("ROLE_ADMIN") , MEMBER("ROLE_MEMBER");
	private String value; // ROLE_ADMIN , ROLE_SYSTEM , ROLE_MEMBER

	private MemberRole(String value) { this.value = value; }
	
}
