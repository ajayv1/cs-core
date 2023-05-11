package org.learning.design.adapter;

import org.learning.design.adapter.external.StripeApi;
import org.learning.design.adapter.external.StripeStatus;
import org.learning.design.adapter.interfaces.PaymentProvider;
import org.learning.design.adapter.models.PaymentRequest;
import org.learning.design.adapter.models.PaymentStatus;

public class StripeProvider implements PaymentProvider {
    private StripeApi api = new StripeApi();

    @Override
    public void createPayment(PaymentRequest request) {
        api.pay(request.getEmail());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        StripeStatus status = api.checkStatus(paymentId);

        return toStatus(status);
    }

    private PaymentStatus toStatus(StripeStatus status) {
        if (status == StripeStatus.OK) {
            return PaymentStatus.SUCCESS;
        }

        return PaymentStatus.ERROR;
    }
}
