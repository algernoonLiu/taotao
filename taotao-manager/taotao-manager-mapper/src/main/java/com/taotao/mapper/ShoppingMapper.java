package com.taotao.mapper;

import com.taotao.pojo.Shopping;
import com.taotao.pojo.ShoppingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Sun Apr 17 17:43:10 CST 2016
     */
    int countByExample(ShoppingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Sun Apr 17 17:43:10 CST 2016
     */
    int deleteByExample(ShoppingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Sun Apr 17 17:43:10 CST 2016
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Sun Apr 17 17:43:10 CST 2016
     */
    int insert(Shopping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Sun Apr 17 17:43:10 CST 2016
     */
    int insertSelective(Shopping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Sun Apr 17 17:43:10 CST 2016
     */
    List<Shopping> selectByExample(ShoppingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Sun Apr 17 17:43:10 CST 2016
     */
    Shopping selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Sun Apr 17 17:43:10 CST 2016
     */
    int updateByExampleSelective(@Param("record") Shopping record, @Param("example") ShoppingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Sun Apr 17 17:43:10 CST 2016
     */
    int updateByExample(@Param("record") Shopping record, @Param("example") ShoppingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Sun Apr 17 17:43:10 CST 2016
     */
    int updateByPrimaryKeySelective(Shopping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Sun Apr 17 17:43:10 CST 2016
     */
    int updateByPrimaryKey(Shopping record);
}