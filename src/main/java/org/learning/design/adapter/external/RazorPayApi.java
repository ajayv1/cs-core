package org.learning.design.adapter.external;
// Step 1 - incompatible interfaces
public class RazorPayApi {
    public void makePayment(String name, String phone) {
        System.out.println("Making payment bya razorpay");
    }

    public RazorPayStatus checkStatus(String paymentId) {
        return RazorPayStatus.SUCCESS;
    }
}
