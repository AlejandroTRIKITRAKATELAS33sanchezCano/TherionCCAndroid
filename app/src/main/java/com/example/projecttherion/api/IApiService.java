package com.example.projecttherion.api;

import com.example.projecttherion.DTO.AuthResponse;
import com.example.projecttherion.DTO.ClientRequest;
import com.example.projecttherion.DTO.DuennoRequest;
import com.example.projecttherion.DTO.LoginRequest;
import com.example.projecttherion.Modelos.Negocio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface IApiService {

    //Dueños
    @POST("auth/duenno/registrar") // Registrar Dueño
    Call<AuthResponse> registrarDuenno(@Body DuennoRequest duennoRequest);

    @POST("auth/duenno/login") //Logear Dueño
    Call<AuthResponse> loginDuenno(@Body LoginRequest loginRequest);

    @GET("api/v1/Negocio/ConsultarxDuenno")
    Call<List<Negocio>> consultarNegocios(@Header("Authorization") String token);

    //Cliente
    @POST("auth/cliente/registrar") //Registrar Cliente
    Call<AuthResponse> registrarClient(@Body ClientRequest clientRequest);

    @POST("auth/cliente/login") //Logear Dueño
    Call<AuthResponse> loginClient(@Body LoginRequest loginRequest);

}
