package com.interswitchgroup.mobpaylib.ui.fragments.mobile;

import android.arch.lifecycle.ViewModel;

import com.interswitchgroup.mobpaylib.model.Mobile;
import com.interswitchgroup.mobpaylib.ui.fragments.card.PaymentVm;

import javax.inject.Inject;

public class MobileVm extends ViewModel {
    private PaymentVm paymentVm;
    private Mobile mobile;

    @Inject
    public MobileVm() {
        this.mobile = new Mobile();
    }

    public PaymentVm getPaymentVm() {
        return paymentVm;
    }

    public void setPaymentVm(PaymentVm paymentVm) {
        this.paymentVm = paymentVm;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void makePayment() {
        paymentVm.makeMobilePayment(mobile);
    }
}
