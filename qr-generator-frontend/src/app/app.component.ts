import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SectionQRComponent } from './components/section-qr/section-qr.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, SectionQRComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'qr-generator';
}
