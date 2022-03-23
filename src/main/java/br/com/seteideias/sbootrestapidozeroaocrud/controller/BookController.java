//package br.com.seteideias.sbootrestapidozeroaocrud.controller;
//
//import br.com.seteideias.sbootrestapidozeroaocrud.entity.Book;
//import br.com.seteideias.sbootrestapidozeroaocrud.repository.BookRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController(value = "/")
//@AllArgsConstructor
//public class BookController {
//
//    @GetMapping("/oi")
//    public String oi(){
//        return "oi";
//    }
//
//    BookRepository bookRepository;
//
//    @GetMapping(path = "/list")
//    public List<Book> getTodosOsLivros() {
//
//        Book book = new Book();
//        book.setId(1L);
//        book.setAno(2000);
//        book.setAutorDoLivro("Carlos");
//        book.setNomeDoLivro("nome do livro");
//
//        Book book1 = new Book();
//        book.setId(2L);
//        book.setAno(2000);
//        book.setAutorDoLivro("Carlos");
//        book.setNomeDoLivro("nome do livro");
//
//        List<Book> listaDeLivros = new ArrayList<>();
//        listaDeLivros.add(book);
//        listaDeLivros.add(book1);
//
//        return listaDeLivros;
////        return bookRepository.findAll();
//    }
//
//    @GetMapping("/book/{id}")
//    public List<Book> getLivroPelaId(@PathVariable Long id) {
//        return bookRepository.findById(id).stream().toList();
//    }
//
//    @PostMapping("/book/cadastro")
//    public Book saveNewBook(@RequestBody Book book) {
//        return bookRepository.save(book);
//    }
//
//    @DeleteMapping("/book/{id}")
//    public void deletaBookByID(@PathVariable Long id) {
//        bookRepository.deleteById(id);
//    }
//
//
//}
