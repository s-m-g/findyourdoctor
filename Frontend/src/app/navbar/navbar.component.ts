import { Component, Injectable, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})

@Injectable()
export class NavbarComponent implements OnInit {
  constructor(private router: Router) { }

  userId!:any;

  ngOnInit(): void {
  }

  isLoggedIn(){
    return localStorage.getItem("userId")
  }

  logOut(){
    localStorage.removeItem("userId");
    this.router.navigate(['/home'])
  }

  getEmail(){
    this.userId =  localStorage.getItem("userId");
    return true;
  }

}
