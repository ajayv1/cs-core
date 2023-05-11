package org.learning.design.adapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.learning.design.adapter.RazorPayProvider;
import org.learning.design.adapter.StripeProvider;
import org.learning.design.adapter.interfaces.PaymentProvider;
import org.learning.design.adapter.models.PaymentRequest;
import org.learning.design.adapter.models.PaymentStatus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PaymentProviderTest {
    private PaymentProvider provider;

    @Before
    public void setUp() {
        provider = new RazorPayProvider();
    }

    @After
    public void tearDown() {
        provider = null;
    }

    @Test
    public void testPayment() {
        assertTrue("If razorPay is used, payment provider should be RazorPayProvider",
                provider instanceof RazorPayProvider);

        provider.createPayment(
                PaymentRequest
                        .builder()
                        .email("abc@gmail.com")
                        .build()
        );
    }

    @Test
    public void testStatus() {
        PaymentStatus status = provider.verifyStatus("test");

        assertEquals("If test status is called, it shd return success",
                PaymentStatus.SUCCESS, status);

    }

}
