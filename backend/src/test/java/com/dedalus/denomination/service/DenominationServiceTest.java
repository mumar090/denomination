package com.dedalus.denomination.service;

import com.dedalus.denomination.model.DenominationResponse;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DenominationServiceTest {

    private final DenominationService denominationService = new DenominationService();

    @Test
    void testCalculateBreakdownForExactAmount() {
        DenominationResponse response = denominationService.calculateBreakdown(187);

        assertEquals(187, response.getOriginalAmount());

        Map<String, Integer> breakdown = response.getBreakdown();
        assertEquals(1, breakdown.get("€100"));
        assertEquals(1, breakdown.get("€50"));
        assertEquals(1, breakdown.get("€20"));
        assertEquals(1, breakdown.get("€10"));
        assertEquals(1, breakdown.get("€5"));
        assertEquals(1, breakdown.get("€2"));
    }

    @Test
    void testCalculateBreakdownForZero() {
        DenominationResponse response = denominationService.calculateBreakdown(0);
        assertEquals(0, response.getOriginalAmount());
        assertTrue(response.getBreakdown().isEmpty());
    }
}
