import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { LoginService } from '../services/login.service';
import {User} from '../common/user'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private snack:MatSnackBar,private login:LoginService,private route:Router) { }

  loginData={
    username: '',
    password: '',
  }


  ngOnInit(): void {
  }

  formSubmit(){
    console.log("login form submitted !!");

    if(this.loginData.username.trim()=='' || this.loginData.username == null) {
      this.snack.open("Username is required !!", '', {
      duration: 3000,
      });
      return;
    }  // trim() is used to check the space

    if(this.loginData.password.trim()=='' || this.loginData.password == null) {
      this.snack.open("Password is required !!", '', {
      duration: 3000,
      });
      return;
    }

    this.login.loginUser(this.loginData).subscribe(
      (data: string)=>{
        // console.log(data);
        // console.log(data.username)
        
        if(data.length==0){
          //  Swal.fire('Wrong username or passord', 'error')
          Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: 'Please enter correct username & password!',
            
          })
        }
        else{
          Swal.fire('Login Successfull !!','welcome  ' + data, 'success')
          localStorage.setItem("userEmail", data)
          this.route.navigate(['/after-login'])
        }
      },
      (error)=>
      {
        console.log('Error !');

        console.log(error);
        
},
      );
    
  }

  isLoggedIn(){

  }

}
