package com.example.Restdemodoc.Model;

public class CloudVendor {
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;
    // emptyConstructor
    
    public CloudVendor(){

    }
     //parameterized connection
    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
      //getters and setters
    public String getVendorId() {
        return vendorId;
    }
    public String getVendorName() {
        return vendorName;
    }
    public String getVendorAddress() {
        return vendorAddress;
    }
    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
      //tostring()
    @Override
    public String toString() {
        return "CloudVendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
                + ", vendorPhoneNumber=" + vendorPhoneNumber + "]";
    }
      
}
