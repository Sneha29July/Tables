package Table.Table.entity;


import Table.Table.dto.DtoTable;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="menu_tables")
public class Tables {
    @Id
    @Column(name="menu_name")
    private String menu_name;
    @Column(name="price")
    private float price;
    @Column(name="starts_on")
    private Date starts_on;
    @Column(name="ends_on")
    private Date ends_on;
    @Column(name="type")
    private String type;
    @Column(name="gst")
    private float gst;

    public static Tables convertDtoToDao(DtoTable dtoTable) {
        DtoTable doc = new DtoTable();

        doc.setMenu_name(dtoTable.getMenu_name());
        doc.setPrice(dtoTable.getPrice());
        doc.setGst(dtoTable.getGst());
        doc.setStarts_on(dtoTable.getStarts_on());
        doc.setEnds_on(dtoTable.getEnds_on());
        doc.setType(dtoTable.getType());
        return doc;
    }

}
