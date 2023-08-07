package com.imooc.mybatis.dao;

import com.imooc.mybatis.dto.GoodsDTO;
import com.imooc.mybatis.entity.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface GoodsDAO {
    @Select("select * from t_goods where current_price between #{min} and #{max} order by current_price DESC limit 0,#{limit}")
    public List<Goods>  selectByPriceRange(@Param("min") float min,@Param("max") float max,@Param("limit") int limit);

    @Insert("insert into t_goods (`title`,`sub_title`,`original_cost`,`current_price`,`discount`,`is_free_delivery`) values(#{title},#{subTitle},#{originalCost},#{currentPrice},#{discount},#{is_free_delivery})")
    @SelectKey(statement = "select last_insert_id()",before = false,keyProperty = "goodsId",  resultType = Integer.class)
    public int insert(Goods goods);

    @Select("select * from t_goods")
    @Results({
            @Result(column = "goods_id",property = "goodsId",id = true),
            @Result(column = "title",property = "title"),
            @Result(column = "current_price",property = "currentPrice"),
    })
    public List<GoodsDTO> selectAll();
}
