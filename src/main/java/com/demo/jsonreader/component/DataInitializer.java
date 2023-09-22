package com.demo.jsonreader.component;

import com.demo.jsonreader.model.Root;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Data
public class DataInitializer {
    List<Root> roots;

    @Autowired
    public DataInitializer() {
        try {

            String file = "json-data.json";
            String json = new String(Files.readAllBytes(Paths.get(file)));

            ObjectMapper mapper = new ObjectMapper();
            Root[] arrRoots = mapper.readValue(json, Root[].class);
            roots = new ArrayList<>(Arrays.asList(arrRoots));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
