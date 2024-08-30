package br.com.fps.hrpayroll.feignclients;

import br.com.fps.hrpayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", url = "${hr-worker.host}", path = "/workers")
public interface WorkerFeignClient {

  @GetMapping(value = "/{id}")
  ResponseEntity<Worker> findById(@PathVariable Long id);
  
}
