import { Injectable } from '@angular/core';
import {ListRow} from "../classes/listRow";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ListRowService {

  private apiUrl: string;

  constructor(private http: HttpClient) {
    this.apiUrl = 'http://localhost:8029/babylist/api/v1/listrows';
  }

  public findAll(): Observable<ListRow[]> {
    return this.http.get<ListRow[]>(this.apiUrl);
  }

  public save(user: ListRow) {
    return this.http.post<ListRow>(this.apiUrl, user);
  }

}
