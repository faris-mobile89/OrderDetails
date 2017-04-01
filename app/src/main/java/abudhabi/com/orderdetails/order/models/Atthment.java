package abudhabi.com.orderdetails.order.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Atthment {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("file_path")
    @Expose
    private String filePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}