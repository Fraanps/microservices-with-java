package br.com.fps.hrworker.reosurces;

import br.com.fps.hrworker.entities.Worker;
import br.com.fps.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResouce {

  @Autowired
  private WorkerRepository workerRepository;

  @GetMapping
  public ResponseEntity<List<Worker>> findAll() {
    List<Worker> listWorkers = workerRepository.findAll();
    return ResponseEntity.ok().body(listWorkers);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Worker> findById(@PathVariable Long id) {
    Worker obj = workerRepository.findById(id).get();
    return ResponseEntity.ok().body(obj);
  }
}
