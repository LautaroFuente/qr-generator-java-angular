import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormQRComponent } from './form-qr.component';

describe('FormQRComponent', () => {
  let component: FormQRComponent;
  let fixture: ComponentFixture<FormQRComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormQRComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormQRComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
