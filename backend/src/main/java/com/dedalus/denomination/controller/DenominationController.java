package com.dedalus.denomination.controller;

import org.springframework.web.bind.annotation.RestController;

import com.dedalus.denomination.model.DenominationRequest;
import com.dedalus.denomination.model.DenominationResponse;
import com.dedalus.denomination.service.DenominationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/denomination")
public class DenominationController {
    @Autowired
    private DenominationService denominationService;

    @PostMapping
    public DenominationResponse getBreakdown(@RequestBody DenominationRequest request) {
        return denominationService.calculateBreakdown(request.getAmount());
    }

}
