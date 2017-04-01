package abudhabi.com.orderdetails.order.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeliveredLocation {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("latitude")
    @Expose
    private String latitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

}