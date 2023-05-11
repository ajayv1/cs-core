package org.learning.design.adapter;

import org.learning.design.adapter.external.RazorPayApi;
import org.learning.design.adapter.external.RazorPayStatus;
import org.learning.design.adapter.interfaces.PaymentProvider;
import org.learning.design.adapter.models.PaymentRequest;
import org.learning.design.adapter.models.PaymentStatus;

public class RazorPayProvider implements PaymentProvider {
    private RazorPayApi api = new RazorPayApi();
    @Override
    public void createPayment(PaymentRequest request) {
        api.makePayment(request.getName(), request.getPhone());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        RazorPayStatus status = api.checkStatus(paymentId);

        return toStatus(status);
    }

    private PaymentStatus toStatus(RazorPayStatus status) {
        if (status == RazorPayStatus.SUCCESS) {
            return PaymentStatus.SUCCESS;
        }

        return PaymentStatus.ERROR;
    }
}
