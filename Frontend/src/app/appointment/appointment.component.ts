import { Component, OnInit } from '@angular/core';
import { Appointment } from '../common/appointment';
import { AppointmentService } from '../services/appointment.service';

@Component({
  selector: 'app-appointment',
  templateUrl: './appointment.component.html',
  styleUrls: ['./appointment.component.css']
})
export class AppointmentComponent implements OnInit {

  constructor(private service: AppointmentService) { }

  ngOnInit(): void {
    this.service.getAppointment(localStorage.getItem("userId")).subscribe(ans=>{
      console.log(ans);
      this.appointment=ans;
    })
  }

  appointment!: Appointment[]


}
