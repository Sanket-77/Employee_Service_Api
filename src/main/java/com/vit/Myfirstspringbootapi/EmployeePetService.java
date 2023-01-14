package com.vit.Myfirstspringbootapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeePetService {

    @Autowired
    RestTemplate restTemplate;

    public String getAllPetInfoWithStatusAs(String status) {
        ResponseEntity<Object> responseEntity = restTemplate.getForEntity( "/v2/pet/findByStatus?status=" +status,Object.class);
        return String.valueOf(responseEntity.getBody());
    }
}
