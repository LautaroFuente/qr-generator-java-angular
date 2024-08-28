import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SectionQRComponent } from './section-qr.component';

describe('SectionQRComponent', () => {
  let component: SectionQRComponent;
  let fixture: ComponentFixture<SectionQRComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SectionQRComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SectionQRComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
