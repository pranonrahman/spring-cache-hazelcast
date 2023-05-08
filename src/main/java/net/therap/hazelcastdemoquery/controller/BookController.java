package net.therap.hazelcastdemoquery.controller;

import lombok.RequiredArgsConstructor;
import net.therap.hazelcastdemoquery.model.Book;
import net.therap.hazelcastdemoquery.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author raianrahman
 * @since 5/8/23
 */

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getBook(@PathVariable Long id) {

        return ResponseEntity.ok(bookService.findById(id));
    }

    @GetMapping
    public ResponseEntity<?> getAllBooks() {
        return ResponseEntity.ok(bookService.findAll());
    }

    public ResponseEntity<?> saveBooks(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.save(book));
    }
}
