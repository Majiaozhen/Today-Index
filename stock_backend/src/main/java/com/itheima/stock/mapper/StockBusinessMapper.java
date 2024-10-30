package com.itheima.stock.mapper;

import com.itheima.stock.pojo.StockBusiness;

import java.util.List;

/**
* @author 96377
* @description 针对表【stock_business(主营业务表)】的数据库操作Mapper
* @createDate 2024-10-30 10:04:41
* @Entity com.itheima.stock.pojo.StockBusiness
*/
public interface StockBusinessMapper {

    int deleteByPrimaryKey(Long id);

    int insert(StockBusiness record);

    int insertSelective(StockBusiness record);

    StockBusiness selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StockBusiness record);

    int updateByPrimaryKey(StockBusiness record);

    List<StockBusiness> findAll();

}
