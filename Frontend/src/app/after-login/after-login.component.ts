import { Component, OnInit } from '@angular/core';
import { Doc } from '../common/doc';
import { LoginService } from '../services/login.service';
import { ModalDismissReasons, NgbModal} from '@ng-bootstrap/ng-bootstrap';

import { LoginComponent } from '../login/login.component';
import { MakeAppointmentComponent } from '../make-appointment/make-appointment.component';
import { SignupComponent } from '../signup/signup.component';

@Component({
  selector: 'app-after-login',
  templateUrl: './after-login.component.html',
  styleUrls: ['./after-login.component.css']
})
export class AfterLoginComponent implements OnInit {
  
  closeResult: any;
  data: any;

  constructor(private login:LoginService,
                private modalService:NgbModal) { }

  listofdocs!: Doc[];
  random!:string;

  ngOnInit(): void {
    this.random = "common man !"
    this.login.getAlldocs().subscribe(data=>{
      this.listofdocs = data;
    });
  }
  
  onClick(doc:any){
    const modalRef = this.modalService.open(MakeAppointmentComponent);

    let data = {
      docId: doc.id,
      userId: localStorage.getItem("userEmail")
    }

    modalRef.componentInstance.fromParent = data;
  }
  

}
