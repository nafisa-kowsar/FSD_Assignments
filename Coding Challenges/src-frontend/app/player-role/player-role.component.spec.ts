import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlayerRoleComponent } from './player-role.component';

describe('PlayerRoleComponent', () => {
  let component: PlayerRoleComponent;
  let fixture: ComponentFixture<PlayerRoleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PlayerRoleComponent]
    });
    fixture = TestBed.createComponent(PlayerRoleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
