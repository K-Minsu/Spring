package com.example.umbrella_mongoDB.umbreallaInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stores")
public class StoreController {
    @Autowired
    private StoreService storeService;

    // 모든 가게 정보 조회
    @GetMapping
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }

    // id로 특정 가게 정보 조회
    @GetMapping("/{id}")
    public Store getStoreById(@PathVariable String id) {
        return storeService.getStoreById(id);
    }

    // 새로운 가게 정보 생성
    @PostMapping
    public Store createStore(@RequestBody Store store) {
        return storeService.createStore(store);
    }

    // 가게 정보 삭제
    @DeleteMapping("/{id}")
    public void deleteStore(@PathVariable String id) {
        storeService.deleteStore(id);
    }
}
