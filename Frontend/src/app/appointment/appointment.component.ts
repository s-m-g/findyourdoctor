import { Component, OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import Swal from 'sweetalert2';
import { Appointment } from '../common/appointment';
import { MakeAppointmentComponent } from '../make-appointment/make-appointment.component';
import { AppointmentService } from '../services/appointment.service';

@Component({
  selector: 'app-appointment',
  templateUrl: './appointment.component.html',
  styleUrls: ['./appointment.component.css']
})
export class AppointmentComponent implements OnInit {

  constructor(private service: AppointmentService, private modalService:NgbModal) { }

  appointment!: Appointment[]
  userId!:any
  docId!:any

  ngOnInit(): void {
    this.service.getAppointment(localStorage.getItem("userId")).subscribe(ans=>{
      console.log(ans);
      this.appointment=ans;
    })
  }


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

  updateAppointment(appointment: Appointment){
    console.log(appointment)
    const modalRef = this.modalService.open(MakeAppointmentComponent);

    let data = {
      docId: this.docId,
      userId: this.userId,
      update: true,
      appointmentData: appointment
    }

    modalRef.componentInstance.fromParent = data;
  }
}

