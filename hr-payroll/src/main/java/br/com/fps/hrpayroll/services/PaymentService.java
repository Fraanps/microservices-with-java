package br.com.fps.hrpayroll.services;

import br.com.fps.hrpayroll.entities.Payment;
import br.com.fps.hrpayroll.entities.Worker;
import br.com.fps.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

  @Autowired
  private WorkerFeignClient workerFeignClient;

  public Payment getPayment(Long workerId, int days) {
    Worker worker = workerFeignClient.findById(workerId).getBody();
    return new Payment(worker.getName(), worker.getDailyIncome(), days);
  }
}
