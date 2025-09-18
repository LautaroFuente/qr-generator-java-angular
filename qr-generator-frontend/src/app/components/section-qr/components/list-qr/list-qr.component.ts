import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { QrInfo } from '../../../../interfaces/QrInfo.model';

@Component({
  selector: 'app-list-qr',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './list-qr.component.html',
  styleUrl: './list-qr.component.css',
})
export class ListQRComponent implements OnInit {
  qrList: QrInfo[] | null = null;

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.getGeneratedQR().subscribe(
      (response) => {
        console.log('Informacion obtenida', response);
        this.qrList = response;
      },
      (error) => console.log(`Error`, error)
    );
  }

  getGeneratedQR(): Observable<any> {
    const url = 'http://backend:8080/api/data';

    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
    });

    return this.http.get(url, { headers });
  }
}
