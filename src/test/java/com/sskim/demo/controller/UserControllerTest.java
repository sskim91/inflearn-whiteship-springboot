package com.sskim.demo.controller;

import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.awt.*;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void hello() throws Exception {
        mockMvc.perform(get("/helloUser"))
                .andExpect(status().isOk())
                .andExpect(content().string("helloUser"));
    }

    @Test
    void createUser_JSON() throws Exception {
        String userJson = "{\"username\":\"keesun\",\"password\":\"123\"}";
        mockMvc.perform(post("/users/create")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .content(userJson))
                .andDo(print())
                .andExpect(jsonPath("$.username", is(equalTo("keesun"))))
                .andExpect(jsonPath("$.password", is(equalTo("123"))));

    }

    @Test
    void createUser_XML() throws Exception {
        String userJson = "{\"username\":\"keesun\",\"password\":\"123\"}";
        mockMvc.perform(post("/users/create")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_XML)
                .content(userJson))
                .andDo(print())
                .andExpect(xpath("/User/username").string("keesun"))
                .andExpect(xpath("/User/password").string("123"));

    }
}