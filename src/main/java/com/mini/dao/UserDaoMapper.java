package com.mini.dao;

import com.mini.dataobject.UserDao;

public interface UserDaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    int insert(UserDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    int insertSelective(UserDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    UserDao selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    int updateByPrimaryKeySelective(UserDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu May 28 11:25:01 CST 2020
     */
    int updateByPrimaryKey(UserDao record);
}