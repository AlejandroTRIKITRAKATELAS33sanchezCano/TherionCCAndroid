package com.example.projecttherion.Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projecttherion.Modelos.Negocio;
import com.example.projecttherion.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NegocioAdaptador extends RecyclerView.Adapter<NegocioAdaptador.NegocioHolder> {

    private List<Negocio> negocios;

    public NegocioAdaptador(List<Negocio> negocios){
        this.negocios = negocios;
    }

    public List<Negocio> getNegocios() {
        return negocios;
    }

    public void setNegocios(List<Negocio> negocios) {
        this.negocios = negocios;
    }

    @NonNull
    @Override
    public NegocioHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.negocio, parent, false);
        return new NegocioHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull NegocioHolder holder, int position) {

        System.out.println("Holis");

        Negocio negocio = negocios.get(position);
        System.out.println(negocio.getNeNombre());
        holder.nombre.setText(negocio.getNeNombre());
        System.out.println(negocio.isNeActivo());
        holder.activo.setText("Activo: " + negocio.isNeActivo());

        // Cargar imagen desde la URL usando Picasso
        Picasso.get().load(negocio.getNeImagen()).into(holder.imagenNegocio);
        System.out.println(negocio.getNeImagen());
    }

    @Override
    public int getItemCount() {
        return negocios.size();
    }

    public static class NegocioHolder extends RecyclerView.ViewHolder {

        TextView nombre, telefono, activo;
        ImageView imagenNegocio;

        public NegocioHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombreNegocio);
            activo = itemView.findViewById(R.id.activoNegocio);
            imagenNegocio = itemView.findViewById(R.id.imagenNegocio);
        }
    }
}
