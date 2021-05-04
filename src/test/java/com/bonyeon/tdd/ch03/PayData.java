package com.bonyeon.tdd.ch03;

import java.time.LocalDate;

public class PayData {
    private LocalDate firstBillingData;
    private LocalDate billingDate;
    private int payAmount;

    private PayData() {}

    public PayData(LocalDate firstBillingData, LocalDate billingDate, int payAmount) {
        this.firstBillingData = firstBillingData;
        this.billingDate = billingDate;
        this.payAmount = payAmount;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(LocalDate billingDate) {
        this.billingDate = billingDate;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(int payAmount) {
        this.payAmount = payAmount;
    }

    public LocalDate getFirstBillingData() {
        return firstBillingData;
    }

    public void setFirstBillingData(LocalDate firstBillingData) {
        this.firstBillingData = firstBillingData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private PayData data = new PayData();

        public Builder firstBillingData(LocalDate firstBillingData) {
            data.firstBillingData = firstBillingData;
            return this;
        }

        public Builder billingDate(LocalDate billingDate) {
            data.billingDate = billingDate;
            return this;
        }

        public Builder payAmount(int payAmount) {
            data.payAmount = payAmount;
            return this;
        }

        public PayData build() {
            return data;
        }
    }

}
