package dao;

import model.co_inv_his_apply;

public interface co_inv_his_applyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(co_inv_his_apply record);

    int insertSelective(co_inv_his_apply record);

    co_inv_his_apply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(co_inv_his_apply record);

    int updateByPrimaryKey(co_inv_his_apply record);
}