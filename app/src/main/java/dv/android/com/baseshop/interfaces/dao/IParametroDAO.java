package dv.android.com.baseshop.interfaces.dao;

import java.util.List;

import dv.android.com.baseshop.dto.ParametroDTO;

public interface IParametroDAO {
    ParametroDTO findByPk(ParametroDTO entity)throws Exception;
    List<ParametroDTO> findByAll()throws Exception;
}
