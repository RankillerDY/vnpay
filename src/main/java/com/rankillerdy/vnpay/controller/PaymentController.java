package com.rankillerdy.vnpay.controller;

import com.rankillerdy.vnpay.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/payment")
public class PaymentController {
    public final PaymentService paymentService;

    @GetMapping("/create-payment")
    public ResponseEntity<?> createPayment() throws UnsupportedEncodingException {
        return paymentService.createPayment();
    }
}
