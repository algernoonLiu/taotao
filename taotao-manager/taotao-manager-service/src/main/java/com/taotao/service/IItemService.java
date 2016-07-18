package com.taotao.service;

import com.taotao.common.pojo.PageResult;
import com.taotao.pojo.Item;

public interface IItemService {

	Item findByPrimaryKey(Long itemId);
	
	PageResult getItemList(int pageNo, int rows);

}
