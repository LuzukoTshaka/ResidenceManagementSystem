package com.systemsmart.repository.impl;

import com.systemsmart.entity.Facility;
import com.systemsmart.factory.FacilityFactory;
import com.systemsmart.repository.FacilityRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacilityRepositoryImplTest {

    private static FacilityRepository repository = FacilityRepositoryImpl.getRepository();
    private Facility facility = FacilityFactory.createFacility("234555",true,true,true,
             true,true,true,true,"pre-paid electricity meter");


    @Test
    public void a_create() {

        Facility create = repository.create(facility);
        Assert.assertEquals(facility.getFacilityID(),create.getFacilityID());
        System.out.println("create: "+ create);   }

    @Test
    public void b_read() {

        Facility read = repository.read(facility.getFacilityID());
        System.out.println("Read: "+ read);
    }

    @Test
    public void c_update() {
         Facility update = new Facility.Builder().copy(facility).setDisabledFriendly(false).build();
         update = repository.update(update);
         System.out.println("update: "+ update);
    }

    @Test
    public void e_delete() {

        boolean deleted = repository.delete(facility.getFacilityID());
        Assert.assertTrue(deleted);
    }

    @Test
    public void d_getAll() {

        System.out.println("Get All: "+ repository.getAll());
    }
}