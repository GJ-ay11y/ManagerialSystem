package com.gj.mapper;

import com.gj.pojo.HeTong;
import com.gj.pojo.HouseList;
import com.gj.pojo.Paid;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OwnerMapper {
    HouseList fidnById(@Param("id") int id);
    List<HouseList> findAll();
    int deleteHouseById(@Param("id") int id);
    int updateHouse(HouseList houseList);
    int addHouse(HouseList houseList);
    //未出租
    List<HouseList> notLet();
    //已出租
    List<HouseList> rented();
    //新增合同
    int insertHeTong(HeTong heTong);
    //查询所有合同
    List<HeTong> findAllHetong();
    //删除合同
    int deleteHetongById(@Param("id") int id);
    //更改合同
    HeTong findById(@Param("id") int id);
    int updateHeTong(HeTong heTong);

    //租金
    //所有信息
    List<Paid> findAllPaid();
    //未缴租金
    List<Paid> findUnPaid();
    //已缴租金
    List<Paid> findInPaid();
    //添加收租信息
    int insertPaid(Paid paid);
    //修改信息
    Paid findByPaidId(@Param("id") int id);
    int updatePaid(Paid paid);

    //分页
    //房屋列表
    int selectHouseCount();
    List<HouseList> findPage(@Param("start") int start, @Param("pageSize") int pageSize);
    //合同列表、
    int selectHetongCount();
    List<HeTong> findPageHetong(@Param("start") int start, @Param("pageSize") int pageSize);
    //已租列表
    int selectRentedCount();
    List<HouseList> findPageRented(@Param("start") int start, @Param("pageSize") int pageSize);
    //未租列表
    int selectNotletCount();
    List<HouseList> findPageNotlet(@Param("start") int start, @Param("pageSize") int pageSize);
    //租金列表
    int selectPaidCount();
    List<Paid> findPagePaid(@Param("start") int start, @Param("pageSize") int pageSize);
    //未缴租金列表
    int selectUnpaidCount();
    List<Paid> findPageUnpaid(@Param("start") int start, @Param("pageSize") int pageSize);
    //已缴租金列表
    int selectInpaidCount();
    List<Paid> findPageInpaid(@Param("start") int start, @Param("pageSize") int pageSize);
}
