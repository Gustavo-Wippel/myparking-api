package com.myparking.api.parking;

import com.myparking.api.parking.dto.ParkingCheckinRequest;
import jakarta.validation.Valid;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/parking")
@RestController
public class ParkingController {

    //TODO: Estruturar o retorno dos erros, definir classe padrão de exception e como tratar erros de api corretamente de acordo com status code
    @PostMapping("checkin")
    public ResponseEntity<?> checkin(@Valid @RequestBody ParkingCheckinRequest body) {
        return null;
    };


}
