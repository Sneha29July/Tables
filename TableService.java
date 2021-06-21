package Table.Table.service;

import Table.Table.dto.DtoTable;
import Table.Table.entity.Tables;
import Table.Table.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class TableService {
    @Autowired
    private TableRepository tableRepository;
public List<Tables> findByMenu_namePriceAndType(String menu_name, String price, String type){
    List<Tables> access=new ArrayList<>();
    try{
        List<Tables> byId=tableRepository.findByMenu_namePriceAndType(menu_name,type,price);
        return byId;
    }catch (Exception e){
        e.printStackTrace();
    }
    return access;
}
public DtoTable create(DtoTable dtoTable){
    try{
        Tables requestBody=Tables.convertDtoToDao(dtoTable);
        Tables tables1=tableRepository.save(requestBody);
        if(Objects.nonNull(tables1))
            return DtoTable.convertDaoToDto(tables1);
    }catch (Exception e){
        e.printStackTrace();
    }
    return  dtoTable;
}
}
