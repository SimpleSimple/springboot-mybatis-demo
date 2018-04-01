package com.example.demo.controller;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.TextInfo;
import com.example.demo.service.TextService;

@Controller
public class DemoController {

	@Autowired
	TextService textService;
	
	@RequestMapping("/hello")
	@ResponseBody
    public String hello()
    {
        return "hello world!";
    }
	
	@RequestMapping("/getList")
	@ResponseBody
	public Map<String, Object> getList() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<TextInfo> list = textService.getTextList(1, 10);
		modelMap.put("list", list);
		return modelMap;
	}
}
