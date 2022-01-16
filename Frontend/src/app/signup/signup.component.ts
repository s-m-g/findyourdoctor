import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from '../services/user.service';
import Swal from 'sweetalert2'
import { FormGroup } from '@angular/forms';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  exform!: FormGroup; 

  constructor(private userService:UserService, private snack: MatSnackBar) { }

  public user = {
    username: '',
    password: '',
    email: '',
    phone: ''
  };
  

  ngOnInit(): void {
  }


 




  formSubmit(){
    // alert("submit");
    console.log(this.user);
    if(this.user.username == '' || this.user.username == 'null'){
      this.snack.open('Username is required !!', '', {
        duration:2000,
        // verticalPosition: 'top',
        // horizontalPosition: 'right'

      });
      return;
    }

    //validate




    // call add user : userservice

    this.userService.addUser(this.user).subscribe((data:any)=>{
      //success 
      console.log(data);
      // alert('success');
      Swal.fire('Successfully Done!!','user id is ' + data.id, 'success')
    },
    (error)=>{
      console.log(error);
      // alert('Something went wrong');
      this.snack.open('Something went wrong' !!, '',
      {
        duration:3000
      });

    }
    );
  }



}
