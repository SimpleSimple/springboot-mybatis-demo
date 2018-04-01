package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.TextInfo;

@Mapper
public interface TextDao {

	@Select("select id,title,content,author,create_time from duanzi "
			+ "limit #{start}, #{page_size}")
	public List<TextInfo> getTextList(@Param("start")int start, @Param("page_size")int page_size);
}
