import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, FormsModule, Validators } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { QRCodeModule } from 'angularx-qrcode';

@Component({
  selector: 'app-form-qr',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule, QRCodeModule],
  templateUrl: './form-qr.component.html',
  styleUrl: './form-qr.component.css'
})
export class FormQRComponent implements OnInit {
  formQr!: FormGroup;
  qrValue: String = "";

  constructor(private fb: FormBuilder) {}

  ngOnInit() {
    this.formQr = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      text: ['', Validators.required],
    });
  }

  onSubmit() {
    if (this.formQr.valid) {
      console.log('Formulario enviado', this.formQr.value);
      
    }
  }
}
