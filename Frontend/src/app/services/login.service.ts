import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import baseUrl from './helper';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }

  loginUser(loginData: any): Observable<any>{
    return this.http.post(`${baseUrl}/user/login`, loginData)

  }

  isUserLoggedIn(){
    
  }

}
