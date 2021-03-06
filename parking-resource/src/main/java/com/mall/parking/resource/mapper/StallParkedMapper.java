package com.mall.parking.resource.mapper;

import com.mall.parking.resource.entity.StallParked;
import com.mall.parking.resource.entity.StallParkedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StallParkedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stall_parked
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    long countByExample(StallParkedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stall_parked
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int deleteByExample(StallParkedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stall_parked
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stall_parked
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int insert(StallParked record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stall_parked
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int insertSelective(StallParked record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stall_parked
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    List<StallParked> selectByExample(StallParkedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stall_parked
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    StallParked selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stall_parked
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") StallParked record, @Param("example") StallParkedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stall_parked
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int updateByExample(@Param("record") StallParked record, @Param("example") StallParkedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stall_parked
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int updateByPrimaryKeySelective(StallParked record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stall_parked
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int updateByPrimaryKey(StallParked record);
}