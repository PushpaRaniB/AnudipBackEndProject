package com.airlines.dao;

import java.util.List;
import com.airlines.entities.Payments;

public interface PaymentDao {
	Payments getPaymentById(int payid);
     void addPayment(Payments pobj1);
    void updatePayment(Payments pobj1);
    void deletePayment(int payid);
    List<Payments> getAllPayments();
}
