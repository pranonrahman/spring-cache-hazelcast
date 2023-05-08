package net.therap.hazelcastdemoquery.reposiroty;

import net.therap.hazelcastdemoquery.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author raianrahman
 * @since 5/8/23
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
