package comMyproj.Test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactCrud extends JpaRepository<ContactTable, Long>{

}
