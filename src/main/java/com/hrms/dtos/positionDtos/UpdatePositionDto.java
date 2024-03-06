package com.hrms.dtos.positionDtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePositionDto {

    @Min(value = 1, message = "Lütfen pozitif bir Id değeri girin.")
    private int positionId;

    @Size(min = 3, message = "Pozisyon adı minimum üç karakter uzunluğunda olmalı")
    @NotBlank(message = "Pozisyon adı alanı zorunludur.")
    @NotNull(message = "Pozisyon adı alanı zorunludur.")
    private String positionName;
}
