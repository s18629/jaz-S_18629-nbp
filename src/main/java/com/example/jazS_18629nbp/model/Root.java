package com.example.jazS_18629nbp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Root {
        public String table;
        public String currency;
        public String code;
        public List<Rate> rates;
    }
