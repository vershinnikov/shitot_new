package com.shitot;

import com.shitot.model.*;

import java.lang.reflect.Array;
import java.time.DayOfWeek;
import java.util.*;

/**
 * Created by Next on 12.07.2016.
 */
public class main {
    private static final List<Doctor> DOCTORS = Arrays.asList(
    );

    public static void main(String[] args) {

    }

    private static void createSchedule(Doctor doc) {
    }

    private static void addClinic(Doctor doc, Clinic clinic) {
        for (Clinic c : doc.getClinics()) {
            if (clinic.getCity().equals(c.getCity())) {
                System.out.println("Can't add clinic. City.");
                return;
            }
        }
//        doc.getClinics().stream().forEach();
    }
}
