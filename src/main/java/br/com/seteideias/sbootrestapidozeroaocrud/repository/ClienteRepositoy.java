package br.com.seteideias.sbootrestapidozeroaocrud.repository;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositoy extends JpaRepository<Cliente,Long> {
}
