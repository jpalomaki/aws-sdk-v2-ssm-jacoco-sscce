package com.example;

import org.junit.jupiter.api.Test;
import software.amazon.awssdk.services.ssm.SsmClient;
import static software.amazon.awssdk.regions.Region.EU_WEST_1;

class SscceTest {
    @Test
    void test() {
        SsmClient.builder().region(EU_WEST_1).build();
    }
}
