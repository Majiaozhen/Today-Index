package com.itheima.stock.mapper;

import com.itheima.stock.pojo.StockMarketLogPrice;

/**
* @author 96377
* @description 针对表【stock_market_log_price(股票大盘 开盘价与前收盘价流水表)】的数据库操作Mapper
* @createDate 2024-10-30 10:04:41
* @Entity com.itheima.stock.pojo.StockMarketLogPrice
*/
public interface StockMarketLogPriceMapper {

    int deleteByPrimaryKey(Long id);

    int insert(StockMarketLogPrice record);

    int insertSelective(StockMarketLogPrice record);

    StockMarketLogPrice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StockMarketLogPrice record);

    int updateByPrimaryKey(StockMarketLogPrice record);

}
