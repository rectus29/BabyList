import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListRowListComponent } from './list-row-list.component';

describe('ListRowListComponent', () => {
  let component: ListRowListComponent;
  let fixture: ComponentFixture<ListRowListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListRowListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListRowListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
