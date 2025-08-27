package com.example.api;

import com.burukeyou.uniapi.http.annotation.HttpApi;
import com.burukeyou.uniapi.http.annotation.param.QueryPar;
import com.burukeyou.uniapi.http.annotation.request.GetHttpInterface;
import com.burukeyou.uniapi.http.annotation.request.PostHttpInterface;

@HttpApi(url = "http://localhost:8080/test")
public interface UserHttpApi {

    @GetHttpInterface("/hello")
    String getUser(@QueryPar("name") String param, @QueryPar("age") Integer id);

    @PostHttpInterface("/addUser")
    void addUser(@QueryPar("name") String param,
                 @QueryPar("age") Integer age,
                 @QueryPar("hometown") String hometown);
}
