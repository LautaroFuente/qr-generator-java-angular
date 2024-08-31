import { Component } from '@angular/core';
import { FormQRComponent } from './components/form-qr/form-qr.component';
import { ListQRComponent } from './components/list-qr/list-qr.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-section-qr',
  standalone: true,
  imports: [FormQRComponent, ListQRComponent, CommonModule],
  templateUrl: './section-qr.component.html',
  styleUrl: './section-qr.component.css'
})
export class SectionQRComponent {

}
