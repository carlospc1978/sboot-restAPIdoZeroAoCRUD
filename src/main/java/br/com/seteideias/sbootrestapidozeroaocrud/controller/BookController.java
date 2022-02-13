package br.com.seteideias.sbootrestapidozeroaocrud.controller;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Book;
import br.com.seteideias.sbootrestapidozeroaocrud.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {

    BookRepository bookRepository;

    @GetMapping("/")
    public ModelAndView getList(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }


    @GetMapping("/book")
    public List<Book> getTodosOsLivros(){
        return bookRepository.findAll();
    }

    @GetMapping("/book/{id}")
    public List<Book> getLivroPelaId(@PathVariable Long id) {
        return bookRepository.findById(id).stream().toList();
    }

    @PostMapping("/book")
    public Book salvarUmNovoLivro(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @DeleteMapping("/book/{id}")
    public void deletarUmBookPelaID(@PathVariable Long id){
        bookRepository.deleteById(id);
    }



}
