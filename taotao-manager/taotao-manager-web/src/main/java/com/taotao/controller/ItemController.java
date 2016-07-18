package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.PageResult;
import com.taotao.pojo.Item;
import com.taotao.service.IItemService;

@Controller
public class ItemController {

	@Autowired
	private IItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public Item findByPrimaryKey(@PathVariable(value="itemId") Long itemId){
		return itemService.findByPrimaryKey(itemId);
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public PageResult getItemList(int page, int rows){
		return itemService.getItemList(page, rows);
	}
	
}
