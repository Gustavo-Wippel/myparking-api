package com.myparking.api.parking.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
//TODO: Inserir multi-idioma
public record ParkingCheckinRequest(
        @NotNull(message = "Marca é obrigatória")
        @Positive
        Integer brandId,

        @NotBlank(message = "Modelo é obrigatório")
        String carModel,

        @NotBlank(message = "Placa do veículo obrigatória")
        String licensePlate



) {}
