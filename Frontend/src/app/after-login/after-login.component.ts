import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-after-login',
  templateUrl: './after-login.component.html',
  styleUrls: ['./after-login.component.css']
})
export class AfterLoginComponent implements OnInit {

  data: any;

  constructor() { }

  ngOnInit(): void {
    // this.data = localStorage.getItem("userData");
    // console.log(JSON.parse(this.data));
  }

}
