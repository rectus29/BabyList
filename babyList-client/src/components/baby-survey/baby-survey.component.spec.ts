import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BabySurveyComponent } from './baby-survey.component';

describe('BabySurveyComponent', () => {
  let component: BabySurveyComponent;
  let fixture: ComponentFixture<BabySurveyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BabySurveyComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BabySurveyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
