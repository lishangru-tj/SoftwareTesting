package com.example.backend.service.impl;

import com.example.backend.BackEndApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = BackEndApplication.class)
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class TaskControllerTest {
    @Autowired(required = false)
    MockMvc mockMvc;

    @Test
    public void testFindOneTaskAndRelative() throws Exception {
        String taskId = "1650822563365588993";
        String url = "/task/findOneTaskAndRelative/1651046925918195713";
        mockMvc.perform(
                        MockMvcRequestBuilders.get(url)
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                                .accept(MediaType.APPLICATION_JSON))
                .andExpect(
                        MockMvcResultMatchers
                                .jsonPath("code")
                                .value(200))
                .andDo(
                        MockMvcResultHandlers.print());

    }

}
