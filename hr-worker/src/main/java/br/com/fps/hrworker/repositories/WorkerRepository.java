package br.com.fps.hrworker.repositories;

import br.com.fps.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
  // metodos para fazer acesso aos dados
}
