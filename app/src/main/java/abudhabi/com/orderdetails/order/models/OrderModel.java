package abudhabi.com.orderdetails.order.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("fine")
    @Expose
    private Object fine;
    @SerializedName("order_time")
    @Expose
    private String orderTime;
    @SerializedName("accept_time")
    @Expose
    private Object acceptTime;
    @SerializedName("delivred_time")
    @Expose
    private String delivredTime;
    @SerializedName("status_id")
    @Expose
    private Integer statusId;
    @SerializedName("user_drvie_id")
    @Expose
    private Integer userDrvieId;
    @SerializedName("is_paid")
    @Expose
    private Boolean isPaid;
    @SerializedName("is_delivred")
    @Expose
    private Boolean isDelivred;
    @SerializedName("cancel_reason")
    @Expose
    private String cancelReason;
    @SerializedName("is_canceled")
    @Expose
    private Boolean isCanceled;
    @SerializedName("is_scheduled")
    @Expose
    private Boolean isScheduled;
    @SerializedName("cancel_date")
    @Expose
    private Object cancelDate;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("cost")
    @Expose
    private Integer cost;
    @SerializedName("distance")
    @Expose
    private Integer distance;
    @SerializedName("details")
    @Expose
    private List<Object> details = null;
    @SerializedName("atthment")
    @Expose
    private List<Atthment> atthment = null;
    @SerializedName("delivered_location")
    @Expose
    private List<DeliveredLocation> deliveredLocation = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getFine() {
        return fine;
    }

    public void setFine(Object fine) {
        this.fine = fine;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Object getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Object acceptTime) {
        this.acceptTime = acceptTime;
    }

    public String getDelivredTime() {
        return delivredTime;
    }

    public void setDelivredTime(String delivredTime) {
        this.delivredTime = delivredTime;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getUserDrvieId() {
        return userDrvieId;
    }

    public void setUserDrvieId(Integer userDrvieId) {
        this.userDrvieId = userDrvieId;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Boolean getIsDelivred() {
        return isDelivred;
    }

    public void setIsDelivred(Boolean isDelivred) {
        this.isDelivred = isDelivred;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Boolean getIsCanceled() {
        return isCanceled;
    }

    public void setIsCanceled(Boolean isCanceled) {
        this.isCanceled = isCanceled;
    }

    public Boolean getIsScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(Boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    public Object getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Object cancelDate) {
        this.cancelDate = cancelDate;
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

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public List<Object> getDetails() {
        return details;
    }

    public void setDetails(List<Object> details) {
        this.details = details;
    }

    public List<Atthment> getAtthment() {
        return atthment;
    }

    public void setAtthment(List<Atthment> atthment) {
        this.atthment = atthment;
    }

    public List<DeliveredLocation> getDeliveredLocation() {
        return deliveredLocation;
    }

    public void setDeliveredLocation(List<DeliveredLocation> deliveredLocation) {
        this.deliveredLocation = deliveredLocation;
    }

}