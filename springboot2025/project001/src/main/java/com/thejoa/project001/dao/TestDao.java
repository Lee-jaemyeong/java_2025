package com.thejoa.project001.dao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
	public String readTime();
}
