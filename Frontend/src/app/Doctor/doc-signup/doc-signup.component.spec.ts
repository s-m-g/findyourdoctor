import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DocSignupComponent } from './doc-signup.component';

describe('DocSignupComponent', () => {
  let component: DocSignupComponent;
  let fixture: ComponentFixture<DocSignupComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DocSignupComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DocSignupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
