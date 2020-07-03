package com.gj.controller;

import com.gj.pojo.HeTong;
import com.gj.pojo.HouseList;
import com.gj.pojo.Paid;
import com.gj.service.OwnerService;
import com.gj.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/page")
@Controller
public class OwnerController {
    //controller调用service
    @Autowired
    @Qualifier("OwnerServiceImpl")
    private OwnerService ownerService;

    //房源显示
    @RequestMapping("/houselist")
    public String list(Model model, Integer pageNum){
//        List<HouseList> list = ownerService.findAll();
//        model.addAttribute("list", list);

        PageUtils pageUtils = new PageUtils();
        if (pageNum == null){
            pageNum = 1;
        }
        pageUtils.setPageNum(pageNum);
        int total = ownerService.selectHouseCount();
        pageUtils.setTotal(total);
        int i = total/5;
        if (total % 5 == 0){
            pageUtils.setPages(i);
        }else {
            pageUtils.setPages(i+1);
        }
        System.out.println(pageUtils.getPages());
        List<HouseList> list = ownerService.findPage((pageNum-1 )* 5, 5);
        pageUtils.setList(list);
        System.out.println(pageUtils);
        model.addAttribute("p",pageUtils);
        return "houselist";
    }
    //删除
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        ownerService.deleteHouseById(id);
        return "redirect:/page/houselist";
    }
    //修改房源信息
    @RequestMapping("/toUpdate")
    public String toUpdateHouse(Model model, int id){
        HouseList houseList = ownerService.fidnById(id);
        model.addAttribute("house",houseList);
        return "updateHouse";
    }
    @RequestMapping("/update")
    public String updateHouse(Model model, HouseList houseList){
        System.out.println(houseList);
        ownerService.updateHouse(houseList);
        HouseList house = ownerService.fidnById(houseList.getId());
        model.addAttribute("house", house);
        return "redirect:/page/houselist";
    }
    //增加房源
    @RequestMapping("/toadd")
    public String toAddHouse(){
        return "addhouse";
    }
    @RequestMapping("/addhouse")
    public String addHouse(HouseList houseList){
        ownerService.addHouse(houseList);
        return "redirect:/page/houselist";
    }
    //在租房源显示
    @RequestMapping("/notLet")
    public String notLet(Model model, Integer pageNum){
//        List<HouseList> list = ownerService.notLet();
//        model.addAttribute("list", list);
        PageUtils pageUtils = new PageUtils();
        if (pageNum == null){
            pageNum = 1;
        }
        pageUtils.setPageNum(pageNum);
        int total = ownerService.selectNotletCount();
        pageUtils.setTotal(total);
        int i = total/5;
        if (total % 5 == 0){
            pageUtils.setPages(i);
        }else {
            pageUtils.setPages(i+1);
        }
        List<HouseList> list = ownerService.findPageNotlet((pageNum-1 )* 5, 5);
        pageUtils.setList(list);
        model.addAttribute("p",pageUtils);
        return "notlet";
    }
    //已租房源显示
    @RequestMapping("/rented")
    public String rented(Model model, Integer pageNum){
//        List<HouseList> list = ownerService.rented();
//        model.addAttribute("list", list);
        PageUtils pageUtils = new PageUtils();
        if (pageNum == null){
            pageNum = 1;
        }
        pageUtils.setPageNum(pageNum);
        int total = ownerService.selectRentedCount();
        pageUtils.setTotal(total);
        int i = total/5;
        if (total % 5 == 0){
            pageUtils.setPages(i);
        }else {
            pageUtils.setPages(i+1);
        }
        List<HouseList> list = ownerService.findPageRented((pageNum-1 )* 5, 5);
        pageUtils.setList(list);
        model.addAttribute("p",pageUtils);
        return "rented";
    }
    //添加合同
    @RequestMapping("/toaddhetong")
    public String toAddHetong(){
        return "addhetong";
    }
    @RequestMapping("/addhetong")
    public String heTongYes(HeTong heTong){
        ownerService.insertHeTong(heTong);
        return "redirect:/page/hetonglist";
    }
    //查看所有合同
    @RequestMapping("/hetonglist")
    public String findHeTong(Model model, Integer pageNum){
//        List<HeTong> allHetong = ownerService.findAllHetong();
//        model.addAttribute("allHetong", allHetong);
        PageUtils pageUtils = new PageUtils();
        if (pageNum == null){
            pageNum = 1;
        }
        pageUtils.setPageNum(pageNum);
        int total1 = ownerService.selectHetongCount();
        pageUtils.setTotal(total1);
        int i = total1/5;
        if (total1 % 5 == 0){
            pageUtils.setPages(i);
        }else {
            pageUtils.setPages(i+1);
        }
        List<HeTong> list = ownerService.findPageHetong((pageNum-1 )* 5, 5);
        pageUtils.setList(list);
        model.addAttribute("p",pageUtils);
        return "hetonglist";
    }
    //删除合同
    @RequestMapping("/deletehetong/{id}")
    public String delhetong(@PathVariable("id") int id){
        ownerService.deleteHetongById(id);
        return "redirect:/page/hetonglist";
    }
    //修改合同信息
    @RequestMapping("/toUpdateHetong")
    public String toUpdateHetong(Model model, int id){
        HeTong heTong = ownerService.findById(id);
        model.addAttribute("heTong",heTong);
        return "updateHetong";
    }
    @RequestMapping("/updatehetong")
    public String updateHetong(Model model, HeTong heTong){
        ownerService.updateHeTong(heTong);
        HeTong tong = ownerService.findById(heTong.getId());
        model.addAttribute("heTong", tong);
        return "redirect:/page/hetonglist";
    }
    //详细合同信息
    @RequestMapping("/HetongMessage")
    public String hetongMessage(Model model, int id){
        HeTong heTong = ownerService.findById(id);
        model.addAttribute("heTong",heTong);
        return "hetongmessage";
    }

    //租金
    //所有信息
    @RequestMapping("/allpaid")
    public String allPaid(Model model, Integer pageNum){
//        List<Paid> allPaid = ownerService.findAllPaid();
//        model.addAttribute("allpaid", allPaid);
        PageUtils pageUtils = new PageUtils();
        if (pageNum == null){
            pageNum = 1;
        }
        pageUtils.setPageNum(pageNum);
        int total = ownerService.selectPaidCount();
        pageUtils.setTotal(total);
        int i = total/5;
        if (total % 5 == 0){
            pageUtils.setPages(i);
        }else {
            pageUtils.setPages(i+1);
        }
        List<Paid> list = ownerService.findPagePaid((pageNum-1 )* 5, 5);
        pageUtils.setList(list);
        model.addAttribute("p",pageUtils);
        return "paidlist";
    }
    //未交租
    @RequestMapping("/unpaid")
    public String unPaid(Model model, Integer pageNum){
//        List<Paid> unPaid = ownerService.findUnPaid();
//        model.addAttribute("unpaid", unPaid);
        PageUtils pageUtils = new PageUtils();
        if (pageNum == null){
            pageNum = 1;
        }
        pageUtils.setPageNum(pageNum);
        int total = ownerService.selectUnpaidCount();
        pageUtils.setTotal(total);
        int i = total/5;
        if (total % 5 == 0){
            pageUtils.setPages(i);
        }else {
            pageUtils.setPages(i+1);
        }
        List<Paid> list = ownerService.findPageUnpaid((pageNum-1 )* 5, 5);
        pageUtils.setList(list);
        model.addAttribute("p",pageUtils);
        return "unpaid";
    }
    //添加收租信息
    @RequestMapping("/toaddpaid")
    public String toAddPaid(){
        return "addpaid";
    }
    @RequestMapping("addpaid")
    public String addPaid(Paid paid){
        ownerService.insertPaid(paid);
        System.out.println(paid);
        return "redirect:/page/allpaid";
    }
    //修改信息
    @RequestMapping("/toupdatepaid")
    public String toUpdatePaid(Model model, int id){
        Paid byPaidId = ownerService.findByPaidId(id);
        System.out.println(byPaidId);
        model.addAttribute("byPaidId", byPaidId);
        return "updatepaid";
    }
    @RequestMapping("/updatepaid")
    public String updatePaid(Model model, Paid paid){
        System.out.println(paid);
        ownerService.updatePaid(paid);
        Paid byPaidid = ownerService.findByPaidId(paid.getId());
        model.addAttribute("list", byPaidid);
        return "redirect:/page/allpaid";
    }
    //已交租
    @RequestMapping("/inpaid")
    public String inPaid(Model model, Integer pageNum){
//        List<Paid> inPaid = ownerService.findInPaid();
//        model.addAttribute("inPaid", inPaid);
        PageUtils pageUtils = new PageUtils();
        if (pageNum == null){
            pageNum = 1;
        }
        pageUtils.setPageNum(pageNum);
        int total = ownerService.selectInpaidCount();
        pageUtils.setTotal(total);
        int i = total/5;
        if (total % 5 == 0){
            pageUtils.setPages(i);
        }else {
            pageUtils.setPages(i+1);
        }
        List<Paid> list = ownerService.findPageInpaid((pageNum-1 )* 5, 5);
        pageUtils.setList(list);
        model.addAttribute("p",pageUtils);
        return "inpaid";
    }
}