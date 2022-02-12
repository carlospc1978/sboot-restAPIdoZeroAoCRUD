package br.com.seteideias.sbootrestapidozeroaocrud.repository;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Carros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carros,Long> {
}
