package com.devops.cicd;

public class PricingConfig {
    // vatRate : taux TVA
    private final double vatRate;
    // seuil de frais de livraison offert
    private final double freeShippingThreshold;

    public PricingConfig(double vatRate, double freeShippingThreshold) {
        this.vatRate = vatRate;
        this.freeShippingThreshold = freeShippingThreshold;
    }

    public double getVatRate() {
        return vatRate;
    }

    public double getFreeShippingThreshold() {
        return freeShippingThreshold;
    }
}
