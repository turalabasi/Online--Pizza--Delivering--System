package model;

public class Courier {
    private long courierId;
    private String Name;
    private  String phoneNumber;
    private String vehicleType;
    private String vehiclePlate;
    private long customerId;
    private long orderId;

    private byte availabilityStatus;

    public Courier(long courierId, String name, String phoneNumber, String vehicleType, String vehiclePlate, long customerId, long orderId, byte availabilityStatus) {
        this.courierId = courierId;
        Name = name;
        this.phoneNumber = phoneNumber;
        this.vehicleType = vehicleType;
        this.vehiclePlate = vehiclePlate;
        this.customerId = customerId;
        this.orderId = orderId;
        this.availabilityStatus = availabilityStatus;
    }

    public long getCourierId() {
        return courierId;
    }

    public void setCourierId(long courierId) {
        this.courierId = courierId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public byte getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(byte availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "courierId=" + courierId +
                ", Name='" + Name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehiclePlate='" + vehiclePlate + '\'' +
                ", customerId=" + customerId +
                ", orderId=" + orderId +
                ", availabilityStatus=" + availabilityStatus +
                '}';
    }
}
