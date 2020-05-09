package com.example.mybatis.mappers;

import com.example.mybatis.entity.ShopInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopInfoMapper {
    List<ShopInfo> getAllShopInfo();
    void addShopInfo(ShopInfo shopInfo);
}
