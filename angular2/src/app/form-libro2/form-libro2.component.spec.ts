import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormLibro2Component } from './form-libro2.component';

describe('FormLibro2Component', () => {
  let component: FormLibro2Component;
  let fixture: ComponentFixture<FormLibro2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormLibro2Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormLibro2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
