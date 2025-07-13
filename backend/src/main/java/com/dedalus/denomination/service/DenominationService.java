package com.dedalus.denomination.service;

import com.dedalus.denomination.model.DenominationResponse;
import org.springframework.stereotype.Service;
import java.util.LinkedHashMap;
import java.util.Map;;

@Service
public class DenominationService {

    private final Map<String, Integer> denominationMap;

    public DenominationService() {
        denominationMap = new LinkedHashMap<>();
        denominationMap.put("€200", 20000);
        denominationMap.put("€100", 10000);
        denominationMap.put("€50", 5000);
        denominationMap.put("€20", 2000);
        denominationMap.put("€10", 1000);
        denominationMap.put("€5", 500);
        denominationMap.put("€2", 200);
        denominationMap.put("€1", 100);
        denominationMap.put("€0.50", 50);
        denominationMap.put("€0.20", 20);
        denominationMap.put("€0.10", 10);
        denominationMap.put("€0.5", 5);
        denominationMap.put("€0.2", 2);
        denominationMap.put("€0.1", 1);
    }

    public DenominationResponse calculateBreakdown(double amountInEuros) {
        int remaining = (int) Math.round(amountInEuros * 100); // Convert to cents
        Map<String, Integer> result = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : denominationMap.entrySet()) {
            int count = remaining / entry.getValue();
            if (count > 0) {
                result.put(entry.getKey(), count);
                remaining %= entry.getValue();
            }
        }

        return new DenominationResponse(amountInEuros, result);
    }
}