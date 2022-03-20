import { TestBed, inject } from '@angular/core/testing';

import { LibroService } from './libro-service.service';

describe('UserServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LibroService]
    });
  });

  it('should be created', inject([LibroService], (service: LibroService) => {
    expect(service).toBeTruthy();
  }));
});
