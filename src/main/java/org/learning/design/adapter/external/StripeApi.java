package org.learning.design.adapter.external;

// Step 1 - incompatible interfaces
public class StripeApi {
    public void pay(String email) {
        System.out.println("Making payment bya stripe");
    }

    public StripeStatus checkStatus(String paymentId) {
        return StripeStatus.OK;
    }
}
