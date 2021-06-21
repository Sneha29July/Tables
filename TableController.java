package Table.Table.controller;

import Table.Table.dto.DtoTable;
import Table.Table.entity.Tables;
import Table.Table.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TableController {
    @Autowired
    private TableService tableService;
    @GetMapping("/menu_tables/getById")
    public ResponseEntity<List<Tables>> getTablesDetailsByMenu_namePriceAndType(@RequestParam("menu_name")String menu_name,@RequestParam("price") String price,@RequestParam("type")String type){
        try{
            List<Tables> tablesProfile=tableService.findByMenu_namePriceAndType(menu_name,price,type);
            return new ResponseEntity(tablesProfile, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/menu_tables/create")
    public ResponseEntity<Tables> create(@RequestBody DtoTable dtoTable){
        try{
DtoTable dtoTable1=tableService.create(dtoTable);
return new ResponseEntity(dtoTable1,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
