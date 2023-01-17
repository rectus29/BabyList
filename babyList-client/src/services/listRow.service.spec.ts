import { TestBed } from '@angular/core/testing';

import { ListRowService } from './listRow.service';

describe('ListRowServiceService', () => {
  let service: ListRowService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListRowService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
