package br.com.seteideias.sbootrestapidozeroaocrud.repository;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
