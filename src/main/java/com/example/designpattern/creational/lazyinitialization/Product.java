package com.example.designpattern.creational.lazyinitialization;

import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

@ToString(doNotUseGetters = true)
@Getter
public class Product {

   private ComplexPart complexPart;
    private SimplePart simplePart;

    public Product() {
        simplePart = new SimplePart("Initialized");
    }
    public ComplexPart getComplexPart() {

        if (this.complexPart == null) {
            this.complexPart =new ComplexPart();
        }
        return complexPart;
    }

}
