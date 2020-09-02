package com.cloud_project.payment.controller;

import com.cloud_project.commons.entites.CommonResult;
import com.cloud_project.commons.entites.Payment;
import com.cloud_project.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功！", payment);
        }else{
            return new CommonResult(404, "插入数据库失败！", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        if (paymentById != null) {
            return new CommonResult(200, "查询成功！", paymentById);
        }else{
            return new CommonResult(404, "没有对应记录！ID:" + id, null);
        }
    }
}
