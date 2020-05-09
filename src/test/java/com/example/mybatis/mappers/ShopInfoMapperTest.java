package com.example.mybatis.mappers;

import com.example.mybatis.entity.ShopInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShopInfoMapperTest {
    @Autowired
    ShopInfoMapper shopInfoMapper;
    @Test
    public void getAllShopInfo(){
        List<ShopInfo> allShopInfo = shopInfoMapper.getAllShopInfo();
        System.out.println(allShopInfo);
    }
//add user
    @Test void addShopInfo(){
        ShopInfo shopInfo = new ShopInfo();
        List<Integer> scope = new ArrayList<>();
        scope.add(1);
        scope.add(3);
        scope.add(4);
        shopInfo.setId(1);
        shopInfo.setName("shop1");
        shopInfo.setMyScope(scope);
        shopInfoMapper.addShopInfo(shopInfo);
    }
}