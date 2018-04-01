package com.imooc.miaosha.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imooc.miaosha.service.TextService;
import com.imooc.miaosha.domain.TextInfo;


@Controller
@RequestMapping("/text")
public class TextController {
	
	@Autowired
	TextService textService;
	
	@RequestMapping("/getList")
	@ResponseBody
	public Map<String, Object> getList() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<TextInfo> list = textService.getTextList(1, 10);
		modelMap.put("list", list);
		return modelMap;
	}
}
