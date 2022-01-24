import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';
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

  deleteAppointment(appointmentId: number){
    if( confirm("Are you sure you want to delete appointmentId :" +appointmentId)){
      this.service.deleteApp(appointmentId).subscribe(response=>{
      console.log("success!!!")
      Swal.fire('Deleted Successfully !!','welcome  ' + appointmentId, 'success')
      this.ngOnInit()
    },

    error => {
      console.log(error);

      })
   }
  }
}

