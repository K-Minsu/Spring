package com.example.umbrella_mongoDB.umbreallaInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreDTO {

    private String id;
    private String name;
    private String address;
    private int umbrellaCount;
}
