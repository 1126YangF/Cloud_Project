package com.cloud_project.payment.service;

import com.cloud_project.commons.entites.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    /**添加*/
    public int create(Payment payment);
    /**查询*/
    public Payment getPaymentById(@Param("id") Long id);
}
