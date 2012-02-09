package com.mobiletao.ihatid.domain;

import android.location.Address;

/**
 * Created by IntelliJ IDEA.
 * User: lastimah
 * Date: 2/7/12
 * Time: 10:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Location {

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;


    
}
