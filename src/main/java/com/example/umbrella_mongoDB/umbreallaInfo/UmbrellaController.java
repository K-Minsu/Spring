package com.example.umbrella_mongoDB.umbreallaInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/umbrellas")
public class UmbrellaController {
    @Autowired
    private UmbrellaService umbrellaService;

    // 우산 개수 등록
    @PostMapping("/{storeId}")
    public ResponseEntity<StoreDTO> addUmbrellas(@PathVariable String storeId, @RequestParam int count) {
        StoreDTO storeDTO = umbrellaService.addUmbrellas(storeId, count);

        if (storeDTO != null) {
            return new ResponseEntity<>(storeDTO, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 우산 개수 수정
    @PutMapping("/{storeId}")
    public ResponseEntity<StoreDTO> updateUmbrellas(@PathVariable String storeId, @RequestParam int count) {
        StoreDTO storeDTO = umbrellaService.updateUmbrellas(storeId, count);

        if (storeDTO != null) {
            return new ResponseEntity<>(storeDTO, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
