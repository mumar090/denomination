package com.dedalus.denomination.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasKey;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class DenominationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testCalculateDenominationApi() throws Exception {
        String requestBody = "{\"amount\": 187}";
        mockMvc.perform(post("/api/denomination/").contentType(MediaType.APPLICATION_JSON).content(requestBody))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.originalAmount").value(187))
                .andExpect(jsonPath("$.breakdown").exists())
                .andExpect(jsonPath("$.breakdown").value(hasKey("€100")));
    }

}
