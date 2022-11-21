package com.example.datarest.Controller;

import com.example.datarest.Entity.Maxsulot;
import com.example.datarest.Repository.MaxsulotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MaxsulotController {
//
//    @Autowired
//    MaxsulotRepository maxsulotRepository;
//
//    @RequestMapping(value = "/joylash",method = RequestMethod.POST)
//    public  String Joylash(@RequestBody Maxsulot maxsulot){
//        Maxsulot maxsulot1=new Maxsulot();
//        maxsulot1.setMaxsulotNomi(maxsulot.getMaxsulotNomi());
//        maxsulot1.setMaxsulotNarxi(maxsulot.getMaxsulotNarxi());
//        maxsulot1.setMaxsulotModeli(maxsulot.getMaxsulotModeli());
//        maxsulot1.setMaxsulotSoni(maxsulot.getMaxsulotSoni());
//        maxsulotRepository.save(maxsulot1);
//        return "Malumot bazaga joylandi!";
//
//    }
//
//
//    @RequestMapping(value = "/oqishUmumiy",method = RequestMethod.GET)
//    public List<Maxsulot> Oqish(){
//        List<Maxsulot> all = maxsulotRepository.findAll();
//        return  all;
//    }
//
//    @RequestMapping(value = "/oqishId/{id}",method = RequestMethod.GET)
//    public Maxsulot Oqish1(@PathVariable Integer id){
//        Optional<Maxsulot> byId = maxsulotRepository.findById(id);
//        if(byId.isPresent()){
//            List<Maxsulot> all = maxsulotRepository.findAll();
//            for (Maxsulot maxsulot : all) {
//                return  maxsulot;
//            }
//        }
//        return null;
//    }
//
//    @RequestMapping(value = "/edit/{id}",method = RequestMethod.PUT)
//    public String Edit(@RequestBody Maxsulot maxsulot, @PathVariable Integer id){
//        Optional<Maxsulot> byId = maxsulotRepository.findById(id);
//        if(!byId.isPresent()) return "Bunday maxsulot yoq";
//        Maxsulot maxsulot1=byId.get();
//        maxsulot1.setMaxsulotNomi(maxsulot.getMaxsulotNomi());
//        maxsulot1.setMaxsulotNarxi(maxsulot.getMaxsulotNarxi());
//        maxsulot1.setMaxsulotModeli(maxsulot.getMaxsulotModeli());
//        maxsulot1.setMaxsulotSoni(maxsulot.getMaxsulotSoni());
//        maxsulotRepository.save(maxsulot1);
//        return "Tahrirlandi";
//
//    }
//
//
//
//    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
//    public  String Delete(@PathVariable Integer id){
//        Optional<Maxsulot> byId = maxsulotRepository.findById(id);
//        if(!byId.isPresent())  return "Bunday maxsulot yoq!";
//            Maxsulot maxsulot=byId.get();
//            maxsulotRepository.delete(maxsulot);
//            return  "Malumot o'chirildi!";
//    }
}
