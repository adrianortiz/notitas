package com.codizer.notitas;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest 
public class NotitasTest {

    @Test 
    void firstTest() {
        assertThat(17).isEqualTo(17);
    }
    
}