package com.example.chanakya.retrofitclseg1.network;

import com.example.chanakya.retrofitclseg1.model.Employee;
import com.example.chanakya.retrofitclseg1.model.EmployeeResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by chanakya on 2/21/18.
 */
//End Point
public interface EmployeeService {

    @GET("retrofit-demo.php")
      Call<EmployeeResponse> getEmployeeDetails(@Query("company_no") int company_no);



}
