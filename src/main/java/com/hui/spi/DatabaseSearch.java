package com.hui.spi;

public class DatabaseSearch implements Search{

    @Override
    public void searchDoc() {
        System.out.println("数据搜索");
    }
}
