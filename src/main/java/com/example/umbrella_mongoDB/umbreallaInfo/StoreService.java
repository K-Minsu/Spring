package com.example.umbrella_mongoDB.umbreallaInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    public Store getStoreById(String id) {
        return storeRepository.findById(id).orElse(null);
    }

    public Store createStore(Store store) {
        return storeRepository.save(store);
    }

    public void deleteStore(String id) {
        storeRepository.deleteById(id);
    }
}
