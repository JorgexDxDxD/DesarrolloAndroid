package Modelo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class UbicacionMiaPrro implements Serializable{
    private double longitud;
    private double latitud;

    public UbicacionMiaPrro(){

    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

}
