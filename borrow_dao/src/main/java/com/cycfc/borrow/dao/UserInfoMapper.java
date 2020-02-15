package com.cycfc.borrow.dao;

import com.cycfc.borrow.entity.UserInfo;
import com.cycfc.borrow.entity.UserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String mobile);

    /**
     *
     * @mbg.generated
     */
    int insert(UserInfo record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(UserInfo record);

    /**
     *
     * @mbg.generated
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated
     */
    UserInfo selectByPrimaryKey(String mobile);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserInfo record);
}