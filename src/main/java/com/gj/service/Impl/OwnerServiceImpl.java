package com.gj.service.Impl;

import com.gj.mapper.OwnerMapper;
import com.gj.pojo.HeTong;
import com.gj.pojo.HouseList;
import com.gj.pojo.Paid;
import com.gj.service.OwnerService;

import java.util.List;

public class OwnerServiceImpl implements OwnerService {
    private OwnerMapper ownerMapper;

    public void setOwnerMapper(OwnerMapper ownerMapper) {
        this.ownerMapper = ownerMapper;
    }

    @Override
    public HouseList fidnById(int id) {
        return ownerMapper.fidnById(id);
    }

    @Override
    public List<HouseList> findAll() {
        return ownerMapper.findAll();
    }

    @Override
    public int deleteHouseById(int id) {
        return ownerMapper.deleteHouseById(id);
    }

    @Override
    public int updateHouse(HouseList houseList) {
        return ownerMapper.updateHouse(houseList);
    }

    @Override
    public int addHouse(HouseList houseList) {
        return ownerMapper.addHouse(houseList);
    }

    @Override
    public List<HouseList> notLet() {
        return ownerMapper.notLet();
    }

    @Override
    public List<HouseList> rented() {
        return ownerMapper.rented();
    }

    @Override
    public int insertHeTong(HeTong heTong) {
        return ownerMapper.insertHeTong(heTong);
    }

    @Override
    public List<HeTong> findAllHetong() {
        return ownerMapper.findAllHetong();
    }

    @Override
    public int deleteHetongById(int id) {
        return ownerMapper.deleteHetongById(id);
    }

    @Override
    public HeTong findById(int id) {
        return ownerMapper.findById(id);
    }

    @Override
    public int updateHeTong(HeTong heTong) {
        return ownerMapper.updateHeTong(heTong);
    }

    @Override
    public List<Paid> findAllPaid() {
        return ownerMapper.findAllPaid();
    }

    @Override
    public List<Paid> findUnPaid() {
        return ownerMapper.findUnPaid();
    }

    @Override
    public List<Paid> findInPaid() {
        return ownerMapper.findInPaid();
    }

    @Override
    public int insertPaid(Paid paid) {
        return ownerMapper.insertPaid(paid);
    }

    @Override
    public Paid findByPaidId(int id) {
        return ownerMapper.findByPaidId(id);
    }

    @Override
    public int updatePaid(Paid paid) {
        return ownerMapper.updatePaid(paid);
    }

    @Override
    public int selectHouseCount() {
        return ownerMapper.selectHouseCount();
    }

    @Override
    public List<HouseList> findPage(int start, int pageSize) {
        return ownerMapper.findPage(start, pageSize);
    }

    @Override
    public int selectHetongCount() {
        return ownerMapper.selectHetongCount();
    }

    @Override
    public List<HeTong> findPageHetong(int start, int pageSize) {
        return ownerMapper.findPageHetong(start, pageSize);
    }

    @Override
    public int selectRentedCount() {
        return ownerMapper.selectRentedCount();
    }

    @Override
    public List<HouseList> findPageRented(int start, int pageSize) {
        return ownerMapper.findPageRented(start, pageSize);
    }

    @Override
    public int selectNotletCount() {
        return ownerMapper.selectNotletCount();
    }

    @Override
    public List<HouseList> findPageNotlet(int start, int pageSize) {
        return ownerMapper.findPageNotlet(start, pageSize);
    }

    @Override
    public int selectPaidCount() {
        return ownerMapper.selectPaidCount();
    }

    @Override
    public List<Paid> findPagePaid(int start, int pageSize) {
        return ownerMapper.findPagePaid(start, pageSize);
    }

    @Override
    public int selectUnpaidCount() {
        return ownerMapper.selectUnpaidCount();
    }

    @Override
    public List<Paid> findPageUnpaid(int start, int pageSize) {
        return ownerMapper.findPageUnpaid(start, pageSize);
    }

    @Override
    public int selectInpaidCount() {
        return ownerMapper.selectInpaidCount();
    }

    @Override
    public List<Paid> findPageInpaid(int start, int pageSize) {
        return ownerMapper.findPageInpaid(start, pageSize);
    }


}
