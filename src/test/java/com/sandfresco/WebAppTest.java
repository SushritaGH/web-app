package com.sandfresco;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebAppTest {

    @Test
    public void testHelloWorld() {
        WebApp webApp = new WebApp();
        // This would be a simple example; you can enhance it for more complex functionality
        assertThat(webApp).isNotNull();
    }
}
