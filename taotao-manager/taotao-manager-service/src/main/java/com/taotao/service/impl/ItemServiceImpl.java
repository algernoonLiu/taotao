package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.PageResult;
import com.taotao.mapper.ItemMapper;
import com.taotao.pojo.Item;
import com.taotao.pojo.ItemExample;
import com.taotao.service.IItemService;

@Service
public class ItemServiceImpl implements IItemService {

	@Autowired
	private ItemMapper itemMapper;
	
	public Item findByPrimaryKey(Long id){
		return itemMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageResult getItemList(int pageNo, int rows) {
		PageHelper.startPage(pageNo, rows);
		ItemExample example = new ItemExample();
		List<Item> list = itemMapper.selectByExample(example );
		PageInfo<Item> pager = new PageInfo<Item>(list);
		PageResult pageResult = new PageResult();
		pageResult.setRows(list);
		pageResult.setTotal(pager.getTotal());
		return pageResult;
	}
	
}
