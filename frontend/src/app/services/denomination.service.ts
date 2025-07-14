import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

export interface DenominationRequest {
  amount: number;
}

export interface DenominationResponse {
  originalAmount: number;
  breakdown: { [key: string]: number };
}

@Injectable({
  providedIn: 'root'
})
export class DenominationService {

  private apiUrl = 'http://localhost:8080/api/denomination';

  constructor(private http: HttpClient) { }

  getBreakdown(request: DenominationRequest): Observable<DenominationResponse> {
    return this.http.post<DenominationResponse>(this.apiUrl, request);
  }
}
