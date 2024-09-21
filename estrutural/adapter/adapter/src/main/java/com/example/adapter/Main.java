package com.example.adapter;

import com.example.adapter.adapters.MercadoPagoAdapter;
import com.example.adapter.adapters.PayoneerAdapter;
import com.example.adapter.mercadoPago.MercadoPago;
import com.example.adapter.payoneer.Payoneer;
import com.example.adapter.paypal.IPaypalPayments;
import com.example.adapter.paypal.Paypal;

public class Main {
    public static void main(String[] args) {
        IPaypalPayments payonerPayments = new PayoneerAdapter(new Payoneer());
        payonerPayments.paypalPayment();
        payonerPayments.paypalReceive();

        IPaypalPayments mercadoPagoPayments = new MercadoPagoAdapter(new MercadoPago());
        mercadoPagoPayments.paypalPayment();
        mercadoPagoPayments.paypalReceive();

        IPaypalPayments paypalPayments = new Paypal();
        paypalPayments.paypalPayment();
        paypalPayments.paypalReceive();
    }
}