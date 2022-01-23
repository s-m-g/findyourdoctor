import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Appointment } from '../common/appointment';

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {

  constructor(private http:HttpClient) { }

  url = "http://localhost:4002/appointment"

  makeAppointment(appointment:Appointment): Observable<any>{
      return this.http.post(this.url+"/create", appointment);
  }

  getAppointment(userId: any): Observable<any>{
    return this.http.get(this.url+"/get/"+userId)
  }
}
