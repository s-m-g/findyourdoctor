import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import baseUrl from './helper';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }

  docUrl:string = "http://localhost:4001/doc/getAll"

  loginUser(loginData: any): Observable<any>{
    return this.http.post(`${baseUrl}/user/login`, loginData, {responseType: 'text'})

  }

  isUserLoggedIn(){
    
  }

  getAlldocs(): Observable<any>{
    return this.http.get(this.docUrl);
  }

}
