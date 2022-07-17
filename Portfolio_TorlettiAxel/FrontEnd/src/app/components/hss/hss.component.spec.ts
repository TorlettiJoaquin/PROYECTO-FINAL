import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HssComponent } from './hss.component';

describe('HssComponent', () => {
  let component: HssComponent;
  let fixture: ComponentFixture<HssComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HssComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HssComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
