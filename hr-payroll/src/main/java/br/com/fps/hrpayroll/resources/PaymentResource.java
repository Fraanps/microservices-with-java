package br.com.fps.hrpayroll.resources;

import br.com.fps.hrpayroll.entities.Payment;
import br.com.fps.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

  @Autowired
  private PaymentService paymentService;

  @GetMapping(value = "/{workerId}/days/{days}")
  public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
    Payment payment = paymentService.getPayment(workerId, days);
    return ResponseEntity.ok(payment);

  }

}
