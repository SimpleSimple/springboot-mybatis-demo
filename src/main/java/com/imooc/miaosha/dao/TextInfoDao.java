package com.imooc.miaosha.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.imooc.miaosha.domain.TextInfo;

@Mapper
public interface TextInfoDao{

	@Select("select id,title,content,author,create_time from duanzi "
			+ "limit #{page_size}")
	public List<TextInfo> getTextList(int page, @Param("page_size")int page_size);
}
