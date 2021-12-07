package com.java.java13.demo.java13Demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTextBlockTest {

    @Test
    public void text_block_string_methods(){

        String TEXT_BLOCK_JSON = """
            {
            "firstName" : "Pawan",
            "lastName" : "Kulkarni"
            }
            """;
        assertThat(TEXT_BLOCK_JSON.contains("Pawan")).isTrue();
        assertThat(TEXT_BLOCK_JSON.indexOf("Kulkarni")).isGreaterThan(0);
        assertThat(TEXT_BLOCK_JSON.length()).isGreaterThan(0);
    }
}
