package com.imooc.miaosha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.miaosha.dao.TextInfoDao;
import com.imooc.miaosha.domain.TextInfo;


@Service
public class TextService {
	
	@Autowired
	TextInfoDao textInfoDao;
	
	public List<TextInfo> getTextList(int page, int page_size) {
		return textInfoDao.getTextList(page, page_size);
	}
}
