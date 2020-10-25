package com.example.flowermobile.utils;
public class ConfigAPI {
    public  static final String BASE_URL = "http://172.16.1.87:8080/api/v1/";
    public interface Api {
        String LOGIN  = "accounts/login";
        String GETALLCATEGORY = "category/getall";
        String GETALLPRODUCT = "products";
        String GETPRODUCTBYCATEID = "products/category/{id}";
        String CREATEORDER = "orders";
        String GETALLSTORE = "stores";
        String GETALLORDER = "orders";
    }
}
