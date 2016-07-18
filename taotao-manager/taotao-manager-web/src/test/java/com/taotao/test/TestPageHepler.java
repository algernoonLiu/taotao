package com.taotao.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.ItemMapper;
import com.taotao.pojo.Item;
import com.taotao.pojo.ItemExample;

public class TestPageHepler {
	
	@Test
	public void TestPageTelper(){
		// 加载spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
		// 获取实例对象
		ItemMapper itemMapper = ac.getBean(ItemMapper.class);
		
		ItemExample example = new ItemExample();
		PageHelper.startPage(1, 10);
		List<Item> list = itemMapper.selectByExample(example );
		
		PageInfo<Item> pageInfo = new PageInfo<Item>(list);
		
		for (Item item : list) {
			System.out.println(item.getTitle());
		}
		System.out.println(pageInfo.getTotal());
	}
}
