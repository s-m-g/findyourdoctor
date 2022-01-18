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

  userEmail!:any;

  ngOnInit(): void {
  }

  isLoggedIn(){
    return localStorage.getItem("userEmail")
  }

  logOut(){
    localStorage.removeItem("userEmail");
    this.router.navigate(['/home'])
  }

  getEmail(){
    this.userEmail =  localStorage.getItem("userEmail");
    return true;
  }

}
