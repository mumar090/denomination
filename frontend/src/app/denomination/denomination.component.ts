import { Component } from '@angular/core';
import { DenominationService, DenominationRequest, DenominationResponse } from '../services/denomination.service';

@Component({
  selector: 'app-denomination',
  templateUrl: './denomination.component.html',
  styleUrls: ['./denomination.component.css']
})
export class DenominationComponent {

  amount: number = 0;
  result?: DenominationResponse;
  error?: string;

  constructor(private denominationService: DenominationService) {}

  submit() {
    this.error = undefined;
    this.result = undefined;

    const request: DenominationRequest = { amount: this.amount };

    this.denominationService.getBreakdown(request).subscribe({
      next: (res) => this.result = res,
      error: (err) => this.error = 'Error contacting backend'
    });
  }
}
