package com.getir.demoproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
}
