package Table.Table.repository;

import Table.Table.entity.Tables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TableRepository extends JpaRepository<Tables,Long> {
    @Transactional
    @Query(value = "select * from table where menu_name=? and price=? and type=?",nativeQuery = true)
    List<Tables> findByMenu_namePriceAndType(String menu_name, String price, String type);
}
