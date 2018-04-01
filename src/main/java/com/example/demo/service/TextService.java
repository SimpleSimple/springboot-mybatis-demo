package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TextDao;
import com.example.demo.domain.TextInfo;

@Service
public class TextService {
	
	@Autowired
	private TextDao textDao;
	
	public List<TextInfo> getTextList(int page, int page_size) {
		int start = (page-1)*page_size;
		return textDao.getTextList(start, page_size);
	}
}
