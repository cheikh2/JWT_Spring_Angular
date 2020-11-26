﻿import { environment } from './../../environments/environment';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  getUserBoard(): Observable<string> {
    return this.http.get(`${environment.apiUrl}/api/test/user`, { responseType: 'text' });
  }

  getPMBoard(): Observable<string> {
    return this.http.get(`${environment.apiUrl}/api/test/pm`, { responseType: 'text' });
  }

  getAdminBoard(): Observable<string> {
    return this.http.get(`${environment.apiUrl}/api/test/admin`, { responseType: 'text' });
  }
}
