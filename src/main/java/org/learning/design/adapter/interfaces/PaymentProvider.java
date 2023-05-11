package org.learning.design.adapter.interfaces;

import org.learning.design.adapter.models.PaymentRequest;
import org.learning.design.adapter.models.PaymentStatus;

// Step 2: create adapter interface
public interface PaymentProvider {
    public void createPayment(PaymentRequest request);
    public PaymentStatus verifyStatus(String paymentId);

}
