package com.fmt.catalog.model;

import lombok.Data;

@Data
public class IdentificadorAluno {
    private Integer idAluno;

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }
}
