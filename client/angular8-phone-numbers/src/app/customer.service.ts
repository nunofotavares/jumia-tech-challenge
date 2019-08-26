import { Injectable } from '@angular/core';
import { HttpClient , HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private baseUrl = 'http://localhost:8087/api/v1/customers';

  constructor(private http: HttpClient) { }

  getCustomersList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

}
