import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormLibroComponent } from './form-libro.component';

describe('FormLibroComponent', () => {
  let component: FormLibroComponent;
  let fixture: ComponentFixture<FormLibroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormLibroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormLibroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
