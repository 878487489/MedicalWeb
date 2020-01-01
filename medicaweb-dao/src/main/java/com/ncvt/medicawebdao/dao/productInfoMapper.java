package com.ncvt.medicawebdao.dao;

import com.ncvt.medicawebprojo.projo.productInfo;
import com.ncvt.medicawebprojo.projo.productInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface productInfoMapper {
    int countByExample(productInfoExample example);

    int deleteByExample(productInfoExample example);

    int deleteByPrimaryKey(String productId);

    int insert(productInfo record);

    int insertSelective(productInfo record);

    List<productInfo> selectByExample(productInfoExample example);

    productInfo selectByPrimaryKey(String productId);

    int updateByExampleSelective(@Param("record") productInfo record, @Param("example") productInfoExample example);

    int updateByExample(@Param("record") productInfo record, @Param("example") productInfoExample example);

    int updateByPrimaryKeySelective(productInfo record);

    int updateByPrimaryKey(productInfo record);
}