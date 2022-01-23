import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {NgbModal, ModalDismissReasons, NgbActiveModal} from '@ng-bootstrap/ng-bootstrap';
import {NgbDateStruct, NgbCalendar} from '@ng-bootstrap/ng-bootstrap';
import { Appointment } from '../common/appointment';
import { AppointmentService } from '../services/appointment.service';



@Component({
  selector: 'app-make-appointment',
  templateUrl: './make-appointment.component.html',
  styleUrls: ['./make-appointment.component.css']
})




export class MakeAppointmentComponent implements OnInit {

  
  
  @Input() fromParent: any;

  closeResult = '';
  userId!:number;
  docId!:number;

  // appointment={
  //   username:"",
  //   number:"",
  //   appdate:"",
  //   slot:""
  // }

  appointment:Appointment = new Appointment();

  constructor(private router: Router, private modalService: NgbModal,private calendar: NgbCalendar, public activeModal: NgbActiveModal, private app:AppointmentService) {}
  ngOnInit(): void {
    // throw new Error('Method not implemented.');
    this.userId = this.fromParent.userId;
    this.docId = this.fromParent.docId;
    // console.log(this.userId, this.docId);
  }

  open(content: any) {
    this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
  }

  formSubmit(){
    this.appointment.docId=this.docId
    this.appointment.userId=this.userId
    this.app.makeAppointment(this.appointment).subscribe(data=>{
      console.log(data)
      this.modalService.dismissAll()
      alert("appointment successfull")
      this.router.navigate(['/appointment'])
    })
  }

}

 

