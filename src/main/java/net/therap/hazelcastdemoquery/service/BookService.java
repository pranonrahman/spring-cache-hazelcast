package net.therap.hazelcastdemoquery.service;

import lombok.RequiredArgsConstructor;
import net.therap.hazelcastdemoquery.model.Book;
import net.therap.hazelcastdemoquery.reposiroty.BookRepository;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author raianrahman
 * @since 5/8/23
 */
@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    @CachePut(value = "books", key = "#book.id")
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Cacheable(key = "#id", cacheNames = {"books"})
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
