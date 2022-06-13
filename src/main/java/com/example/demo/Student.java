package com.example.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Student {
    @Id
    private Long id;

    private String code;
    private String name;
    private String gender;
    private LocalDate birthday;
    private String address;

    private String remark;
    private boolean active;

    @ReadOnlyProperty
    private LocalDateTime createdAt;
    private String createdBy;

    @ReadOnlyProperty
    private LocalDateTime updatedAt;
    private String updatedBy;
}
