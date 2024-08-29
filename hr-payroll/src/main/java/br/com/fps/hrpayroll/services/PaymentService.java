package br.com.fps.hrpayroll.services;

import br.com.fps.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

  public Payment getPayment(Long WorkerId, int days) {
    return new Payment("Bob", 200.0, days);
  }
}
