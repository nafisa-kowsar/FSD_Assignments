import { Component } from '@angular/core';
import { PlayerService } from '../player.service';
import { Player } from '../player';


@Component({
  selector: 'app-player-role',
  templateUrl: './player-role.component.html',
  styleUrls: ['./player-role.component.css']
})
export class PlayerRoleComponent {


  role: string = '';
  searchResults: Player[] = [];

  constructor(private playerService: PlayerService) { }



  searchByRole(data: any) {

    const role = data.value.role;

    this.playerService.getPlayersByRole(role).subscribe(
      (players: any) => {
        this.searchResults = JSON.parse(players);
        console.log(this.searchResults);


      },
      (error: any) => {
        console.error('Error fetching Players:', error);
        alert('Error fetching Players');
      }
    );



  }

}
