package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceiptItem;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceiptItemId;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.GoodsReceiptItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
public class GoodsReceiptItemController {

    @Autowired
    GoodsReceiptItemRepository goodsReceiptItemRepository;

    @GetMapping("/goodsReceiptItems")
    public Iterable<GoodsReceiptItem> index(){
        return goodsReceiptItemRepository.findAll();
    }

    @PostMapping("/goodsReceiptItem/{goodsReceiptId}")
    public GoodsReceiptItem create(@PathVariable(value="goodsReceiptId") int goodsReceiptId, @RequestBody GoodsReceiptItem goodsReceiptItem){
       int itemId =  goodsReceiptItem.getGoodsReceiptItemId().getItemId();
       int quantity =  goodsReceiptItem.getQuantity();
        GoodsReceiptItemId goodsReceiptItemId1 = new GoodsReceiptItemId(goodsReceiptId,itemId);
        return goodsReceiptItemRepository.save(new GoodsReceiptItem(goodsReceiptItemId1, quantity));
    }
}
