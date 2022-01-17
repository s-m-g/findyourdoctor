import { Component, OnInit } from '@angular/core';
import { Doc } from '../common/doc';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-after-login',
  templateUrl: './after-login.component.html',
  styleUrls: ['./after-login.component.css']
})
export class AfterLoginComponent implements OnInit {

  data: any;

  constructor(private login:LoginService) { }
  listofdocs!: Doc[];
  random!:string;

  ngOnInit(): void {
    this.random = "common man !"
    this.login.getAlldocs().subscribe(data=>{
      this.listofdocs = data;
    });
  }

}
