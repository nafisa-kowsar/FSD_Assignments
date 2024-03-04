import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from './player';


@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private http: HttpClient) { }

  getPlayersByRole(role: string): Observable<any[]> {
    return this.http.get<any[]>("http://localhost:8081/api/players/get-by-role" + `/${role}`, { responseType: 'text' as 'json' });
  }
}
