package com.cloud_project.payment.dao;

import com.cloud_project.commons.entites.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    /**添加*/
    public int create(Payment payment);
    /**查询*/
    public Payment getPaymentById(@Param("id") Long id);
}
