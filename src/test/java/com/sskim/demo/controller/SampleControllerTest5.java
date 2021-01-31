package com.sskim.demo.controller;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@WebMvcTest
class SampleControllerTest5 {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    WebClient webClient;

    @Test
    void hello() throws Exception {

        //요청 "/hello"
        //응답
        // - 모델 name : keesun
        // - 뷰 이름: hello

//        mockMvc.perform(get("/hello"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(view().name("hello"))
//                .andExpect(model().attribute("name", is("keesun")))
//                .andExpect(content().string(containsString("keesun")));

        HtmlPage page = webClient.getPage("/hello");
        HtmlHeading1 h1 = page.getFirstByXPath("//h1");
        assertThat(h1.getTextContent()).isEqualTo("keesun");
    }
}