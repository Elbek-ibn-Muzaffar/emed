package com.juniper.emed.payload;

import com.juniper.emed.entity.CaseCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeseaseDto {
    private Long id;

    private String nameRu;

    private String nameUz;

    private String nameUk;

    private Long categoryId;
}
