package com.dedalus.denomination.model;

import java.util.Map;

public class DenominationResponse {
    private double originalAmount;
    private Map<String, Integer> breakdown;

    public DenominationResponse(double originalAmount, Map<String, Integer> breakdown) {
        this.originalAmount = originalAmount;
        this.breakdown = breakdown;
    }

    public double getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(double originalAmount) {
        this.originalAmount = originalAmount;
    }

    public Map<String, Integer> getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(Map<String, Integer> breakdown) {
        this.breakdown = breakdown;
    }
}