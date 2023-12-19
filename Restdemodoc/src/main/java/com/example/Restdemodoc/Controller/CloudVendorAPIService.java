package com.example.Restdemodoc.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Restdemodoc.Model.CloudVendor;

@RestController
@RequestMapping("/vendordetails")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor
    getCloudVendorDetails(String vendorId)
    {
        // return new CloudVendor("C1","Name-1","Address-1","Number-1");
        return cloudVendor;
    }
    @PostMapping
    public String postCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor added sucessfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
    this.cloudVendor=cloudVendor;
    return "Cloud vendor Updated Sucessfully";
    }
     @DeleteMapping
    public String deleteCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
    this.cloudVendor=null;
    return "Cloud vendor Deleted Sucessfully";
    }
}
