package com.demo.jsonreader.model;

import lombok.Data;

import java.util.List;

@Data
public class Roots {
    List<Root> roots;

    public Roots(List<Root> roots) {
        this.roots = roots;
    }
}
