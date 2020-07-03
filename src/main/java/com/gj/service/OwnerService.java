package com.gj.service;

import com.gj.pojo.HeTong;
import com.gj.pojo.HouseList;
import com.gj.pojo.Paid;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OwnerService {
    HouseList fidnById(int id);
    List<HouseList> findAll();
    int deleteHouseById(@Param("id") int id);
    int updateHouse(HouseList houseList);
    int addHouse(HouseList houseList);
    List<HouseList> notLet();
    List<HouseList> rented();
    //新增合同
    int insertHeTong(HeTong heTong);
    //查询所有合同
    List<HeTong> findAllHetong();
    //删除合同
    int deleteHetongById(int id);
    //更改合同
    HeTong findById(int id);
    int updateHeTong(HeTong heTong);

    //租金
    List<Paid> findAllPaid();
    List<Paid> findUnPaid();
    //已缴租金
    List<Paid> findInPaid();
    //添加收租信息
    int insertPaid(Paid paid);
    //修改信息
    Paid findByPaidId(int id);
    int updatePaid(Paid paid);

    //分页
    //房屋列表
    int selectHouseCount();
    List<HouseList> findPage(int start, int pageSize);
    //合同列表
    int selectHetongCount();
    List<HeTong> findPageHetong(int start, int pageSize);
    //已租列表
    int selectRentedCount();
    List<HouseList> findPageRented(int start, int pageSize);
    //未租列表
    int selectNotletCount();
    List<HouseList> findPageNotlet(int start, int pageSize);
    //租金列表
    int selectPaidCount();
    List<Paid> findPagePaid(int start, int pageSize);
    //未缴租金列表
    int selectUnpaidCount();
    List<Paid> findPageUnpaid(int start, int pageSize);
    //已缴租金列表
    int selectInpaidCount();
    List<Paid> findPageInpaid(int start, int pageSize);
}
