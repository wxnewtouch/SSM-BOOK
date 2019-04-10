package com.ssm.dao.form;

import com.ssm.pojo.Appointment;

public class AppointmentForm extends Appointment {
    private String holdDay;

    @Override
    public String toString() {
        return "AppointmentForm{" +
                "holdDay='" + holdDay + '\'' +
                '}';
    }

    public String getHoldDay() {
        return holdDay;
    }

    public void setHoldDay(String holdDay) {
        this.holdDay = holdDay;
    }
}
