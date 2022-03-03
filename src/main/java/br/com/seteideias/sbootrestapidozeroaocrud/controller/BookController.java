package br.com.seteideias.sbootrestapidozeroaocrud.controller;

import br.com.seteideias.sbootrestapidozeroaocrud.entity.Book;
import br.com.seteideias.sbootrestapidozeroaocrud.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController(value = "")
@AllArgsConstructor
public class BookController {

    BookRepository bookRepository;
//
//    @GetMapping("/")
//    public String getList(){
//        String mv = "ola";
//        return mv;
//    }

    @GetMapping("/list")
    public ModelAndView getList2() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @GetMapping("/book")
    public List<Book> getTodosOsLivros() {
        return bookRepository.findAll();
    }

    @GetMapping("/book/{id}")
    public List<Book> getLivroPelaId(@PathVariable Long id) {
        return bookRepository.findById(id).stream().toList();
    }

    @PostMapping("/book/cadastro")
    public Book saveNewBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @DeleteMapping("/book/{id}")
    public void deletaBookByID(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }


}
