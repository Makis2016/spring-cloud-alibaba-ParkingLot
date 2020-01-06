package com.mall.parking.finance.mapper;

import com.mall.parking.finance.entity.MonthCardRecharge;
import com.mall.parking.finance.entity.MonthCardRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthCardRechargeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card_recharge
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    long countByExample(MonthCardRechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card_recharge
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    int deleteByExample(MonthCardRechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card_recharge
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card_recharge
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    int insert(MonthCardRecharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card_recharge
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    int insertSelective(MonthCardRecharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card_recharge
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    List<MonthCardRecharge> selectByExample(MonthCardRechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card_recharge
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    MonthCardRecharge selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card_recharge
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") MonthCardRecharge record, @Param("example") MonthCardRechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card_recharge
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    int updateByExample(@Param("record") MonthCardRecharge record, @Param("example") MonthCardRechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card_recharge
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    int updateByPrimaryKeySelective(MonthCardRecharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table month_card_recharge
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    int updateByPrimaryKey(MonthCardRecharge record);
}