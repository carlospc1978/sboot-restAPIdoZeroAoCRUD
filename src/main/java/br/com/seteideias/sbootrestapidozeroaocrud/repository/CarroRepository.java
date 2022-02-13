package br.com.seteideias.sbootrestapidozeroaocrud.repository;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro,Long> {
}
