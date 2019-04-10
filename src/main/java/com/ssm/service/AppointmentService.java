package com.ssm.service;

import com.ssm.dao.form.AppointmentForm;
import com.ssm.pojo.Appointment;

public interface AppointmentService {
    int appoint(AppointmentForm record);
    int returnBook(Appointment record);
}
