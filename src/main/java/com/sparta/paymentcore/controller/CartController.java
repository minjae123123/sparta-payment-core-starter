package com.sparta.paymentcore.controller;

import com.sparta.paymentcore.dto.AddCartItemRequest;
import com.sparta.paymentcore.dto.AddCartItemResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @PostMapping("/items")
    public ResponseEntity<AddCartItemResponse> addItem(@RequestBody AddCartItemRequest request) {
        return null;
    }

}
