package com.example.chanakya.retrofitclseg1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.chanakya.retrofitclseg1.model.Employee;
import com.example.chanakya.retrofitclseg1.model.EmployeeResponse;
import com.example.chanakya.retrofitclseg1.network.EmployeeService;
import com.example.chanakya.retrofitclseg1.network.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

 //   "http://navjacinth9.000webhostapp.com/json/retrofit-demo.php?company_no=100";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmployeeService service = RetrofitInstance.getRetrofitInstance().create(EmployeeService.class);

        Call<EmployeeResponse> call = service.getEmployeeDetails(100);

      call.enqueue(new Callback<EmployeeResponse>() {
          @Override
          public void onResponse(Call<EmployeeResponse> call, Response<EmployeeResponse> response) {
            Log.e("Response",response.raw().toString());
              //  Log.e("Response",response.body().getEmployeeArrayList().get(0).getName());
          }

          @Override
          public void onFailure(Call<EmployeeResponse> call, Throwable t) {
            Log.e("Failure",t.getMessage());
          }
      });
    }
}
