import { Component, OnInit } from '@angular/core';
import {
  FormBuilder,
  FormGroup,
  ReactiveFormsModule,
  FormsModule,
  Validators,
} from '@angular/forms';
import { CommonModule } from '@angular/common';
import { QRCodeModule } from 'angularx-qrcode';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-form-qr',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule, FormsModule, QRCodeModule],
  templateUrl: './form-qr.component.html',
  styleUrl: './form-qr.component.css',
})
export class FormQRComponent implements OnInit {
  formQr!: FormGroup;
  qrValue: string | null = null;
  name: string = '';
  email: string = '';

  constructor(private fb: FormBuilder, private http: HttpClient) {}

  ngOnInit() {
    this.formQr = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      text: ['', Validators.required],
    });
  }

  onSubmit() {
    if (this.formQr.valid) {
      const { name, email, text } = this.formQr.value;
      this.qrValue = text;
      this.name = name;
      this.email = email;
    }
  }

  onDownload() {
    const canvas = document.querySelector('canvas') as HTMLCanvasElement;
    if (canvas) {
      const link = document.createElement('a');
      link.href = canvas.toDataURL('image/png');
      link.download = 'qrcode.png';
      link.click();

      const date = new Date();
      this.sendGeneratedQR(this.name, this.email, date).subscribe(
        (response) => console.log('Informacion guardada', response),
        (error) => console.log(`Error al enviar`, error)
      );
      this.name = '';
      this.email = '';
    }
  }

  sendGeneratedQR(name: string, email: string, date: Date): Observable<any> {
    const url = 'http://localhost:8080/api/data';
    const data = { name, email, date };

    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
    });

    return this.http.post(url, data, { headers });
  }
}
